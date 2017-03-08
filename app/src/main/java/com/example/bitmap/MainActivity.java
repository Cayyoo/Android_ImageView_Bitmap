package com.example.bitmap;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.bitmap.utils.BitmapUtil;


public class MainActivity extends AppCompatActivity {
    private Activity activity;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;

        init();
    }

    private void init() {
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);
        img5 = (ImageView) findViewById(R.id.img5);
        img6 = (ImageView) findViewById(R.id.img6);
        img7 = (ImageView) findViewById(R.id.img7);
        img8 = (ImageView) findViewById(R.id.img8);

        Bitmap bmp1 = BitmapFactory.decodeResource(getResources(), R.mipmap.img1);
        Bitmap bmp2 = BitmapFactory.decodeResource(getResources(), R.mipmap.img2);
        Bitmap bmp3 = BitmapFactory.decodeResource(getResources(), R.mipmap.img3);
        Bitmap bmp4 = BitmapFactory.decodeResource(getResources(), R.mipmap.img4);
        Bitmap bmp5 = BitmapFactory.decodeResource(getResources(), R.mipmap.img5);
        Bitmap bmp6 = BitmapFactory.decodeResource(getResources(), R.mipmap.img6);

        img1.setImageBitmap(BitmapUtil.generatorNumIcon2(activity, bmp1, true, "9"));
        img2.setImageBitmap(BitmapUtil.generatorNumIcon3(activity, bmp2, true, "16"));
        img3.setImageBitmap(BitmapUtil.generatorStatusIcon(bmp3, activity.getResources(), Color.RED, 12));
        img4.setImageBitmap(BitmapUtil.makeRoundCorner(bmp4));
        img5.setImageBitmap(BitmapUtil.toRoundCorner(bmp4, 4));
        img6.setImageBitmap(BitmapUtil.toRoundCorner_1(bmp4, 25));
        img7.setImageBitmap(BitmapUtil.grey(bmp4));
        img8.setImageBitmap(BitmapUtil.add4Bitmap(bmp5, activity.getResources(), bmp1, bmp2, bmp3, bmp6));
    }

}

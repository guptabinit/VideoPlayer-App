package com.bg.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView earth = findViewById(R.id.videoView);

//        //Full Screen
//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        android.widget.LinearLayout.LayoutParams params = (android.widget.LinearLayout.LayoutParams) earth.getLayoutParams();
//        params.width = metrics.widthPixels;
//        params.height = metrics.heightPixels;
//        params.leftMargin = 0;
//        earth.setLayoutParams(params);

//        //Back to Small Screen
//        DisplayMetrics metrics1 = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics1);
//        android.widget.LinearLayout.LayoutParams params1 = (android.widget.LinearLayout.LayoutParams) earth.getLayoutParams();
//        params1.width = (int)(300*metrics1.density);
//        params1.height = (int)(250*metrics1.density);
//        params1.leftMargin = 30;
//        earth.setLayoutParams(params1);


        earth.setVideoPath("android.resource://" + getPackageName() + "/"+R.raw.earth);
        MediaController mediaController = new MediaController(this);
        earth.setMediaController(mediaController);
        mediaController.setAnchorView(earth);
        earth.start();
    }
}
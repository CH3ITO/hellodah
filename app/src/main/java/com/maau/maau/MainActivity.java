package com.maau.maau;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MainAct","onPause()");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MainAct","onStart()");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("MainAct","onResume()");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("MainAct","onRestart()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("MainAct","onStop()");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MainAct","onDestroy()");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final VideoView miVideo=findViewById(R.id.Video_Main);
        String video1="android.resource://"+getPackageName()+"/"+R.raw.video_f;
        Uri uri=Uri.parse(video1);
        miVideo.setVideoURI(uri);
        MediaController media = new MediaController(this);
        media.setAnchorView(miVideo);
        miVideo.setMediaController(new MediaController(this));
        miVideo.setMediaController(
                new MediaController(this)
        );
        System.out.println("onCreate()");
        Log.d("MainAct","onCreate()");
    }
}
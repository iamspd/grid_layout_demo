package com.example.gridlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonTapped(View view) {

        int id = view.getId();

        String myId = view.getResources().getResourceEntryName(id);

        Log.i(TAG, myId);

        int resourceId = getResources().getIdentifier(myId, "raw", getPackageName());

        MediaPlayer mPlayer = MediaPlayer.create(this, resourceId);
        mPlayer.start();

    }
}
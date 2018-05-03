package com.example.cse15u001.music;

import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Play(View view) {

        if( view == findViewById(R.id.btn1)) {
            mp = MediaPlayer.create(MainActivity.this, Settings.System.DEFAULT_RINGTONE_URI);
            mp.start();
        }
        if( view == findViewById(R.id.button2)) {
            mp = MediaPlayer.create(MainActivity.this, Settings.System.DEFAULT_NOTIFICATION_URI);
            mp.isLooping();
            mp.start();
        }
        if( view == findViewById(R.id.button3)) {
            mp = MediaPlayer.create(MainActivity.this, Settings.System.DEFAULT_ALARM_ALERT_URI);
            mp.start();
        }
    }

    public void Pause(View view) {
        super.onPause();
        mp.release();
    }
}


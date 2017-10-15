package com.example.android.phrasemaster;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mplayer;
    public void buttonTapped(View view)
    {

     int id =view.getId();
     String ourID=view.getResources().getResourceEntryName(id);
        //MediaPlayer mplayer = MediaPlayer.create(this,R.raw.doyouspeakenglish);
     int resourceID = getResources().getIdentifier(ourID,"raw","com.example.android.phrasemaster");
        mplayer = MediaPlayer.create(this,resourceID);
        mplayer.start();
        mplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
        //Log.i("button tapped",ourID);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

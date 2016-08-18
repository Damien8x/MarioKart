package com.example.damie.mariokart;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;



public class MainActivity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button audio = (Button) (findViewById(R.id.audio));

        audio.setOnClickListener(this);

    }
    public void onClick(View v) {
        // do something when the button is clicked

        MediaPlayer mp = MediaPlayer.create(this, R.raw.race);
        mp.start();
    }
}

package com.example.hoontaryi.guessanime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mStartButton;
    Button music;
    Button stopm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //start quiz
        mStartButton = (Button) findViewById(R.id.startButton);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, QuizActivity.class));
            }
        });


        music = (Button) findViewById(R.id.music);
        final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.sukasuka);

        //start music
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });

        //pause for music
        stopm = (Button) findViewById(R.id.stopm);
        stopm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();

            }
        });
    }
}

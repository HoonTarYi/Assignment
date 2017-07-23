package com.example.hoontaryi.guessanime;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OutcomeActivity extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;
    Button rMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outcome);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);
        rMenu = (Button)findViewById(R.id.rmenu);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");


        mFinalScore.setText("You scored " + score + " out of " + QuizList.questions.length);
        // sound effect included
        final MediaPlayer sad = MediaPlayer.create(OutcomeActivity.this, R.raw.sad);
        final MediaPlayer nice = MediaPlayer.create(OutcomeActivity.this, R.raw.nice);

        //commets for the result of the quiz
        if (score == 9){
            mGrade.setText("Outstanding_Rampage");
            nice.start();
        }else if (score == 8){
            mGrade.setText("Well Done Son,Almost");
        }else if (score == 7) {
            mGrade.setText("Nice Try My Dear");

        }else {
            mGrade.setText("Is ok to be Wrong, Try Again...");
            sad.start();
        }

        //To Retry the question from the first question
        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OutcomeActivity.this, QuizActivity.class));
                sad.stop();
                OutcomeActivity.this.finish();

            }
        });


        // return home page (activity_main)
        rMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OutcomeActivity.this, MainActivity.class));
                sad.stop();


            }
        });

    }
}

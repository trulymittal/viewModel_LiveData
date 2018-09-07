package com.example.killer.testvm;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    
    Button addScoreButton, resetScoreButton;
    TextView scoreTextView;

//    Integer score;
    ScoreViewModel scoreViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        scoreTextView = findViewById(R.id.scoreTextView);
        addScoreButton = findViewById(R.id.addScoreButton);
        resetScoreButton = findViewById(R.id.resetScoreButton);

        addScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addScore();
            }
        });

        resetScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetScore();
            }
        });

        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);

        scoreViewModel.getScore().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                scoreTextView.setText(String.valueOf(integer));
            }
        });

//        scoreTextView.setText(String.valueOf(scoreViewModel.getScore()));



//        score = 0;
//        scoreTextView.setText(String.valueOf(score));

    }

    public void addScore() {

        scoreViewModel.addScore();

//        scoreViewModel.addScore();
//        scoreTextView.setText(String.valueOf(scoreViewModel.getScore()));

//        score += 1;
//        scoreTextView.setText(String.valueOf(score));
    }
    
    public void resetScore() {
        scoreViewModel.resetScore();
//        scoreViewModel.resetScore();
//        scoreTextView.setText(String.valueOf(scoreViewModel.getScore()));
//        score = 0;
//        scoreTextView.setText(String.valueOf(score));
    }
    

}

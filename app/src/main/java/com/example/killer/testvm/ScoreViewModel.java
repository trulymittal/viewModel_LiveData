package com.example.killer.testvm;

import android.arch.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel{

    private Integer score;

    public Integer getScore() {
        if (score == null) {
            return 0;
        }
        return score;
    }

    public void addScore() {
        if (score == null) {
            score = 0;
        }
        score += 1;
    }

    public void resetScore() {
        score = 0;
    }

}

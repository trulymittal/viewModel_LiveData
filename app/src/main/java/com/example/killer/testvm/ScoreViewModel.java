package com.example.killer.testvm;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

//    private Integer score;
//
//    public Integer getScore() {
//        if (score == null) {
//            score = 0;
//        }
//        return score;
//    }

    private MutableLiveData<Integer> score;

    public MutableLiveData<Integer> getScore() {
        if (score == null) {
            score = new MutableLiveData<>();
            score.setValue(0);
//            score.postValue(0);    //This is called from a worker thread
        }
        return score;
    }

    public void addScore() {
        if (score.getValue() != null) {
            score.setValue(score.getValue() + 1);
        }
//        if (score == null) {
//            score = 0;
//        }
//        score += 1;
    }

    public void resetScore() {
        score.setValue(0);
//        score = 0;
    }



}

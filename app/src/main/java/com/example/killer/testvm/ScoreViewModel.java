package com.example.killer.testvm;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel{

//    private Integer score;

//    public Integer getScore() {
//        if (score == null) {
//            return 0;
//        }
//        return score;
//    }

    private MutableLiveData<Integer> score;

    public MutableLiveData<Integer> getScore() {
        if (score == null) {
            score = new MutableLiveData<>();
//            score.postValue(0);
            resetScore();
        }
        return score;
    }

    public void addScore() {
        score.setValue(score.getValue() + 1);
    }

    public void resetScore() {
        score.setValue(0);
    }

}

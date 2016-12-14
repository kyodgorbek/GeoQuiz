package com.example.yodgor777.geoquiz;

/**
 * Created by yodgor777 on 2016-12-07.
 */

public class TrueFalse {

    private int mQuestion;


    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean treeQuestion){

        mQuestion = question;

        mTrueQuestion = treeQuestion;

    }


    public int getQuestion(){
        return mQuestion;
    }

    public void setQuestion(int question){
        mQuestion = question;
    }

    public boolean isTrueQuestion(){

        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion){
        mTrueQuestion = trueQuestion;

    }



}

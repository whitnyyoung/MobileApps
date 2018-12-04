package com.techexchange.mobileapps.quizapp2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Question3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_3);
    }

    public void onCorrectAnswerClicked(View view){
        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();

    }

    public void onIncorrectAnswerClicked(View view){
        Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();


    }

    public void onDoneButtonClicked(View view){
        Toast.makeText(this, "Congrats! You have finished the quiz!", Toast.LENGTH_LONG).show();

    }
}


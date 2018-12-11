package com.techexchange.mobileapps.quizapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_2);
    }

    public void onCorrectAnswerClicked(View view){
        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();

    }

    public void onIncorrectAnswerClicked(View view){
        Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();


    }

    public void onNextButtonClicked(View view){
        Intent nextQuestion = new Intent(Question2.this, Question3.class);
        startActivity(nextQuestion);

    }
}


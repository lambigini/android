package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getScore(View view) {
        EditText name = (EditText) findViewById(R.id.editText_name);
        String userName =  name.getText().toString();
    }

    private String createScoreSummary(String userName) {
        String userScore = "Name" + userName;
        return  userScore;
    }
}

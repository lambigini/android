package com.example.android.racingscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreBMW = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScore(int score) {
        TextView updateTextView = (TextView) findViewById(R.id.scoreView_BMW);
        updateTextView.setText(String.valueOf(score));
    }

    public void add10Points(View view) {
        scoreBMW = scoreBMW + 10;
        displayScore(scoreBMW);
    }





}

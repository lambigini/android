package com.example.android.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView changeImage = (ImageView) findViewById(R.id.profile_picture);
        changeImage.setImageResource(R.drawable.s1);



        TextView changeNameTextView = (TextView) findViewById(R.id.name);
        changeNameTextView.setText("Alexander");


        TextView birthdayTextView = (TextView) findViewById(R.id.birthday);
        birthdayTextView.setText("12/07/2013");

        TextView countryTextView = (TextView) findViewById(R.id.country);
        countryTextView.setText("America");
    }

    public void nameTextView(View view) {


    }

    public void birthdayTextView(View view) {


    }

    public void countryTextView(View view) {
    }
}

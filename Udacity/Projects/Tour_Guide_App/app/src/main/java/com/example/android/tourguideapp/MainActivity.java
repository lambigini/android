package com.example.android.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView category_about = findViewById(R.id.category_about);
        TextView category_thingsToDo = findViewById(R.id.category_thingsToDo);
        TextView category_restaurants = findViewById(R.id.category_restaurants);
        TextView category_weather = findViewById(R.id.category_weather);

        category_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_category_about = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent_category_about);
            }
        });

        category_thingsToDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_category_about = new Intent(MainActivity.this, ThingsToDoActivity.class);
                startActivity(intent_category_about);
            }
        });

        category_restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_category_about = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(intent_category_about);
            }
        });

        category_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_category_about = new Intent(MainActivity.this, WeatherActivity.class);
                startActivity(intent_category_about);
            }
        });
    }
}

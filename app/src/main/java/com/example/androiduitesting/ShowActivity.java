package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);


        String CityName = getIntent().getStringExtra("cityName");
        Button BackButton = findViewById(R.id.BackButton);
        TextView text = findViewById(R.id.textView);
        text.setText(CityName);

        BackButton.setOnClickListener(view -> finish()); // returns back to main activity


    }

}

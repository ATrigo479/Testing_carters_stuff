package com.example.testingcartersstuffiguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShotChart extends AppCompatActivity {
    private TextView loca1, loca2, loca3, loca4, loca5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shot_chart);
        loca1 = findViewById(R.id.loc1);
        loca2 = findViewById(R.id.loc2);
        loca3 = findViewById(R.id.loc3);
        loca4 = findViewById(R.id.loc4);
        loca5 = findViewById(R.id.loc5);
        int percent = getIntent().getIntExtra(ShotCounter.PERCENT, 3);
        int loc = getIntent().getIntExtra(ShotCounter.LOCAT, 0);

        if(loc == 1){
            loca1.setText(String.valueOf(percent));
        }

        if(loc== 2){
            loca2.setText(String.valueOf(percent));
        }
        if(loc== 3){
            loca3.setText(String.valueOf(percent));
        }
        if(loc== 4){
            loca4.setText(String.valueOf(percent));
        }
        if(loc== 5){
            loca5.setText(String.valueOf(percent));
        }



    }

}
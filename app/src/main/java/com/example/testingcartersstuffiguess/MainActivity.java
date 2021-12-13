package com.example.testingcartersstuffiguess;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   public static final String LOC = "loc";
   private TextView textView1;
   private Button goToShotCounter;
   private RadioGroup shotLocations;

   Integer loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shotLocations = findViewById(R.id.shot_places);
        goToShotCounter =  findViewById(R.id.goto_shotchart);
        textView1 = findViewById(R.id.textView);
        goToShotCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToShotCounterc(view);

            }
        });
        shotLocations.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.location1:
                        setLoc(1);
                        break;
                    case R.id.location2:
                        setLoc(2);
                        break;
                    case R.id.lacation3:
                        setLoc(3);
                        break;
                    case R.id.location4:
                        setLoc(4);
                        break;
                    case R.id.location5:
                        setLoc(5);
                        break;
                }
            }
        });

    }


    public void goToShotCounterc(View view){
        Intent intent = new Intent(MainActivity.this, ShotCounter.class);
        Integer rin = loc;
        intent.putExtra(LOC, rin);
        //setText();
        startActivity(intent);
    }
    public void setLoc(Integer i){
        loc = i;
    }
    public void setText(){
        textView1.setText(String.valueOf(loc));
        Intent intent = new Intent(MainActivity.this, ShotChart.class);

    }




}
package com.example.testingcartersstuffiguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShotCounter extends AppCompatActivity {
    private Button goToShotChart;
    private Button makeShotButton;
    private Button missShotButton;
    private TextView missShotTV, makeShotTV,textView;
    private Counter counter;
    public static final String PERCENT = "loc1";
    public static final String LOCAT = "wee";
    private int row;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shot_counter);



        int loc = getIntent().getIntExtra(MainActivity.LOC, 0);
        row = loc;
        textView = findViewById(R.id.textView2);
        missShotButton = findViewById(R.id.miss_button);
        makeShotButton =  findViewById(R.id.make_button);
        goToShotChart =  findViewById(R.id.goto_shotchart);
        missShotTV = findViewById(R.id.miss_shot_tv);
        makeShotTV =  findViewById(R.id.make_shot_tv);
        counter = new Counter();

        textView.setText(String.valueOf(loc));
        goToShotChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToShotChart(view);

            }
        });
    }
    public void goToShotChart(View view){
        counter.setPercent();
        Integer percent = counter.getPercent();
        Intent intent = new Intent(ShotCounter.this, ShotChart.class);
        Integer lick = row;
        intent.putExtra(LOCAT, lick);
        intent.putExtra(PERCENT, percent);
        startActivity(intent);
    }
    public void make(View view){
        counter.makeShot();
        makeShotTV.setText(String.valueOf(counter.getMakeShot()));
    }
    public void miss(View view){
        counter.missShot();
        missShotTV.setText(String.valueOf(counter.getMissShot()));
    }
}
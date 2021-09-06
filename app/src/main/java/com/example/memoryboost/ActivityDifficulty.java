package com.example.memoryboost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityDifficulty extends AppCompatActivity {
    private Button buttonEasy;
    private Button buttonMedium;
    private Button buttonHard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        buttonEasy = (Button) findViewById(R.id.buttonEasy);
        buttonEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityEasy();
            }
        });

        buttonMedium = (Button) findViewById(R.id.buttonMedium);
        buttonMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMedium();
            }
        });

        buttonHard = (Button) findViewById(R.id.buttonHard);
        buttonHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityHard();
            }
        });

    }
    public void openActivityEasy(){
        Intent intentE = new Intent(this, ActivityEasy.class);
        startActivity(intentE);
    }
    public void openActivityMedium(){
        Intent intentM = new Intent(this, ActivityMedium.class);
        startActivity(intentM);
    }
    public void openActivityHard(){
        Intent intentH = new Intent(this, ActivityHard.class);
        startActivity(intentH);
    }
}
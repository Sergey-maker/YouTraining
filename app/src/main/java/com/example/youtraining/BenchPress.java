package com.example.youtraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BenchPress extends AppCompatActivity {

    private Button WhatAboutBenchPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bench_press);

        WhatAboutBenchPress = (Button) findViewById(R.id.WhatAboutBenchPress);
        WhatAboutBenchPress.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                openWhatBenchPress();
            }
        });
    }

    public void openWhatBenchPress(){
        Intent intent = new Intent(this, WhatBenchPress.class);
        startActivity(intent);
    }
}
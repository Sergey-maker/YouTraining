package com.example.youtraining;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class WarmUP extends AppCompatActivity {

    private Button WhatButton;
    private Button NextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warm_up);

        WhatButton = (Button) findViewById(R.id.WhatButton);
        WhatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PageWhatWarmUP();
            }
        });

        NextPage = (Button) findViewById(R.id.NextPage);
        NextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NextPageWarmUP();
            }
        });
    }

    public void PageWhatWarmUP(){
        Intent intent = new Intent(this,WhatWarmUP.class);
        startActivity(intent);
    }

    public void NextPageWarmUP(){
        Intent intent = new Intent(this,WarmUP2.class);
        startActivity(intent);
    }
}
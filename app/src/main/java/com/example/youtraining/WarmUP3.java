package com.example.youtraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WarmUP3 extends AppCompatActivity {
    private Button NextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warm_up3);

        NextPage = (Button) findViewById(R.id.NextPage);
        NextPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                NextPage1();
            }
        });
    }

    public void NextPage1(){
        Intent intent = new Intent(this,WarmUP4.class);
        startActivity(intent);
    }
}
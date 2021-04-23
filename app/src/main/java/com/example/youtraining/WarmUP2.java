package com.example.youtraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WarmUP2 extends AppCompatActivity {

    private Button NextPage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warm_up2);

        NextPage3 = (Button) findViewById(R.id.NextPage3);
        NextPage3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                NextPage3();
            }
        });
    }

    public void NextPage3(){
        Intent intent1 = new Intent(this,WarmUP3.class);
        startActivity(intent1);
    }
}
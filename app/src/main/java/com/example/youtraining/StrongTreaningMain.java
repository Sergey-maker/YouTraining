package com.example.youtraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StrongTreaningMain extends AppCompatActivity {

    private Button WarmUP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strong_treaning_main);

        WarmUP = (Button) findViewById(R.id.WarmUP);
        WarmUP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openWarmUP();
            }
        });
    }

    public void openWarmUP(){
        Intent intent = new Intent(this,WarmUP.class);
        startActivity(intent);
    }
}
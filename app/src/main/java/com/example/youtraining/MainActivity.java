package com.example.youtraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button StrongButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrongButton = (Button) findViewById(R.id.StrongButton);
        StrongButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                openStrongActivity();
            }
        });
    }

    public void openStrongActivity(){
        Intent intent = new Intent(this,StrongTreaningMain.class);
        startActivity(intent);
    }
}
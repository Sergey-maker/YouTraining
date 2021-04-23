package com.example.youtraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WarmUP5 extends AppCompatActivity {

    private Button MainMenuStrongActivity;
    private Button MainMenus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warm_up5);

        MainMenuStrongActivity = (Button) findViewById(R.id.MainMenuStrongActivity);
        MainMenuStrongActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                MainPage();
            }
        });

        MainMenus = (Button) findViewById(R.id.MainMenus);
        MainMenus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                mainMenu();
            }
        });
    }

    public void MainPage(){
        Intent intent = new Intent(this,StrongTreaningMain.class);
        startActivity(intent);
    }

    public void mainMenu(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
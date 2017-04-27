package com.example.stephanie.cs499;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tutorialsButton = (Button) findViewById(R.id.tutorials);
        tutorialsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TutorialsActivity.class));
            }
        });

        Button tipsButton = (Button) findViewById(R.id.tips);
        tipsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, TipsActivity.class));
            }
        });

        Button popularButton = (Button) findViewById(R.id.popular);
        popularButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, PopularActivity.class));
            }
        });
    }
}

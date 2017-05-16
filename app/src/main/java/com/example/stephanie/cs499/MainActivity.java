package com.example.stephanie.cs499;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Typeface;
import android.content.Context;
public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.tutorialsButton);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView.setTypeface(typeface);

        TextView myTextView1 = (TextView) findViewById(R.id.tipsButton);
        Typeface typeface1=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView1.setTypeface(typeface1);

        TextView myTextView2 = (TextView) findViewById(R.id.popularButton);
        Typeface typeface2=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView2.setTypeface(typeface2);

        Button tutorialsButton = (Button) findViewById(R.id.tutorialsButton);
        tutorialsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TutorialsActivity.class));
            }
        });

        Button tipsButton = (Button) findViewById(R.id.tipsButton);
        tipsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, TipsActivity.class));
            }
        });

        Button popularButton = (Button) findViewById(R.id.popularButton);
        popularButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, PopularActivity.class));
            }
        });
    }
}

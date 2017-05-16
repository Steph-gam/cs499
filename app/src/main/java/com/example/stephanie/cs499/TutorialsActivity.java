package com.example.stephanie.cs499;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Stephanie on 4/26/17.
 */
public class TutorialsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        TextView myTextView = (TextView) findViewById(R.id.tutorials);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView.setTypeface(typeface);

        TextView myTextView2 = (TextView) findViewById(R.id.tutorials2);
        Typeface typeface2=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView2.setTypeface(typeface2);

        TextView myTextView3 = (TextView) findViewById(R.id.tutorials3);
        Typeface typeface3=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView3.setTypeface(typeface3);

        TextView myTextView4 = (TextView) findViewById(R.id.tutorials4);
        Typeface typeface4=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView4.setTypeface(typeface4);

        TextView myTextView5 = (TextView) findViewById(R.id.tutorials5);
        Typeface typeface5=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView5.setTypeface(typeface5);

        TextView myTextView6 = (TextView) findViewById(R.id.tutorials6);
        Typeface typeface6=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView6.setTypeface(typeface6);

        TextView myTextView7 = (TextView) findViewById(R.id.tutorials7);
        Typeface typeface7=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView7.setTypeface(typeface7);

        TextView myTextView8 = (TextView) findViewById(R.id.tutorials8);
        Typeface typeface8=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView8.setTypeface(typeface8);

        TextView myTextView9 = (TextView) findViewById(R.id.tutorials9);
        Typeface typeface9=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView9.setTypeface(typeface9);

        TextView myTextView10 = (TextView) findViewById(R.id.tutorials10);
        Typeface typeface10=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView10.setTypeface(typeface10);

        Button tutorials2 = (Button) findViewById(R.id.tutorials2);
        tutorials2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TutorialsActivity.this, EyelinerActivity.class));
            }
        });

        Button tutorials5 = (Button) findViewById(R.id.tutorials5);
        tutorials5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TutorialsActivity.this, EyeshadowActivity.class));
            }
        });

        Button tutorials7 = (Button) findViewById(R.id.tutorials7);
        tutorials7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TutorialsActivity.this, ContouringActivity.class));
            }
        });

        Button tutorials4 = (Button) findViewById(R.id.tutorials4);
        tutorials4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TutorialsActivity.this, EyelashesActivity.class));
            }
        });

        Button tutorials8 = (Button) findViewById(R.id.tutorials8);
        tutorials8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TutorialsActivity.this, LipsActivity.class));
            }
        });

        Button tutorials9 = (Button) findViewById(R.id.tutorials9);
        tutorials9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TutorialsActivity.this, GlitterActivity.class));
            }
        });

        Button tutorials3 = (Button) findViewById(R.id.tutorials3);
        tutorials3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TutorialsActivity.this, EyebrowsActivity.class));
            }
        });

        Button tutorials6 = (Button) findViewById(R.id.tutorials6);
        tutorials6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TutorialsActivity.this, FoundationActivity.class));
            }
        });

        Button tutorials10 = (Button) findViewById(R.id.tutorials10);
        tutorials10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TutorialsActivity.this, CheeksActivity.class));
            }
        });

    }
}

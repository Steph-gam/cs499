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
public class PopularActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);

        TextView myTextView = (TextView) findViewById(R.id.popular);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView.setTypeface(typeface);

        TextView myTextView2 = (TextView) findViewById(R.id.popular2);
        Typeface typeface2=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView2.setTypeface(typeface2);

        TextView myTextView3 = (TextView) findViewById(R.id.popular3);
        Typeface typeface3=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView3.setTypeface(typeface3);

        TextView myTextView4 = (TextView) findViewById(R.id.popular4);
        Typeface typeface4=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView4.setTypeface(typeface4);

        TextView myTextView5 = (TextView) findViewById(R.id.popular5);
        Typeface typeface5=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView5.setTypeface(typeface5);

        TextView myTextView6 = (TextView) findViewById(R.id.popular6);
        Typeface typeface6=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView6.setTypeface(typeface6);

        TextView myTextView7 = (TextView) findViewById(R.id.popular7);
        Typeface typeface7=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView7.setTypeface(typeface7);

        TextView myTextView8 = (TextView) findViewById(R.id.popular8);
        Typeface typeface8=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView8.setTypeface(typeface8);

        TextView myTextView9 = (TextView) findViewById(R.id.popular9);
        Typeface typeface9=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView9.setTypeface(typeface9);

    }
}

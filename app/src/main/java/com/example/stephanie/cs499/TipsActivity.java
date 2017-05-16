package com.example.stephanie.cs499;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
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
public class TipsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        TextView myTextView = (TextView) findViewById(R.id.textView);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView.setTypeface(typeface);

        TextView myTextView2 = (TextView) findViewById(R.id.textView2);
        Typeface typeface2=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView2.setTypeface(typeface2);

        TextView myTextView3 = (TextView) findViewById(R.id.textView3);
        Typeface typeface3=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView3.setTypeface(typeface3);

        TextView myTextView4 = (TextView) findViewById(R.id.textView4);
        Typeface typeface4=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView4.setTypeface(typeface4);

        TextView myTextView5 = (TextView) findViewById(R.id.textView5);
        Typeface typeface5=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView5.setTypeface(typeface5);

        TextView myTextView6 = (TextView) findViewById(R.id.textView6);
        Typeface typeface6=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView6.setTypeface(typeface6);

        TextView myTextView7 = (TextView) findViewById(R.id.textView7);
        Typeface typeface7=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView7.setTypeface(typeface7);

        TextView myTextView8 = (TextView) findViewById(R.id.textView8);
        Typeface typeface8=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView8.setTypeface(typeface8);

        TextView myTextView9 = (TextView) findViewById(R.id.textView9);
        Typeface typeface9=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView9.setTypeface(typeface9);

        TextView myTextView10 = (TextView) findViewById(R.id.textView10);
        Typeface typeface10=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView10.setTypeface(typeface10);

        TextView myTextView11 = (TextView) findViewById(R.id.textView11);
        Typeface typeface11=Typeface.createFromAsset(getAssets(), "fonts/sk-modernist-bold.ttf");
        myTextView11.setTypeface(typeface11);


    }
}

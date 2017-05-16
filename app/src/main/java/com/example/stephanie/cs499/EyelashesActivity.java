package com.example.stephanie.cs499;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
/**
 * Created by Stephanie on 5/15/17.
 */

public class EyelashesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eyelashes);

        TextView myTextView = (TextView) findViewById(R.id.eyelashes);
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

    }
}

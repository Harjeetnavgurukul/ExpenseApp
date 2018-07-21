package com.draw.expenceapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ExpenseApp extends AppCompatActivity {

    TextView txt;
    Typeface myFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_app);

        txt = findViewById(R.id.name);
        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/abc.ttf");
        txt.setTypeface(myFont);


    }
}

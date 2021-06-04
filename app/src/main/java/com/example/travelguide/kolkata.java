package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class kolkata extends AppCompatActivity {
    TextView mMemorial, mkolkata, mPlace1, mPlace2, mPlace3, mPlace4;
    ImageView mVictoria, mVictoria1, mVictoria2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolkata);

        mMemorial = findViewById(R.id.textView62);
        mkolkata = findViewById(R.id.textView72);
        mVictoria = findViewById(R.id.imageView2);
        mPlace1 = findViewById(R.id.textView82);
        mPlace2 = findViewById(R.id.textView92);
        mPlace3 = findViewById(R.id.textView112);
        mPlace4 = findViewById(R.id.textView102);
        mVictoria1 = findViewById(R.id.imageView52);
        mVictoria2 = findViewById(R.id.imageView62);
    }
}
package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Delhi extends AppCompatActivity {
    TextView mRoom, mTitle, mTitle1, mTitle2, mTitle3, mTitle4;
    ImageView mTaj, mTaj2, mTaj3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);

        mRoom = findViewById(R.id.textView63);
        mTitle = findViewById(R.id.textView73);
        mTaj = findViewById(R.id.imageView3);
        mTitle1 = findViewById(R.id.textView83);
        mTitle2 = findViewById(R.id.textView93);
        mTitle3 = findViewById(R.id.textView103);
        mTitle4 = findViewById(R.id.textView113);
        mTaj2 = findViewById(R.id.imageView53);
        mTaj3 = findViewById(R.id.imageView63);


    }
}
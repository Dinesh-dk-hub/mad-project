package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Chennai extends AppCompatActivity {
    TextView mMarina, mChennai, mChennai2, mChennai3, mChennai4, mChennai5;
    ImageView mImage, mImage2, mImage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_activityy);

        mMarina = findViewById(R.id.textView61);
        mChennai = findViewById(R.id.textView71);
        mImage = findViewById(R.id.imageView1);
        mChennai2 = findViewById(R.id.textView51);
        mChennai3 = findViewById(R.id.textView91);
        mChennai4 = findViewById(R.id.textView111);
        mChennai5 = findViewById(R.id.textView101);
        mImage2 = findViewById(R.id.imageView51);
        mImage3 = findViewById(R.id.imageView61);



    }
}
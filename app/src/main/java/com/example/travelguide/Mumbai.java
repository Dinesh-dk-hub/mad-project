package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Mumbai extends AppCompatActivity {
    TextView mGateway, mText, mText1, mText2, mText3, mText4;
    ImageView mPhoto, mPhoto2, mPhoto3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);

        mGateway = findViewById(R.id.textView64);
        mText = findViewById(R.id.textView74);
        mPhoto = findViewById(R.id.imageView4);
        mText1 = findViewById(R.id.textView84);
        mText2 = findViewById(R.id.textView94);
        mText3 = findViewById(R.id.textView104);
        mText3 = findViewById(R.id.textView114);
        mPhoto2 = findViewById(R.id.imageView54);
        mPhoto3 = findViewById(R.id.imageView64);
    }
}
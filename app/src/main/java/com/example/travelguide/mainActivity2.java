package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class mainActivity2 extends AppCompatActivity {
    Button btnChennai, btnDelhi, btnKolkata, btnMumbai;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnChennai = findViewById(R.id.button5);
        btnDelhi = findViewById(R.id.button8);
        btnKolkata = findViewById(R.id.button7);
        btnMumbai = findViewById(R.id.button6);

        btnChennai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainActivity2.this, Chennai.class);
                startActivity(intent);
            }

        });

        btnDelhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainActivity2.this, Delhi.class);
                startActivity(intent);
            }

        });
        btnKolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainActivity2.this, kolkata.class);
                startActivity(intent);
            }

        });
        btnMumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainActivity2.this, Mumbai.class);
                startActivity(intent);
            }

        });

    }

}
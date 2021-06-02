package com.example.travelguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    EditText emailID, password;
    Button btnSignIn;
    TextView tvSignUp;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);

        mFirebaseAuth = FirebaseAuth.getInstance();
        emailID = findViewById(R.id.editTextTextEmailAddress2);
        password = findViewById(R.id.editTextTextPassword2);
        btnSignIn = findViewById(R.id.button2);
        tvSignUp = findViewById(R.id.textView3);

        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if( mFirebaseUser != null ){
                    Toast.makeText(LoginActivity.this,"You are logged in",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(i);

                }
                else{
                    Toast.makeText(LoginActivity.this,"Please Login",Toast.LENGTH_SHORT).show();
                }



            }
        };

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String email = emailID.getText().toString().trim();
                String pwd = password.getText().toString().trim();
                if(email.isEmpty()){
                    emailID.setError("Please enter email id");
                    emailID.requestFocus();
                }
                if(pwd.isEmpty()){
                    password.setError("Please enter your password");
                    password.requestFocus();
                }
                if(email.isEmpty() && pwd.isEmpty()){
                    Toast.makeText(LoginActivity.this,"Fields Are Empty!",Toast.LENGTH_SHORT).show();
                }
                if(!(email.isEmpty() && pwd.isEmpty())){
                    mFirebaseAuth.signInWithEmailAndPassword(email, pwd).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(LoginActivity.this,"Login Error, Please Login Again",Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Intent intToHome = new Intent(LoginActivity.this,HomeActivity.class);
                                startActivity(intToHome);
                            }
                        }
                    });
                }

            }
        });
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intSignUp = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intSignUp);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }
}

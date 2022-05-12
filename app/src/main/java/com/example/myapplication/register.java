package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class register extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth; // 파이어베이스 인증처리
    private DatabaseReference mDatabaseRef;
    private EditText mEmaileditText, mPassword, mPassword2;
    private Button msignUpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference();

        mEmaileditText = findViewById(R.id.EmaileditText);
        mPassword = findViewById(R.id.Password);
        mPassword2 = findViewById(R.id.Password2);
        msignUpbtn = findViewById(R.id.signUpbtn);

        msignUpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //회원가입 처리 시작

            }
        });

    }

}
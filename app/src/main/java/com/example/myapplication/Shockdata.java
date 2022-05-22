package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Shockdata extends AppCompatActivity {

    TextView tv_shockpart_value;
    TextView tv_shocktime_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shockdata);

        Button btnGetData = findViewById(R.id.btn_get_data);
        tv_shockpart_value = findViewById(R.id.tv_shockpart_value);
        tv_shocktime_value = findViewById(R.id.tv_shocktime_value);

        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGetData();

            }
        });
    }


    private void onClickGetData(){
        // Write a message to the database
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference();
        // Read from the database
        databaseReference.child("shockread/shockpart").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String stringValue = snapshot.getValue(String.class);
                tv_shockpart_value.setText(stringValue);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        databaseReference.child("shockread/shocktime").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String stringValue = snapshot.getValue(String.class);
                tv_shocktime_value.setText(stringValue);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    };



}
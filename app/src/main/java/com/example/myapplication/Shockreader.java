package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Shockreader extends AppCompatActivity {

    DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mConditionRef = mDatabase.child("shockread").child("shockpart");
    DatabaseReference mConditionRef1 = mDatabase.child("shocktime").child("time");
    TextView textView;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shockreader);

        textView = (TextView) findViewById(R.id.tv_shockpart_value);
        textView1 = (TextView) findViewById(R.id.tv_shocktime_value);

        Button btnback = (Button) findViewById(R.id.btn_get_data1);
        btnback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Shockreader.this, MainActivity.class);
                startActivity(intent); }});
    }

    @Override
    protected void onStart() {
        super.onStart();

        mConditionRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                textView.setText(name);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
        mConditionRef1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                textView1.setText(name);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }

}
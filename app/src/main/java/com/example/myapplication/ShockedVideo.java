package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShockedVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shocked_video);

        Button video1 = (Button) findViewById(R.id.btn_video1);
        video1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ShockedVideo.this, video1.class);
                startActivity(intent); }});

        Button video2 = (Button) findViewById(R.id.btn_video2);
        video2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ShockedVideo.this, Video2.class);
                startActivity(intent); }});

        Button video3 = (Button) findViewById(R.id.btn_video3);
        video3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ShockedVideo.this, Video3.class);
                startActivity(intent); }});

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ShockedVideo.this, MainActivity.class);
                startActivity(intent); }});
    }
}
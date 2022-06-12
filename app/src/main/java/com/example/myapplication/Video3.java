package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class Video3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video3);
        //artivitiy_video.xml에 있는 VidioView
        final VideoView videoview=(VideoView)findViewById(R.id.btn_videoView3);
        //Video View에서 보여줄 동영상주소.
        Uri url= Uri.parse("https://firebasestorage.googleapis.com/v0/b/practice-project-68870.appspot.com/o/mp4%20Test%2FTest_20220425_041632.mp4?alt=media&token=e1085b5a-b969-4135-b436-8a49d1244e81");
        videoview.setVideoURI(url);
        //비디오 컨트롤바.
        videoview.setMediaController(new MediaController(this));
        //videoview.start();

        Button back3 = (Button) findViewById(R.id.btn_back3);
        back3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Video3.this, ShockedVideo.class);
                startActivity(intent); }});
    }
}

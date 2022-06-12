package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class video1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1);
        //artivitiy_video.xml에 있는 VidioView
        final VideoView videoview=(VideoView)findViewById(R.id.btn_videoView1);
        //Video View에서 보여줄 동영상주소.
        Uri url= Uri.parse("https://firebasestorage.googleapis.com/v0/b/practice-project-68870.appspot.com/o/mp4%20Test%2FTest_20220425_040926.mp4?alt=media&token=b97aeb2b-af05-44cb-9ec2-e0513b3e0953");
        videoview.setVideoURI(url);
        //비디오 컨트롤바.
        videoview.setMediaController(new MediaController(this));
        //videoview.start();

        Button back1 = (Button) findViewById(R.id.btn_back1);
        back1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(video1.this, ShockedVideo.class);
                startActivity(intent); }});
    }
}

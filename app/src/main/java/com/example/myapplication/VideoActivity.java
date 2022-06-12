package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        //artivitiy_video.xml에 있는 VidioView
        final VideoView videoview=(VideoView)findViewById(R.id.videoView);
        //Video View에서 보여줄 동영상주소.
        Uri url= Uri.parse("https://ykarr.github.io/web/test.mp4");
        videoview.setVideoURI(url);
        //비디오 컨트롤바.
        videoview.setMediaController(new MediaController(this));
        //videoview.start();
    }
}

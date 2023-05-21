package com.example.projek;


import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class punggung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_punggung);

        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.dada;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
    }
}
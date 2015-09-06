package com.warunyu.musiccourseacademy;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class ClassOne extends AppCompatActivity {

    private Button ClickOn;
    private TextView TextAnime;
    private ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_one);

        ClickOn = (Button) findViewById(R.id.btn_anime);
        TextAnime = (TextView) findViewById(R.id.txt_anime);
        img1 = (ImageView) findViewById(R.id.imageView1);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator anime = ObjectAnimator.ofFloat(img1, View.ALPHA, 0f);
                anime.setDuration(1000);
                anime.start();
            }
        });

        ClickOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Bounce).duration(700).playOn(TextAnime);
            }
        });

    }
}

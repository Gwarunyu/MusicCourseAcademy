package com.warunyu.musiccourseacademy;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    TextView txtAdvice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyPageAdapter adapter = new MyPageAdapter(getSupportFragmentManager());
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        pager.setPageTransformer(true, new MyPageTransformer());

        Typeface typeface = Typeface.createFromAsset(getAssets(), "Aller_Lt.ttf");
        txtAdvice = (TextView) findViewById(R.id.textViewAdvice);
        txtAdvice.setTypeface(typeface);

    }


    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setTitle("Exit Confirm").setMessage("Do u wanna Exit").setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        })
                .setNegativeButton("No", null).show();

    }

}

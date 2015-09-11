package com.warunyu.musiccourseacademy;

import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
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
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ClassOne extends AppCompatActivity {

    TextView text1,text2,text3;
Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_one);

        btn_next = (Button) findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClassOne.this,Practice1.class);
                startActivity(intent);
                finish();
            }
        });

        text1 = (TextView) findViewById(R.id.txt1);
        text2 = (TextView) findViewById(R.id.txt2);
        text3 = (TextView) findViewById(R.id.txt3);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "Aller_Lt.ttf");
        text1.setTypeface(typeface);
        text2.setTypeface(typeface);
        text3.setTypeface(typeface);

        /*AdRequest.Builder adBuilder = new AdRequest.Builder();
        AdRequest adRequest = adBuilder.build();
        AdView adView = (AdView)findViewById(R.id.adView);
        adView.loadAd(adRequest);*/

    }

    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setTitle("Exit Confirm").setMessage("Do u wanna Exit This Course").setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        })
                .setNegativeButton("No", null).show();

    }

}

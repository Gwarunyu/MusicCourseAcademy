package com.warunyu.musiccourseacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import java.util.logging.LogRecord;

public class SplashScreen extends AppCompatActivity {

    Handler handler;
    Runnable runAble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_splash_screen);

        handler = new Handler();

        runAble = new Runnable() {
            public void run() {
                Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        };

    }

    public void onResume() {
        super.onResume();
        handler.postDelayed(runAble, 3000);
    }

    public void onStop() {
        super.onStop();
        handler.removeCallbacks(runAble);
    }

}

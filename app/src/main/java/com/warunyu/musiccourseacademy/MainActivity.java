package com.warunyu.musiccourseacademy;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    //private final String KEY_USERNAME = "username";
    //private final String KEY_LEVEL = "MyLevel";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyPageAdapter adapter = new MyPageAdapter(getSupportFragmentManager());
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);
        /*SharedPreferences sp = getSharedPreferences("pref_user", MODE_PRIVATE);
        int user_level = sp.getInt("MyLevel", -1);

        txt_username = (TextView) findViewById(R.id.txtUsername);
        txt_username.setText(sp.getString(KEY_USERNAME, ""));

        txt_level = (TextView) findViewById(R.id.txtLevel);
        txt_level.setText(String.valueOf(user_level));
            */

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

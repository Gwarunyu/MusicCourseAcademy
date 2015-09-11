package com.warunyu.musiccourseacademy;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Practice1 extends AppCompatActivity {

    Button finishClick;

    private SharedPreferences.Editor mEditor;

    private final String KEY_PREFS = "pref_user";
    private final String KEY_USERNAME = "username";
    private final String KEY_LEVEL = "MyLevel";

    TextView txtName;
    TextView txtLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice1);

        final SharedPreferences sp = getSharedPreferences("pref_user", MODE_PRIVATE);
        final int user_level = sp.getInt("MyLevel", -1);

        txtName = (TextView) findViewById(R.id.txt_name_prac1);
        txtName.setText(sp.getString(KEY_USERNAME, ""));

        txtLV = (TextView) findViewById(R.id.txt_level_prac1);
        txtLV.setText(String.valueOf(user_level));

        finishClick = (Button) findViewById(R.id.btn_finish);
        finishClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (user_level == 1) {

                    mEditor = sp.edit();
                    mEditor.putInt("MyLevel", user_level + 1);
                    mEditor.commit();

                    Intent intent = new Intent(Practice1.this, CourseActivity.class);
                    startActivity(intent);
                    finish();

                }

                if(user_level > 1){
                    Intent intent = new Intent(Practice1.this, CourseActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

    }


    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setTitle("Exit Confirm").setMessage("Do u wanna Exit This Practice").setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        })
                .setNegativeButton("No", null).show();

    }

}

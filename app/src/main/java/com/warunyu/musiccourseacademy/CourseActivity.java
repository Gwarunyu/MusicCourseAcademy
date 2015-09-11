package com.warunyu.musiccourseacademy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class CourseActivity extends AppCompatActivity {

    private SharedPreferences.Editor mEditor;

    private final String KEY_PREFS = "pref_user";
    private final String KEY_USERNAME = "username";
    private final String KEY_LEVEL = "MyLevel";

    Button btn_course_1;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        final SharedPreferences sp = getSharedPreferences("pref_user", MODE_PRIVATE);
        final int user_level = sp.getInt("MyLevel", -1);

        if (user_level > 1) {
            txt1= (TextView) findViewById(R.id.textView1);
            txt1.setText("Pass");
        }

        btn_course_1 = (Button) findViewById(R.id.btn_course_1);
        btn_course_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this, ClassOne.class);
                startActivity(intent);
            }
        });


    }
}

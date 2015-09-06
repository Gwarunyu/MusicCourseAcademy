package com.warunyu.musiccourseacademy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);


        Integer[] resID = {R.drawable.ic_launcher,
                R.drawable.ic_launcher,
                R.drawable.ic_launcher,
                R.drawable.ic_launcher,
                R.drawable.ic_launcher};

        String[] strTitle = {"Lesson 1", "Lesson 2", "Lesson 3", "Lesson 4", "Lesson 5"};

        String[] strDesc = {"Chord", "Note", "Scale", "Jazz", "Classic"};

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), strTitle, strDesc, resID);

        ListView listView = (ListView) findViewById(R.id.listViewCourse);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Intent intent;
                switch (arg2){
                    case 0 : intent = new Intent(getApplicationContext(),ClassOne.class);
                        startActivity(intent);
                        break;
                    case 1 : intent = new Intent(getApplicationContext(),CourseActivity.class);
                        startActivity(intent);
                        break;
                    case 2 : intent = new Intent(getApplicationContext(),CourseActivity.class);
                        startActivity(intent);
                        break;
                    case 3 : intent = new Intent(getApplicationContext(),CourseActivity.class);
                        startActivity(intent);
                        break;
                    case 4 : intent = new Intent(getApplicationContext(),CourseActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}

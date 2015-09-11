package com.warunyu.musiccourseacademy;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class LoginActivity extends AppCompatActivity {

    private Button mLogIn;
    private EditText mUsername;
    private EditText mPassword;
    private Context mContext;
    private TextView mRegister;
    private RelativeLayout relative_layout;


    private UserManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mContext = this;

        mManager = new UserManager(this);

        mLogIn = (Button) findViewById(R.id.button_login);
        mUsername = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);
        mRegister = (TextView) findViewById(R.id.register);
        relative_layout = (RelativeLayout) findViewById(R.id.relative_layout);

        mLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                YoYo.with(Techniques.Pulse).duration(300).playOn(mLogIn);
                checkLogIn();
            }
        });

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });



    }

    public void onResume() {
        super.onResume();

    }

    public void onPause() {
        super.onPause();

    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void hideKeyboard(View view) {
        InputMethodManager mng = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        mng.hideSoftInputFromWindow(mUsername.getWindowToken(), 0);
    }

    private void checkLogIn() {

        String username = mUsername.getText().toString().trim().toLowerCase();
        String password = mPassword.getText().toString().trim();


        boolean isSuccess = mManager.checkLoginValidate(username, password);

        if (isSuccess) {

            Intent intent = new Intent(mContext, MainActivity.class);
            startActivity(intent);

            overridePendingTransition(R.animator.slide1, R.animator.slide2);

        } else {

            String message = getString(R.string.login_error_message);
            Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();

        }

    }
}

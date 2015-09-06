package com.warunyu.musiccourseacademy;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class RegisterActivity extends AppCompatActivity {

    private EditText mUsername;
    private EditText mPassword;
    private EditText mPasswordConfirm;
    private Button mRegis;
    private TextView mText;

    private Context mContext;
    private UserManager mManager;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_register);

        mManager = new UserManager(this);
        mContext = this;

        mUsername = (EditText) findViewById(R.id.editTextID);
        mPassword = (EditText) findViewById(R.id.editTextPass1);
        mPasswordConfirm = (EditText) findViewById(R.id.editTextPass2);
        mRegis = (Button) findViewById(R.id.buttonRegis);
        mText = (TextView) findViewById(R.id.txt_title);

        mRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = mUsername.getText().toString().trim().toLowerCase();
                String password = mPassword.getText().toString().trim();
                String confirmPassword = mPasswordConfirm.getText().toString();

                if (password.equals(confirmPassword)) {
                    boolean isSuccess = mManager.registerUser(username, password);
                    if (isSuccess) {


                        String message = getString(R.string.registerSuccess);
                        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
                        finish();

                    } else {

                        YoYo.with(Techniques.Hinge).duration(700).playOn(mText);
                        String message = getString(R.string.register_error_message);
                        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    YoYo.with(Techniques.Bounce).duration(500).playOn(mText);
                    String message = getString(R.string.login_error_message);
                    Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}


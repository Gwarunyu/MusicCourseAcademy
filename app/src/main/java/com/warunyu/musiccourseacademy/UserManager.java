package com.warunyu.musiccourseacademy;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/**
 * Created by Dell-NB on 29/8/2558.
 */
public class UserManager {


    private final String KEY_PREFS = "pref_user";
    private final String KEY_USERNAME = "username";
    private final String KEY_PASSWORD = "password";

    private SharedPreferences mPrefs;
    private SharedPreferences.Editor mEditor;

    Integer x = 1;

    public UserManager(Context context) {
        mPrefs = context.getSharedPreferences(KEY_PREFS, Context.MODE_PRIVATE);
        mEditor = mPrefs.edit();
    }

    public boolean checkLoginValidate(String username, String password) {

        String realUsername = mPrefs.getString(KEY_USERNAME, "");
        String realPassword = mPrefs.getString(KEY_PASSWORD, "");

        if ((!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password))
                && username.equals(realUsername) && password.equals(realPassword)) {

            return true;

        }

        return false;
    }

    public boolean registerUser(String username, String password) {

        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            return false;
        }

        mEditor.putString(KEY_USERNAME, username);
        mEditor.putString(KEY_PASSWORD, password);
        mEditor.putInt("MyLevel",x);
        return mEditor.commit();
    }

}

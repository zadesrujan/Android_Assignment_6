package com.example.user.android_assignment_6;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginView {
    // declaring variables
    EditText username;
    EditText password;
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         /*onCreate is the first method in the life cycle of an activity
     savedInstance passes data to super class,data is pull to store state of application
   * setContentView is used to set layout for the activity
   *R is a resource and it is auto generate file
   * activity_main assign an integer value*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Setting up UI component
        username =  findViewById(R.id.username);
        password =  findViewById(R.id.password);
        loginPresenter = new LoginPresenter(this, new LoginService());
        //by using new keyword creating new LoginPresenter object

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        /*savedInstance passes data to super class,data is pull to store state of application
        Bundle handles the orientation of the activity
        here Once onRestoreInstanceState is called. Activity will send those collected data back to the View in the View hierachy*/
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
     /*The onSaveInstanceState( ) method is passed a Bundle object as a parameter.
     Here Data you want saved for the activity should be placed in the Bundle*/
    }
    public void  onLoginClicked(View view) {
        loginPresenter.onLoginClicked();
        //here perform action of click button
    }

    @Override
    public String getUsername() {
        return username.getText().toString();
        /*By using get method giving access to username
        * returning username
        *  getText method to retrieve the text currently contained by the text field*/
    }

    @Override
    public String getPassword() {
        return password.getText().toString();
         /*By using get method giving access to password
        * returning password
        * getText method to retrieve the text currently contained by the text field*/
    }

    @Override
    public void startSecondActivity() {
        new ActivityUtil(this).startSecondActivity();
        //here it starts SecondActivity
    }

    @Override
    public void showUsernameError(int resId) {
        username.setError(getString(resId));
        //if username is empty then shows username error
    }

    @Override
    public void showPasswordError(int resId) {
        password.setError(getString(resId));
        //if password is empty it shows password error
    }

    @Override
    public void showLoginError(int resId) {
        //here if username or password details are incorrect then it shows login error
        Toast.makeText(getApplicationContext(),getString(resId), Toast.LENGTH_LONG).show();
       /*Toast is a pop up message or  a view containing a quick little message
             LENGTH_LONG display in long period of time
             whatever the error arises it shows by toast*/
    }
}

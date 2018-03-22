package com.example.user.android_assignment_6;

/**
 * Created by User on 22-03-2018.
 */

class LoginPresenter {
    // Creating objects
    private LoginView view;
    private LoginService service;

    public LoginPresenter(LoginView view, LoginService service) { //Creates constructor
        this.view = view;//giving reference to View,service
        this.service = service;
    }
    //onLoginClick Method
    public void onLoginClicked() {
        //getting username
        String username = view.getUsername();
        /*here giving access to username by using get method*/
        // if username is empty
        if (username.isEmpty()) {
            view.showUsernameError(R.string.userNameError);
            /*if username is empty here it shows error message*/
            return;//returns
        }
        //Getting Password
        String password = view.getPassword();
        //Applying Condition
        // if password is empty
        if (password.isEmpty()) {
            view.showPasswordError(R.string.passwordError);
            /*if password is empty then here it shows error message for password*/
            return;
        }
        boolean loginSucceeded = service.login(username, password);
        /*Applying Condition by using boolean if details correct returns true or else returns false
        if LogIn is successful*/
        if (loginSucceeded) {//using using statement to decide whether the login is succeeded or not
            view.startSecondActivity(); // View Second activity
            return;//returns
        }
        view.showLoginError(R.string.logInError); //here it shows LogIn error message if login was false
    }
}

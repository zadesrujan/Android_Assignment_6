package com.example.user.android_assignment_6;

/**
 * Created by User on 22-03-2018.
 */

class LoginService {
    public boolean login(String username, String password) {
        /*boolean returns true or false
        taking username and password by using string
        * string is a sequence of characters  */
        return "Srujan".equals(username) && "5678".equals(password);
        //here returns true if username and password is equal as given above or else gets error message
    }
}
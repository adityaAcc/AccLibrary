package com.acc.userlibrary;

/**
 * Created by Aditya Chowta on 2/3/2017.
 */

public class User {
    int userId;
    String email;
    String password;

    public User(){}

    public User(int userId, String email, String password){
        this.userId = userId;
        this.email = email;
        this.password = password;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

package com.example.hp.exercise6;

/**
 * Created by hp on 12/02/2016.
 */

public class User {
    public  String username;
    public String password;
    public User(String _username,String _password)
    {
        username = _username;
        password = _password;
    }
    public User(User myuser)
    {
        username = myuser.username;
        password = myuser.password;
    }
}

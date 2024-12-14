package com.arshad.BookMyShow.Service.Interface;

import com.arshad.BookMyShow.Model.User;

public interface UserService {
    User Login(String email, String password);
    User Signup(String name,String email,String password);
}

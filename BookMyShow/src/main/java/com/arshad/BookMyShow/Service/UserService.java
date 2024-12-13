package com.arshad.BookMyShow.Service;

import com.arshad.BookMyShow.Exceptions.InvalidUserException;
import com.arshad.BookMyShow.Exceptions.invalidEmailException;
import com.arshad.BookMyShow.Exceptions.invalidPasswordException;
import com.arshad.BookMyShow.Model.User;
import com.arshad.BookMyShow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
  private  UserRepository userRepository;

    public User Login(String email,String password){
        User saveduser= userRepository.getUserByEmail(email);
        if(saveduser==null){
            throw new InvalidUserException("User does not exist");
        }
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
//        String a=user.getPassword();
//       String passe= encoder.encode(a);
        if(encoder.matches(password,saveduser.getPassword())){
           return saveduser;
        }
//        if(a.equals(passe)){
//            return user;
//        }
        throw new invalidPasswordException("wrong password");

    }
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public User Signup(String name,String email,String password){
        if(userRepository.getUserByEmail(email)!=null){
            throw new invalidEmailException("User with mail id already exist");
        }
        User user=new User();
        user.setName(name);
        user.setEmail(email);
        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
        String pass=encoder.encode(password);
        user.setPassword(pass);
        user.setTickets(new ArrayList<>());
       return userRepository.save(user);
    }

}

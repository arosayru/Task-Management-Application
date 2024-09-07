package com.appuser.appuser.service;

import com.appuser.appuser.data.User;
import com.appuser.appuser.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public String deleteUser(int userId) {
        if (userRepository.findById(userId).isPresent()) {
            userRepository.deleteById(userId);
            return "User Deleted Successfully";
        }
        return "User not Found";
    }

    public List<User> findUserByName(String userName){
        return userRepository.findUserByName(userName);
    }

    public User findUserByUsernameAndPassword(String userName, String userPassword) {
        return userRepository.findUserByUsernameAndPassword(userName, userPassword);
    }
}

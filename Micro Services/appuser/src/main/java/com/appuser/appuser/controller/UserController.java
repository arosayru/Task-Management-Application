package com.appuser.appuser.controller;

import com.appuser.appuser.data.User;
import com.appuser.appuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/users")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @PostMapping(path = "/users")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping(path = "/users")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping(path = "/users/{userId}")
    public String deleteUser(@PathVariable int userId){
        return userService.deleteUser(userId);
    }

    @GetMapping(path = "/users",params = "userName")
    public List<User> findUserByName(@RequestParam String userName){
        return userService.findUserByName(userName);
    }

    @PostMapping(path = "/login")
    public User loginUser(@RequestBody User user) {
        User loggedInUser = userService.findUserByUsernameAndPassword(user.getUserName(), user.getUserPassword());
        if (loggedInUser != null) {
            return loggedInUser;  // Return user details (without password ideally)
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }
}

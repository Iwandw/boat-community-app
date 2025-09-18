package com.iwan.bootapp.backend.controller;

import com.iwan.bootapp.backend.service.UserService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.iwan.bootapp.backend.model.User;
import java.util.List;


@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers () {
        return userService.getAllUsers();
    }

    @PostMapping
    public User postUsers(@RequestBody User user) {
        return userService.createUser(user.getUsername(), user.getFull_name());
    }

    @PutMapping("/{id}")
    public User putUsers(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping
    public deleteUsers() {
        
    }
}

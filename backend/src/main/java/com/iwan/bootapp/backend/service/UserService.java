package com.iwan.bootapp.backend.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import com.iwan.bootapp.backend.repository.UserRepository;
import com.iwan.bootapp.backend.model.User;
import java.util.*;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser (String username, String fullname, int age) {
        User user = new User(username, fullname, age);
        return userRepository.save(user);
    }

    public User getUser (Long id){
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(Long id, User user) {
        User existingUser = userRepository.findById(id)

        if (user.getUsername() =! null) {

        }

            .orElseThrow(() -> new EntityNotFoundException("User not found with id" + id));
    }

    public User deleteUser(Long id) {

    }
}

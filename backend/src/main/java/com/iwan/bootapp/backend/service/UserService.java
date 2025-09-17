package com.iwan.bootapp.backend.service;

import org.springframework.stereotype.Service;
import com.iwan.bootapp.backend.repository.UserRepository;
import com.iwan.bootapp.backend.model.User;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser (String username, String fullname) {
        User user = new User(username, fullname);
        return userRepository.save(user);
    }
}

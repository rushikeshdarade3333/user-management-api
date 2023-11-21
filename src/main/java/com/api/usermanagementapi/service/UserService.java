package com.api.usermanagementapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.usermanagementapi.model.User;
import com.api.usermanagementapi.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            // Log the exception or handle it appropriately
            throw new RuntimeException("Error while retrieving all users", e);
        }
    }

    public User getUserById(Long id) {
        try {
            return userRepository.findById(id).orElse(null);
        } catch (Exception e) {
            throw new RuntimeException("Error while retrieving user by ID: " + id, e);
        }
    }

    public User saveUser(User user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            throw new RuntimeException("Error while saving user", e);
        }
    }

    public User updateUser(Long id, User user) {
        try {
            if (userRepository.existsById(id)) {
                user.setId(id);
                return userRepository.save(user);
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Error while updating user with ID: " + id, e);
        }
    }

    public void deleteUser(Long id) {
        try {
            userRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error while deleting user with ID: " + id, e);
        }
    }
}

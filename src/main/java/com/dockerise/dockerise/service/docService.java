package com.dockerise.dockerise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dockerise.dockerise.repository.users;
import com.dockerise.dockerise.repository.UserRepository;

@Service
public class docService {
    
	@Autowired
    private final UserRepository userRepository = null;

    public users saveUser(users users) {
        return userRepository.save(users);
    }

    public users getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<users> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
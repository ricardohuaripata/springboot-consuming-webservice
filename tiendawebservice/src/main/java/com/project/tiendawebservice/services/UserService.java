package com.project.tiendawebservice.services;

import java.util.ArrayList;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.tiendawebservice.models.User;
import com.project.tiendawebservice.repositories.UserRepository;


@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public ArrayList<User> getAllUsers() {
        return (ArrayList<User>) userRepository.findAll();
    }

    public Optional<User> getUserByUsernameAndPassword(String username, String password) {
        return (Optional<User>) userRepository.findByUsernameAndPassword(username, password);
    }

}

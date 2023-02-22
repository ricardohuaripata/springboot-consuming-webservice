package com.project.tiendawebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.tiendawebservice.models.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByUsernameAndPassword(String username, String password);
    
}

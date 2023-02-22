package com.project.tiendawebservice.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.tiendawebservice.models.User;
import com.project.tiendawebservice.services.UserService;

@RestController
@RequestMapping("/api/usuarios")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<User> obtenerUsuarios() {
        return userService.getAllUsers();
    }

    @GetMapping("/{username}/{password}")
    public Optional<User> obtenerUsuario(@PathVariable String username, @PathVariable String password) {
    
        return userService.getUserByUsernameAndPassword(username, password);

    }


}

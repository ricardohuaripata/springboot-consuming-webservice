package com.project.tiendawebservice.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.tiendawebservice.models.Product;
import com.project.tiendawebservice.services.ProductService;

// Product endpoint
@RestController
@RequestMapping("/api/productos")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping()
    public ArrayList<Product> obtenerProductos() {
        return productService.getAllProducts();
    }

}

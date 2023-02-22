package com.project.tiendawebservice.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.tiendawebservice.models.Product;
import com.project.tiendawebservice.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    
    public ArrayList<Product> getAllProducts() {
        return (ArrayList<Product>) productRepository.findAll();
    }

    
}

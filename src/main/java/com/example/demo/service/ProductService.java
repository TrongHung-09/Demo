package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public Product addProduct(Product product);

    public Product updateProduct(Long id, Product product);

    public Boolean deleteProduct(Long id);

    public List<Product> getAllProducts();

    public Optional<Product> getOneProduct(Long id);
}

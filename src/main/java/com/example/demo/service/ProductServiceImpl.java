package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        if(product!=null){
            return productRepository.save(product);
        }
        return null;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        if(product!=null){
            Product product1 = productRepository.getById(id);
            if(product1!=null){
                product1.setProductName(product.getProductName());
                product1.setColor(product.getColor());
                product1.setDescription(product.getDescription());
                product1.setOriginPrice(product.getOriginPrice());
                product1.setQuantity(product.getQuantity());
                product1.setStatusId(product.getStatusId());
                product1.setSellPrice(product.getSellPrice());
                return productRepository.save(product1);
            }
        }
        return null;
    }

    @Override
    public Boolean deleteProduct(Long id) {
        if(id>=1){
            Product product = productRepository.getById(id);
            if(product != null){
                productRepository.delete(product);
                return true;
            }
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getOneProduct(Long id) {
        return productRepository.findById(id);
    }
}

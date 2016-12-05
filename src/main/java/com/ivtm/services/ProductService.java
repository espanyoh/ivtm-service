package com.ivtm.services;

import com.ivtm.models.Product;
import com.ivtm.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Product get(String id) {
        return productRepository.findOne(id);
    }

    public List<Product> retrieve() {
        List<Product> products = productRepository.findAllByOrderByCodeAsc();
        int count = 0;
        for (Product product : products) {
            count++;
            //product.setCount(count);
        }
        return products;
    }
}

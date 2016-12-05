package com.ivtm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ivtm.models.Product;
import com.ivtm.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(Product product) {
        return productService.create(product);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> getAll() {

        return productService.retrieve();
    }
    
    @RequestMapping(path="{id}", method = RequestMethod.GET)
    public Product getProductByid(@PathVariable String id) {

    	return productService.get(id);
    }
}

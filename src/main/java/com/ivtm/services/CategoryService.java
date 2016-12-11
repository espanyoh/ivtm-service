package com.ivtm.services;

import com.ivtm.models.Category;
import com.ivtm.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category create(Category product) {
        return categoryRepository.save(product);
    }

    public Category get(String id) {
        return categoryRepository.findOne(id);
    }

    public List<Category> retrieve() {
        return categoryRepository.findAllByOrderByCodeAsc();
    }
}

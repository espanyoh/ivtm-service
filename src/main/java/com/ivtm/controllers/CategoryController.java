package com.ivtm.controllers;

import com.ivtm.models.Category;
import com.ivtm.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://ivtm.herokuapp.com")
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.POST)
    public Category create(Category category) {
        return categoryService.create(category);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Category> getAll() {
        return categoryService.retrieve();
    }
    
    @RequestMapping(path="{id}", method = RequestMethod.GET)
    public Category getCategoryByid(@PathVariable String id) {

    	return categoryService.get(id);
    }
}

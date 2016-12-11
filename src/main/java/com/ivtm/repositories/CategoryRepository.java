package com.ivtm.repositories;

import com.ivtm.models.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, String> {
    List<Category> findAllByOrderByCodeAsc();
}
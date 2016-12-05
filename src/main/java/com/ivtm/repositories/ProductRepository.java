package com.ivtm.repositories;

import com.ivtm.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, String> {
    List<Product> findAllByOrderByCodeAsc();
}
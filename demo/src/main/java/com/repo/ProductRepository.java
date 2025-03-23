package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.product;

@Repository
public interface ProductRepository extends JpaRepository<product, Long>{

}

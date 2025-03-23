package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.model.product;
@Repository
@EnableJpaRepositories(basePackages = "com.repo")

public interface ProductRepository extends JpaRepository<product, Long>{

}

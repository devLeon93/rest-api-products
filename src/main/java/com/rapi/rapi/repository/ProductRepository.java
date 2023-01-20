package com.rapi.rapi.repository;

import com.rapi.rapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author leonid.barsucovschi
 */
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}

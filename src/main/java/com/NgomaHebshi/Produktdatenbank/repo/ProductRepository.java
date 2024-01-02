package com.NgomaHebshi.Produktdatenbank.repo;

import java.util.List;

import com.NgomaHebshi.Produktdatenbank.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName(@Param("name") String name);
}


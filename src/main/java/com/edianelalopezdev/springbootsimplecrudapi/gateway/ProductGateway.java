package com.edianelalopezdev.springbootsimplecrudapi.gateway;

import com.edianelalopezdev.springbootsimplecrudapi.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductGateway {

    void createOrUpdateProduct(Product product);

    void deleteProduct(Product product);

    Optional<Product> findProductByName(String name);

    Optional<Product> findProductById(Long id);

    List<Product> getAllProducts();
}

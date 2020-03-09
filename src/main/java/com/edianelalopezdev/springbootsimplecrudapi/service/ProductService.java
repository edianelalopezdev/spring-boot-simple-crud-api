package com.edianelalopezdev.springbootsimplecrudapi.service;

import com.edianelalopezdev.springbootsimplecrudapi.request.ProductForm;
import com.edianelalopezdev.springbootsimplecrudapi.response.ProductResponse;
import java.util.List;

public interface ProductService {

    String createOrUpdateProduct(ProductForm productForm, Long id);

    ProductResponse findProductByName(String name);

    ProductResponse findProductById(Long id);

    List<ProductResponse> getAllProducts();

    List<ProductResponse> getAllProductsByDescription(String description);

    String deleteProductById(Long id);
}

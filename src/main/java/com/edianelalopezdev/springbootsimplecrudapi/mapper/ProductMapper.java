package com.edianelalopezdev.springbootsimplecrudapi.mapper;

import com.edianelalopezdev.springbootsimplecrudapi.entity.ProductEntity;
import com.edianelalopezdev.springbootsimplecrudapi.model.Product;
import com.edianelalopezdev.springbootsimplecrudapi.request.ProductForm;
import com.edianelalopezdev.springbootsimplecrudapi.response.ProductResponse;

public interface ProductMapper {

    Product mapEntityToModel(ProductEntity productEntity);

    ProductEntity mapModelToEntity(Product product);

    Product mapFormToModel(ProductForm productForm);

    ProductResponse mapModelToResponse(Product product);
}

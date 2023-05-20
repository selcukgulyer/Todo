package com.example.demo.service;

import com.example.demo.controller.request.CreateProductRequest;
import com.example.demo.controller.request.UpdateProductRequest;
import com.example.demo.controller.response.ProductResponse;
import com.example.demo.entities.Product;

public interface ProductService {
    ProductResponse createProduct(CreateProductRequest request);

    Product getByProductId(int id);

    ProductResponse updateProduct(int id, UpdateProductRequest request);

    ProductResponse deleteProduct(int id);
}
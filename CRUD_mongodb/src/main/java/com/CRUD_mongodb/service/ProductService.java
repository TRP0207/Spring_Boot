package com.CRUD_mongodb.service;

import com.CRUD_mongodb.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);

    Product updateProduct( Product product);

    List<Product> getAllProducts();

    Product getProductByProduct(long productId);

    void deleteProduct(long productId);

}

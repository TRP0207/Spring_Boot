package com.CRUD_mongodb.controller;

import com.CRUD_mongodb.model.Product;
import com.CRUD_mongodb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProduct(){
        return ResponseEntity.ok().body(productService.getAllProducts());
    }

    @PostMapping("/add")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.ok().body(productService.createProduct(product));
    }

    @PutMapping("/update/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable long productId ,@RequestBody Product product){
        product.setId(productId);
        return ResponseEntity.ok().body(this.productService.updateProduct(product));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable long productId){
        return ResponseEntity.ok().body(productService.getProductByProduct(productId));
    }

    @DeleteMapping("/delete/{productId}")
    public HttpStatus deleteProductById(@PathVariable long productId){
        this.productService.deleteProduct(productId);
        return HttpStatus.OK;
    }
}

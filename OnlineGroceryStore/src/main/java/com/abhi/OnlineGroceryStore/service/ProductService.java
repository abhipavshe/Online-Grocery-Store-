package com.abhi.OnlineGroceryStore.service;
import java.util.List;

import com.abhi.OnlineGroceryStore.model.Product;

public interface ProductService {
    Product saveProduct(Product product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    void deleteProduct(Long id);
	Product saveProduct1(Product product);
}


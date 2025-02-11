package org.example.services;


import org.example.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProducts(Product product){
        products.add(product);
    }

public List<Product> getAllProducts(){
        return products;
}

}

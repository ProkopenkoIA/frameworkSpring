package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.models.Product;
import org.example.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping ("/products")
    public String getProducts(Model model){

        model.addAttribute("products",productService.getAllProducts());
        return "products";
    }

    @PostMapping("/products")
    public String addProduct(Product p, Model model){

        productService.addProducts(p);
        model.addAttribute("products",productService.getAllProducts());
        return "products";
    }


}

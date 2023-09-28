package com.orderManagment.internship.controller;

import com.orderManagment.internship.dto.ProductDto;
import com.orderManagment.internship.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("")
    public ProductDto addProduct(@RequestBody ProductDto productDto){
        return productService.addProduct(productDto);
    }
}

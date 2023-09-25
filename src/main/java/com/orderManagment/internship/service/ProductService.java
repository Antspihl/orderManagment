package com.orderManagment.internship.service;

import com.orderManagment.internship.dto.ProductDto;
import com.orderManagment.internship.entity.Product;
import com.orderManagment.internship.mapper.ProductMapper;
import com.orderManagment.internship.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductDto addProduct(ProductDto productDto) {
        Product product = new Product();
        product.setProductName(productDto.productName());
        product.setUnitPrice(productDto.unitPrice());
        product.setSkuCode(productDto.skuCode());
        productRepository.save(product);
        return productMapper.toDto(product);
    }
}

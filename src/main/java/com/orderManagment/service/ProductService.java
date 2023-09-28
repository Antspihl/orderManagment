package com.orderManagment.service;

import com.orderManagment.dto.ProductDto;
import com.orderManagment.entity.Product;
import com.orderManagment.repository.ProductRepository;
import com.orderManagment.mapper.ProductMapper;
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
        Product product = productMapper.toEntity(productDto);
        productRepository.save(product);
        return productMapper.toDto(product);
    }
}

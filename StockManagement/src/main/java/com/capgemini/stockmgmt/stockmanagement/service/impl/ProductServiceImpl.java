package com.capgemini.stockmgmt.stockmanagement.service.impl;


import com.capgemini.stockmgmt.stockmanagement.entity.Product;
import com.capgemini.stockmgmt.stockmanagement.entity.dto.ProductRequestDto;
import com.capgemini.stockmgmt.stockmanagement.entity.dto.ProductResponseDto;
import com.capgemini.stockmgmt.stockmanagement.repository.ProductRepository;
import com.capgemini.stockmgmt.stockmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepo;

    @Override
    public void addProduct(ProductRequestDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setCategory(dto.getCategory());
        product.setCompany(dto.getCompany());
        product.setQuantity(dto.getQuantity());
        product.setPrice(dto.getPrice());
        productRepo.save(product);
    }

    @Override
    public void modifyProduct(Long prodId, ProductRequestDto dto) {
        Product product = productRepo.findById(prodId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        product.setName(dto.getName());
        product.setCategory(dto.getCategory());
        product.setCompany(dto.getCompany());
        product.setQuantity(dto.getQuantity());
        product.setPrice(dto.getPrice());
        productRepo.save(product);
    }

    @Override
    public List<ProductResponseDto> searchByName(String name) {
        return productRepo.findByName(name)
                .stream()
                .map(this::convertToResponseDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductResponseDto> searchByCategory(String category) {
        return productRepo.findByCategory(category)
                .stream()
                .map(this::convertToResponseDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductResponseDto> searchByCompany(String company) {
        return productRepo.findByCompany(company)
                .stream()
                .map(this::convertToResponseDto)
                .collect(Collectors.toList());
    }

    private ProductResponseDto convertToResponseDto(Product product) {
        ProductResponseDto dto = new ProductResponseDto();
        dto.setProdId(product.getProdId());
        dto.setName(product.getName());
        dto.setCategory(product.getCategory());
        dto.setCompany(product.getCompany());
        dto.setQuantity(product.getQuantity());
        dto.setPrice(product.getPrice());
        return dto;
    }
}
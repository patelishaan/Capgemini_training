package com.capgemini.stockmgmt.stockmanagement.service;

import com.capgemini.stockmgmt.stockmanagement.entity.dto.ProductRequestDto;
import com.capgemini.stockmgmt.stockmanagement.entity.dto.ProductResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    void addProduct(ProductRequestDto dto);
    void modifyProduct(Long prodId,ProductRequestDto dto);
    List<ProductResponseDto> searchByName(String name);

    List<ProductResponseDto> searchByCategory(String category);

    List<ProductResponseDto> searchByCompany(String company);
}

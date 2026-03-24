package com.capgemini.stockmgmt.stockmanagement.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDto {
    private Long ProdId;

    private String name;

    private String category;

    private String company;

    private int quantity;

    private double price;
}

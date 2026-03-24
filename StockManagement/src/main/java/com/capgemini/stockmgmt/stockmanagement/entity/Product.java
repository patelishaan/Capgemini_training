package com.capgemini.stockmgmt.stockmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ProdId;

    private String name;

    private String category;

    private String company;

    private int quantity;

    private double price;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private OrderHistoryInfo ohi;
}

package com.capgemini.stockmgmt.stockmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OrderId;

    private double totalPrice;

    private double totalPriceWithGst;
    @OneToOne(mappedBy = "orderInfo", cascade = CascadeType.ALL)
    private OrderHistoryInfo ohi;
}

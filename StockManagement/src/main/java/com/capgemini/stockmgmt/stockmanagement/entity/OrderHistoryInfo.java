package com.capgemini.stockmgmt.stockmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderHistoryInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ohi_id;

    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "ProdId")
    private Product product;

    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "OrderId")
    private OrderInfo orderInfo;
}

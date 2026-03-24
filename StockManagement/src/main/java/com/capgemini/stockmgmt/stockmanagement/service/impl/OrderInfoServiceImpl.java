package com.capgemini.stockmgmt.stockmanagement.service.impl;

import com.capgemini.stockmgmt.stockmanagement.entity.OrderHistoryInfo;
import com.capgemini.stockmgmt.stockmanagement.entity.OrderInfo;
import com.capgemini.stockmgmt.stockmanagement.entity.Product;
import com.capgemini.stockmgmt.stockmanagement.entity.dto.OrderRequestDto;
import com.capgemini.stockmgmt.stockmanagement.repository.OrderHistoryInfoRepository;
import com.capgemini.stockmgmt.stockmanagement.repository.OrderInfoRepository;
import com.capgemini.stockmgmt.stockmanagement.repository.ProductRepository;
import com.capgemini.stockmgmt.stockmanagement.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private OrderInfoRepository orderInfoRepo;

    @Autowired
    private OrderHistoryInfoRepository orderHistoryRepo;
    @Override
    public OrderInfo generateBill(OrderRequestDto dto) {
        Product product = productRepo.findById(dto.getProductId()).orElseThrow(()-> new RuntimeException("No product found"));

        double totalPrice = product.getPrice() * dto.getQuantity();
        double totalPriceWithGst = totalPrice + (totalPrice * 0.18);

        OrderInfo order = new OrderInfo();
        order.setTotalPrice(totalPrice);
        order.setTotalPriceWithGst(totalPriceWithGst);
        OrderInfo savedOrder = orderInfoRepo.save(order);

        OrderHistoryInfo ohi = new OrderHistoryInfo();
        ohi.setOrderInfo(savedOrder);
        ohi.setProduct(product);
        orderHistoryRepo.save(ohi);
        product.setQuantity(product.getQuantity() - dto.getQuantity());
        productRepo.save(product);

        return savedOrder;
    }
}

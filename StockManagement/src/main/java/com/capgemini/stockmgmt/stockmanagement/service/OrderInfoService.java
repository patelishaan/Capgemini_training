package com.capgemini.stockmgmt.stockmanagement.service;

import com.capgemini.stockmgmt.stockmanagement.entity.OrderInfo;
import com.capgemini.stockmgmt.stockmanagement.entity.dto.OrderRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface OrderInfoService {
    OrderInfo generateBill(OrderRequestDto dto);
}

package com.capgemini.stockmgmt.stockmanagement.repository;

import com.capgemini.stockmgmt.stockmanagement.entity.OrderHistoryInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderHistoryInfoRepository extends JpaRepository<OrderHistoryInfo, Long > {
}

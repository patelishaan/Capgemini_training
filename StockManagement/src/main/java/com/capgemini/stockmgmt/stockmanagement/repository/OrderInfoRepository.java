package com.capgemini.stockmgmt.stockmanagement.repository;

import com.capgemini.stockmgmt.stockmanagement.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> {

}

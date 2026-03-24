package com.capgemini.stockmgmt.stockmanagement.controller;

import com.capgemini.stockmgmt.stockmanagement.entity.OrderInfo;
import com.capgemini.stockmgmt.stockmanagement.entity.dto.OrderRequestDto;
import com.capgemini.stockmgmt.stockmanagement.entity.dto.ProductRequestDto;
import com.capgemini.stockmgmt.stockmanagement.entity.dto.ProductResponseDto;
import com.capgemini.stockmgmt.stockmanagement.service.OrderInfoService;
import com.capgemini.stockmgmt.stockmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stock")
public class StockManagementController {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderInfoService orderInfoService;

    // add a new product
    @PostMapping("/product/add")
    public ResponseEntity<String> addProduct(@RequestBody ProductRequestDto dto) {
        productService.addProduct(dto);
        return ResponseEntity.ok("Product added successfully");
    }

    // modify existing product by id
    @PutMapping("/product/modify/{id}")
    public ResponseEntity<String> modifyProduct(
            @PathVariable Long id,
            @RequestBody ProductRequestDto dto) {
        productService.modifyProduct(id, dto);
        return ResponseEntity.ok("Product updated successfully");
    }

    // search product by name
    @GetMapping("/product/search/name")
    public ResponseEntity<List<ProductResponseDto>> searchByName(@RequestParam String name) {
        return ResponseEntity.ok(productService.searchByName(name));
    }

    // search product by category
    @GetMapping("/product/search/category")
    public ResponseEntity<List<ProductResponseDto>> searchByCategory(@RequestParam String category) {
        return ResponseEntity.ok(productService.searchByCategory(category));
    }

    // search product by company
    @GetMapping("/product/search/company")
    public ResponseEntity<List<ProductResponseDto>> searchByCompany(@RequestParam String company) {
        return ResponseEntity.ok(productService.searchByCompany(company));
    }

    // generate bill for a product
    @PostMapping("/order/generate-bill")
    public ResponseEntity<OrderInfo> generateBill(@RequestBody OrderRequestDto dto) {
        OrderInfo order = orderInfoService.generateBill(dto);
        return ResponseEntity.ok(order);
    }
}
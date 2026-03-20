package com.bank.service.impl;

import com.bank.dto.CustomerDto;
import com.bank.entity.Customer;
import com.bank.exception.ResourceNotFoundException;
import com.bank.repository.CustomerRepo;
import com.bank.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    @Override
    public Customer createCustomer(CustomerDto dto) {
        Customer customer = Customer.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                //.accounts(dto.getAccount())
                .build();
        return customerRepo.save(customer);
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + id));
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public void deleteCustomer(Integer id) {
        Customer customer = getCustomerById(id);
        customerRepo.delete(customer);
    }
}
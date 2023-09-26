package com.orderManagment.internship.service;

import com.orderManagment.internship.dto.CustomerDto;
import com.orderManagment.internship.mapper.CustomerMapper;
import com.orderManagment.internship.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public CustomerDto addCustomer(CustomerDto customerDto) {
        customerRepository.save(customerMapper.toEntity(customerDto));
        return customerDto;
    }
}

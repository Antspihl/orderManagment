package com.orderManagment.internship.service;

import com.orderManagment.internship.dto.CustomerDto;
import com.orderManagment.internship.entity.Customer;
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
        Customer customer = new Customer();
        customer.setRegistrationCode(customerDto.registrationCode());
        customer.setEmail(customerDto.email());
        customer.setFullName(customerDto.fullName());
        customer.setTelephone(customerDto.telephone());
        customerRepository.save(customer);
        return customerMapper.toDto(customer);
    }
}

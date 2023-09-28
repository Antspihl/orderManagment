package com.orderManagment.internship.controller;

import com.orderManagment.internship.dto.CustomerDto;
import com.orderManagment.internship.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("")
    public CustomerDto addCustomer(@RequestBody CustomerDto customerDto){
        return customerService.addCustomer(customerDto);
    }
}

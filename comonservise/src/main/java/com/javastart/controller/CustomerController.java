package com.javastart.controller;

import com.javastart.controller.dto.CustomerRequestDTO;
import com.javastart.controller.dto.CustomerResponseDTO;
import com.javastart.servise.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    private  final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/customer")
    public String createCustomer(@RequestBody CustomerRequestDTO customerDTO ) {
       return customerService.saveCustomer(customerDTO.getName(), customerDTO.getPhone(),
               customerDTO.getMail(), customerDTO.getAmount(), customerDTO.getIsOverdrawEnabled());
    }

    @GetMapping("/customer")
    public CustomerResponseDTO getCustomerById(@RequestParam Long accountId,
                                               @RequestParam Long billId) {
        return  customerService.getCustomerById(accountId, billId);
    }
}

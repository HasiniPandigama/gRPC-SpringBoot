package com.grpcexample.controller;

import com.google.protobuf.Descriptors;
import com.grpcexample.service.CustomerClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    CustomerClientService customerClientService;

    @GetMapping("/customer-details")
    public Map<Descriptors.FieldDescriptor, Object> getCustomerDetails(@RequestParam(name = "customerId", required = true) String customerId)  {

        return customerClientService.getCustomerDetails(customerId);
    }


}

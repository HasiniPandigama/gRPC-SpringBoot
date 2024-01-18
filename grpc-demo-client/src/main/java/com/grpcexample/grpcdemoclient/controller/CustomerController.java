package com.grpcexample.grpcdemoclient.controller;

import com.customerservice.grpc.stubs.CustomerAccountDetails;
import com.customerservice.grpc.stubs.CustomerDetails;
import com.google.protobuf.Descriptors;
import com.grpcexample.grpcdemoclient.service.CustomerClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@AllArgsConstructor
public class CustomerController {

    CustomerClientService customerClientService;
//    Logger logger = Logger.getLogger(CustomerController.class.getName());

    @GetMapping("/customer/customer-details")
    public Map<Descriptors.FieldDescriptor, Object> getCustomerDetails(@RequestParam(name = "customerId", required = true) String customerId)  {

        return customerClientService.getCustomerDetails(customerId);
    }

    @PostMapping("/customer/customer-newest-account")
    public Map<String, Map<Descriptors.FieldDescriptor, Object>> getNewestAccount(@RequestBody List<CustomerAccountDetails> customerAccountDetailsList) throws InterruptedException {

        return customerClientService.getNewestAccount(customerAccountDetailsList);
    }

    @PostMapping("/customer/older-customer-accounts")
    public List<Map<Descriptors.FieldDescriptor, Object>> getAccountsOlderThanOneYear(@RequestBody List<CustomerAccountDetails> customerAccountDetailsList) throws InterruptedException {

        return customerClientService.getAccountsOlderThanOneYear(customerAccountDetailsList);
    }

    @PostMapping("/customer/customer-account-details")
    public List<Map<Descriptors.FieldDescriptor, Object>> getCustomerAccountDetails(@RequestBody CustomerDetails customerDetails) throws InterruptedException {

        return customerClientService.getCustomerAccountDetails(customerDetails);
    }



}

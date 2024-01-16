package com.grpcexample.grpcdemoclient.controller;

import com.google.protobuf.Descriptors;
import com.grpcexample.grpcdemoclient.service.CustomerClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.logging.Logger;

@RestController
@AllArgsConstructor
public class CustomerController {

    CustomerClientService customerClientService;
    Logger logger = Logger.getLogger(CustomerController.class.getName());

    @GetMapping("/customer/customer-details")
    public Map<Descriptors.FieldDescriptor, Object> getCustomerDetails(@RequestParam(name = "customerId", required = true) String customerId)  {
        logger.info("controller");
        return customerClientService.getCustomerDetails(customerId);
    }

    @GetMapping("/author/{id}")
    public Map<Descriptors.FieldDescriptor, Object> getAuthor(@PathVariable String id) {
        return null;
    }


}

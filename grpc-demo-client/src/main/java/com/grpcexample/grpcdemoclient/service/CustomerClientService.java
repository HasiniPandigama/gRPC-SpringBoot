package com.grpcexample.grpcdemoclient.service;

import com.customerservice.grpc.stubs.CustomerDetailsRequest;
import com.customerservice.grpc.stubs.CustomerServiceGrpc;
import com.google.protobuf.Descriptors;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CustomerClientService {

    @GrpcClient("customer-service")
    private CustomerServiceGrpc.CustomerServiceBlockingStub customerServiceBlockingStub;

    public Map<Descriptors.FieldDescriptor, Object> getCustomerDetails(String customerId) {
        CustomerDetailsRequest customerDetailsRequest = CustomerDetailsRequest.newBuilder()
                .setIdValue(customerId).build();

        return customerServiceBlockingStub.getCustomerDetails(customerDetailsRequest).getAllFields();
    }


}

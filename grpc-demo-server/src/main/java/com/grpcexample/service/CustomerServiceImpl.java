package com.grpcexample.service;

import com.customerservice.grpc.stubs.CustomerDetails;
import com.customerservice.grpc.stubs.CustomerDetailsRequest;
import com.customerservice.grpc.stubs.CustomerServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CustomerServiceImpl extends CustomerServiceGrpc.CustomerServiceImplBase {
    @Override
    public void getCustomerDetails(CustomerDetailsRequest request, io.grpc.stub.StreamObserver<CustomerDetails> responseObserver) {
        TempData.getCustomerDetailsFromTempDb()
                .stream()
                .filter(customerDetails -> customerDetails.getIdValue().equals(request.getIdValue()))
                .findFirst()
                .ifPresent(responseObserver::onNext);
        responseObserver.onCompleted();

     }
}

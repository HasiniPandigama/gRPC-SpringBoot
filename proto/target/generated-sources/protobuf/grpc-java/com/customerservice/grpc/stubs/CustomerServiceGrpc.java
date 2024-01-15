package com.customerservice.grpc.stubs;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: customerservice.proto")
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "com.customerservice.grpc.stubs.CustomerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.customerservice.grpc.stubs.CustomerDetailsRequest,
      com.customerservice.grpc.stubs.CustomerDetails> METHOD_GET_CUSTOMER_DETAILS =
      io.grpc.MethodDescriptor.<com.customerservice.grpc.stubs.CustomerDetailsRequest, com.customerservice.grpc.stubs.CustomerDetails>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.customerservice.grpc.stubs.CustomerService", "getCustomerDetails"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.customerservice.grpc.stubs.CustomerDetailsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.customerservice.grpc.stubs.CustomerDetails.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.customerservice.grpc.stubs.CustomerDetails,
      com.customerservice.grpc.stubs.CustomerAccountDetails> METHOD_GET_CUSTOMER_ACCOUNTS =
      io.grpc.MethodDescriptor.<com.customerservice.grpc.stubs.CustomerDetails, com.customerservice.grpc.stubs.CustomerAccountDetails>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.customerservice.grpc.stubs.CustomerService", "getCustomerAccounts"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.customerservice.grpc.stubs.CustomerDetails.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.customerservice.grpc.stubs.CustomerAccountDetails.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.customerservice.grpc.stubs.CustomerAccountDetails,
      com.customerservice.grpc.stubs.CustomerAccountDetails> METHOD_GET_NEWEST_ACCOUNT =
      io.grpc.MethodDescriptor.<com.customerservice.grpc.stubs.CustomerAccountDetails, com.customerservice.grpc.stubs.CustomerAccountDetails>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.customerservice.grpc.stubs.CustomerService", "getNewestAccount"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.customerservice.grpc.stubs.CustomerAccountDetails.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.customerservice.grpc.stubs.CustomerAccountDetails.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.customerservice.grpc.stubs.CustomerAccountDetails,
      com.customerservice.grpc.stubs.CustomerAccountDetails> METHOD_GET_ACCOUNTS_OLDER_THAN_ONE_YEAR =
      io.grpc.MethodDescriptor.<com.customerservice.grpc.stubs.CustomerAccountDetails, com.customerservice.grpc.stubs.CustomerAccountDetails>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.customerservice.grpc.stubs.CustomerService", "getAccountsOlderThanOneYear"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.customerservice.grpc.stubs.CustomerAccountDetails.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.customerservice.grpc.stubs.CustomerAccountDetails.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary - synchronous : client will send one request and server will respond with one response.
     * </pre>
     */
    public void getCustomerDetails(com.customerservice.grpc.stubs.CustomerDetailsRequest request,
        io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerDetails> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CUSTOMER_DETAILS, responseObserver);
    }

    /**
     * <pre>
     *sever streaming - Asynchronous : client will send one request and server will send stream of response to the client.
     * </pre>
     */
    public void getCustomerAccounts(com.customerservice.grpc.stubs.CustomerDetails request,
        io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CUSTOMER_ACCOUNTS, responseObserver);
    }

    /**
     * <pre>
     *client streaming - Asynchronous : client will stream of request and server will respond with one response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails> getNewestAccount(
        io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GET_NEWEST_ACCOUNT, responseObserver);
    }

    /**
     * <pre>
     *bi-directional streaming - Asynchronous : client will send stream of request and server will respond with stream of response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails> getAccountsOlderThanOneYear(
        io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GET_ACCOUNTS_OLDER_THAN_ONE_YEAR, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_CUSTOMER_DETAILS,
            asyncUnaryCall(
              new MethodHandlers<
                com.customerservice.grpc.stubs.CustomerDetailsRequest,
                com.customerservice.grpc.stubs.CustomerDetails>(
                  this, METHODID_GET_CUSTOMER_DETAILS)))
          .addMethod(
            METHOD_GET_CUSTOMER_ACCOUNTS,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.customerservice.grpc.stubs.CustomerDetails,
                com.customerservice.grpc.stubs.CustomerAccountDetails>(
                  this, METHODID_GET_CUSTOMER_ACCOUNTS)))
          .addMethod(
            METHOD_GET_NEWEST_ACCOUNT,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.customerservice.grpc.stubs.CustomerAccountDetails,
                com.customerservice.grpc.stubs.CustomerAccountDetails>(
                  this, METHODID_GET_NEWEST_ACCOUNT)))
          .addMethod(
            METHOD_GET_ACCOUNTS_OLDER_THAN_ONE_YEAR,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.customerservice.grpc.stubs.CustomerAccountDetails,
                com.customerservice.grpc.stubs.CustomerAccountDetails>(
                  this, METHODID_GET_ACCOUNTS_OLDER_THAN_ONE_YEAR)))
          .build();
    }
  }

  /**
   */
  public static final class CustomerServiceStub extends io.grpc.stub.AbstractStub<CustomerServiceStub> {
    private CustomerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary - synchronous : client will send one request and server will respond with one response.
     * </pre>
     */
    public void getCustomerDetails(com.customerservice.grpc.stubs.CustomerDetailsRequest request,
        io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CUSTOMER_DETAILS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *sever streaming - Asynchronous : client will send one request and server will send stream of response to the client.
     * </pre>
     */
    public void getCustomerAccounts(com.customerservice.grpc.stubs.CustomerDetails request,
        io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_CUSTOMER_ACCOUNTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming - Asynchronous : client will stream of request and server will respond with one response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails> getNewestAccount(
        io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GET_NEWEST_ACCOUNT, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *bi-directional streaming - Asynchronous : client will send stream of request and server will respond with stream of response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails> getAccountsOlderThanOneYear(
        io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_GET_ACCOUNTS_OLDER_THAN_ONE_YEAR, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class CustomerServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary - synchronous : client will send one request and server will respond with one response.
     * </pre>
     */
    public com.customerservice.grpc.stubs.CustomerDetails getCustomerDetails(com.customerservice.grpc.stubs.CustomerDetailsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CUSTOMER_DETAILS, getCallOptions(), request);
    }

    /**
     * <pre>
     *sever streaming - Asynchronous : client will send one request and server will send stream of response to the client.
     * </pre>
     */
    public java.util.Iterator<com.customerservice.grpc.stubs.CustomerAccountDetails> getCustomerAccounts(
        com.customerservice.grpc.stubs.CustomerDetails request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_CUSTOMER_ACCOUNTS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomerServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary - synchronous : client will send one request and server will respond with one response.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.customerservice.grpc.stubs.CustomerDetails> getCustomerDetails(
        com.customerservice.grpc.stubs.CustomerDetailsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CUSTOMER_DETAILS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_DETAILS = 0;
  private static final int METHODID_GET_CUSTOMER_ACCOUNTS = 1;
  private static final int METHODID_GET_NEWEST_ACCOUNT = 2;
  private static final int METHODID_GET_ACCOUNTS_OLDER_THAN_ONE_YEAR = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_DETAILS:
          serviceImpl.getCustomerDetails((com.customerservice.grpc.stubs.CustomerDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerDetails>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_ACCOUNTS:
          serviceImpl.getCustomerAccounts((com.customerservice.grpc.stubs.CustomerDetails) request,
              (io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NEWEST_ACCOUNT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getNewestAccount(
              (io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails>) responseObserver);
        case METHODID_GET_ACCOUNTS_OLDER_THAN_ONE_YEAR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getAccountsOlderThanOneYear(
              (io.grpc.stub.StreamObserver<com.customerservice.grpc.stubs.CustomerAccountDetails>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class CustomerServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.customerservice.grpc.stubs.Customerservice.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerServiceDescriptorSupplier())
              .addMethod(METHOD_GET_CUSTOMER_DETAILS)
              .addMethod(METHOD_GET_CUSTOMER_ACCOUNTS)
              .addMethod(METHOD_GET_NEWEST_ACCOUNT)
              .addMethod(METHOD_GET_ACCOUNTS_OLDER_THAN_ONE_YEAR)
              .build();
        }
      }
    }
    return result;
  }
}

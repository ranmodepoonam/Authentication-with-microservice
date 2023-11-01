package com.osc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class storeUserDetailsGrpc {

  private storeUserDetailsGrpc() {}

  public static final String SERVICE_NAME = "storeUserDetails";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osc.proto.userDetailsRequest,
      com.osc.proto.userDetailsResponse> getGetTemplateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTemplateInfo",
      requestType = com.osc.proto.userDetailsRequest.class,
      responseType = com.osc.proto.userDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osc.proto.userDetailsRequest,
      com.osc.proto.userDetailsResponse> getGetTemplateInfoMethod() {
    io.grpc.MethodDescriptor<com.osc.proto.userDetailsRequest, com.osc.proto.userDetailsResponse> getGetTemplateInfoMethod;
    if ((getGetTemplateInfoMethod = storeUserDetailsGrpc.getGetTemplateInfoMethod) == null) {
      synchronized (storeUserDetailsGrpc.class) {
        if ((getGetTemplateInfoMethod = storeUserDetailsGrpc.getGetTemplateInfoMethod) == null) {
          storeUserDetailsGrpc.getGetTemplateInfoMethod = getGetTemplateInfoMethod = 
              io.grpc.MethodDescriptor.<com.osc.proto.userDetailsRequest, com.osc.proto.userDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "storeUserDetails", "getTemplateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osc.proto.userDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osc.proto.userDetailsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new storeUserDetailsMethodDescriptorSupplier("getTemplateInfo"))
                  .build();
          }
        }
     }
     return getGetTemplateInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static storeUserDetailsStub newStub(io.grpc.Channel channel) {
    return new storeUserDetailsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static storeUserDetailsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new storeUserDetailsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static storeUserDetailsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new storeUserDetailsFutureStub(channel);
  }

  /**
   */
  public static abstract class storeUserDetailsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTemplateInfo(com.osc.proto.userDetailsRequest request,
        io.grpc.stub.StreamObserver<com.osc.proto.userDetailsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTemplateInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTemplateInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.osc.proto.userDetailsRequest,
                com.osc.proto.userDetailsResponse>(
                  this, METHODID_GET_TEMPLATE_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class storeUserDetailsStub extends io.grpc.stub.AbstractStub<storeUserDetailsStub> {
    private storeUserDetailsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private storeUserDetailsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected storeUserDetailsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new storeUserDetailsStub(channel, callOptions);
    }

    /**
     */
    public void getTemplateInfo(com.osc.proto.userDetailsRequest request,
        io.grpc.stub.StreamObserver<com.osc.proto.userDetailsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTemplateInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class storeUserDetailsBlockingStub extends io.grpc.stub.AbstractStub<storeUserDetailsBlockingStub> {
    private storeUserDetailsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private storeUserDetailsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected storeUserDetailsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new storeUserDetailsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.osc.proto.userDetailsResponse getTemplateInfo(com.osc.proto.userDetailsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTemplateInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class storeUserDetailsFutureStub extends io.grpc.stub.AbstractStub<storeUserDetailsFutureStub> {
    private storeUserDetailsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private storeUserDetailsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected storeUserDetailsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new storeUserDetailsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osc.proto.userDetailsResponse> getTemplateInfo(
        com.osc.proto.userDetailsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTemplateInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TEMPLATE_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final storeUserDetailsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(storeUserDetailsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TEMPLATE_INFO:
          serviceImpl.getTemplateInfo((com.osc.proto.userDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.osc.proto.userDetailsResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class storeUserDetailsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    storeUserDetailsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osc.proto.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("storeUserDetails");
    }
  }

  private static final class storeUserDetailsFileDescriptorSupplier
      extends storeUserDetailsBaseDescriptorSupplier {
    storeUserDetailsFileDescriptorSupplier() {}
  }

  private static final class storeUserDetailsMethodDescriptorSupplier
      extends storeUserDetailsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    storeUserDetailsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (storeUserDetailsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new storeUserDetailsFileDescriptorSupplier())
              .addMethod(getGetTemplateInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}

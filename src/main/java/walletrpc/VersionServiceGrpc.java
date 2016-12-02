package walletrpc;

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

@javax.annotation.Generated("by gRPC proto compiler")
public class VersionServiceGrpc {

  private VersionServiceGrpc() {}

  public static final String SERVICE_NAME = "walletrpc.VersionService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.VersionRequest,
      walletrpc.Api.VersionResponse> METHOD_VERSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.VersionService", "Version"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.VersionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.VersionResponse.getDefaultInstance()));

  public static VersionServiceStub newStub(io.grpc.Channel channel) {
    return new VersionServiceStub(channel);
  }

  public static VersionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VersionServiceBlockingStub(channel);
  }

  public static VersionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VersionServiceFutureStub(channel);
  }

  public static interface VersionService {

    public void version(walletrpc.Api.VersionRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.VersionResponse> responseObserver);
  }

  public static interface VersionServiceBlockingClient {

    public walletrpc.Api.VersionResponse version(walletrpc.Api.VersionRequest request);
  }

  public static interface VersionServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.VersionResponse> version(
        walletrpc.Api.VersionRequest request);
  }

  public static class VersionServiceStub extends io.grpc.stub.AbstractStub<VersionServiceStub>
      implements VersionService {
    private VersionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VersionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VersionServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void version(walletrpc.Api.VersionRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.VersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VERSION, getCallOptions()), request, responseObserver);
    }
  }

  public static class VersionServiceBlockingStub extends io.grpc.stub.AbstractStub<VersionServiceBlockingStub>
      implements VersionServiceBlockingClient {
    private VersionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VersionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VersionServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public walletrpc.Api.VersionResponse version(walletrpc.Api.VersionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VERSION, getCallOptions(), request);
    }
  }

  public static class VersionServiceFutureStub extends io.grpc.stub.AbstractStub<VersionServiceFutureStub>
      implements VersionServiceFutureClient {
    private VersionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VersionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VersionServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.VersionResponse> version(
        walletrpc.Api.VersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VERSION, getCallOptions()), request);
    }
  }

  private static final int METHODID_VERSION = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VersionService serviceImpl;
    private final int methodId;

    public MethodHandlers(VersionService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VERSION:
          serviceImpl.version((walletrpc.Api.VersionRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.VersionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final VersionService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_VERSION,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.VersionRequest,
              walletrpc.Api.VersionResponse>(
                serviceImpl, METHODID_VERSION)))
        .build();
  }
}

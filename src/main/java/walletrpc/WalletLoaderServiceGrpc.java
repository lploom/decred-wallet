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
public class WalletLoaderServiceGrpc {

  private WalletLoaderServiceGrpc() {}

  public static final String SERVICE_NAME = "walletrpc.WalletLoaderService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.WalletExistsRequest,
      walletrpc.Api.WalletExistsResponse> METHOD_WALLET_EXISTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletLoaderService", "WalletExists"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.WalletExistsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.WalletExistsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.CreateWalletRequest,
      walletrpc.Api.CreateWalletResponse> METHOD_CREATE_WALLET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletLoaderService", "CreateWallet"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.CreateWalletRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.CreateWalletResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.OpenWalletRequest,
      walletrpc.Api.OpenWalletResponse> METHOD_OPEN_WALLET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletLoaderService", "OpenWallet"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.OpenWalletRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.OpenWalletResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.CloseWalletRequest,
      walletrpc.Api.CloseWalletResponse> METHOD_CLOSE_WALLET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletLoaderService", "CloseWallet"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.CloseWalletRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.CloseWalletResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.StartConsensusRpcRequest,
      walletrpc.Api.StartConsensusRpcResponse> METHOD_START_CONSENSUS_RPC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletLoaderService", "StartConsensusRpc"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.StartConsensusRpcRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.StartConsensusRpcResponse.getDefaultInstance()));

  public static WalletLoaderServiceStub newStub(io.grpc.Channel channel) {
    return new WalletLoaderServiceStub(channel);
  }

  public static WalletLoaderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WalletLoaderServiceBlockingStub(channel);
  }

  public static WalletLoaderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WalletLoaderServiceFutureStub(channel);
  }

  public static interface WalletLoaderService {

    public void walletExists(walletrpc.Api.WalletExistsRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.WalletExistsResponse> responseObserver);

    public void createWallet(walletrpc.Api.CreateWalletRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.CreateWalletResponse> responseObserver);

    public void openWallet(walletrpc.Api.OpenWalletRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.OpenWalletResponse> responseObserver);

    public void closeWallet(walletrpc.Api.CloseWalletRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.CloseWalletResponse> responseObserver);

    public void startConsensusRpc(walletrpc.Api.StartConsensusRpcRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.StartConsensusRpcResponse> responseObserver);
  }

  public static interface WalletLoaderServiceBlockingClient {

    public walletrpc.Api.WalletExistsResponse walletExists(walletrpc.Api.WalletExistsRequest request);

    public walletrpc.Api.CreateWalletResponse createWallet(walletrpc.Api.CreateWalletRequest request);

    public walletrpc.Api.OpenWalletResponse openWallet(walletrpc.Api.OpenWalletRequest request);

    public walletrpc.Api.CloseWalletResponse closeWallet(walletrpc.Api.CloseWalletRequest request);

    public walletrpc.Api.StartConsensusRpcResponse startConsensusRpc(walletrpc.Api.StartConsensusRpcRequest request);
  }

  public static interface WalletLoaderServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.WalletExistsResponse> walletExists(
        walletrpc.Api.WalletExistsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.CreateWalletResponse> createWallet(
        walletrpc.Api.CreateWalletRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.OpenWalletResponse> openWallet(
        walletrpc.Api.OpenWalletRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.CloseWalletResponse> closeWallet(
        walletrpc.Api.CloseWalletRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.StartConsensusRpcResponse> startConsensusRpc(
        walletrpc.Api.StartConsensusRpcRequest request);
  }

  public static class WalletLoaderServiceStub extends io.grpc.stub.AbstractStub<WalletLoaderServiceStub>
      implements WalletLoaderService {
    private WalletLoaderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletLoaderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletLoaderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletLoaderServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void walletExists(walletrpc.Api.WalletExistsRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.WalletExistsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_WALLET_EXISTS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void createWallet(walletrpc.Api.CreateWalletRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.CreateWalletResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_WALLET, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void openWallet(walletrpc.Api.OpenWalletRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.OpenWalletResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_OPEN_WALLET, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void closeWallet(walletrpc.Api.CloseWalletRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.CloseWalletResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CLOSE_WALLET, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void startConsensusRpc(walletrpc.Api.StartConsensusRpcRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.StartConsensusRpcResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_START_CONSENSUS_RPC, getCallOptions()), request, responseObserver);
    }
  }

  public static class WalletLoaderServiceBlockingStub extends io.grpc.stub.AbstractStub<WalletLoaderServiceBlockingStub>
      implements WalletLoaderServiceBlockingClient {
    private WalletLoaderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletLoaderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletLoaderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletLoaderServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public walletrpc.Api.WalletExistsResponse walletExists(walletrpc.Api.WalletExistsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_WALLET_EXISTS, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.CreateWalletResponse createWallet(walletrpc.Api.CreateWalletRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_WALLET, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.OpenWalletResponse openWallet(walletrpc.Api.OpenWalletRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_OPEN_WALLET, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.CloseWalletResponse closeWallet(walletrpc.Api.CloseWalletRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CLOSE_WALLET, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.StartConsensusRpcResponse startConsensusRpc(walletrpc.Api.StartConsensusRpcRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_START_CONSENSUS_RPC, getCallOptions(), request);
    }
  }

  public static class WalletLoaderServiceFutureStub extends io.grpc.stub.AbstractStub<WalletLoaderServiceFutureStub>
      implements WalletLoaderServiceFutureClient {
    private WalletLoaderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletLoaderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletLoaderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletLoaderServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.WalletExistsResponse> walletExists(
        walletrpc.Api.WalletExistsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_WALLET_EXISTS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.CreateWalletResponse> createWallet(
        walletrpc.Api.CreateWalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_WALLET, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.OpenWalletResponse> openWallet(
        walletrpc.Api.OpenWalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_OPEN_WALLET, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.CloseWalletResponse> closeWallet(
        walletrpc.Api.CloseWalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CLOSE_WALLET, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.StartConsensusRpcResponse> startConsensusRpc(
        walletrpc.Api.StartConsensusRpcRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_START_CONSENSUS_RPC, getCallOptions()), request);
    }
  }

  private static final int METHODID_WALLET_EXISTS = 0;
  private static final int METHODID_CREATE_WALLET = 1;
  private static final int METHODID_OPEN_WALLET = 2;
  private static final int METHODID_CLOSE_WALLET = 3;
  private static final int METHODID_START_CONSENSUS_RPC = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletLoaderService serviceImpl;
    private final int methodId;

    public MethodHandlers(WalletLoaderService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WALLET_EXISTS:
          serviceImpl.walletExists((walletrpc.Api.WalletExistsRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.WalletExistsResponse>) responseObserver);
          break;
        case METHODID_CREATE_WALLET:
          serviceImpl.createWallet((walletrpc.Api.CreateWalletRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.CreateWalletResponse>) responseObserver);
          break;
        case METHODID_OPEN_WALLET:
          serviceImpl.openWallet((walletrpc.Api.OpenWalletRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.OpenWalletResponse>) responseObserver);
          break;
        case METHODID_CLOSE_WALLET:
          serviceImpl.closeWallet((walletrpc.Api.CloseWalletRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.CloseWalletResponse>) responseObserver);
          break;
        case METHODID_START_CONSENSUS_RPC:
          serviceImpl.startConsensusRpc((walletrpc.Api.StartConsensusRpcRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.StartConsensusRpcResponse>) responseObserver);
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
      final WalletLoaderService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_WALLET_EXISTS,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.WalletExistsRequest,
              walletrpc.Api.WalletExistsResponse>(
                serviceImpl, METHODID_WALLET_EXISTS)))
        .addMethod(
          METHOD_CREATE_WALLET,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.CreateWalletRequest,
              walletrpc.Api.CreateWalletResponse>(
                serviceImpl, METHODID_CREATE_WALLET)))
        .addMethod(
          METHOD_OPEN_WALLET,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.OpenWalletRequest,
              walletrpc.Api.OpenWalletResponse>(
                serviceImpl, METHODID_OPEN_WALLET)))
        .addMethod(
          METHOD_CLOSE_WALLET,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.CloseWalletRequest,
              walletrpc.Api.CloseWalletResponse>(
                serviceImpl, METHODID_CLOSE_WALLET)))
        .addMethod(
          METHOD_START_CONSENSUS_RPC,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.StartConsensusRpcRequest,
              walletrpc.Api.StartConsensusRpcResponse>(
                serviceImpl, METHODID_START_CONSENSUS_RPC)))
        .build();
  }
}

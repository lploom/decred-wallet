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
public class WalletServiceGrpc {

  private WalletServiceGrpc() {}

  public static final String SERVICE_NAME = "walletrpc.WalletService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.PingRequest,
      walletrpc.Api.PingResponse> METHOD_PING =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "Ping"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.PingRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.PingResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.NetworkRequest,
      walletrpc.Api.NetworkResponse> METHOD_NETWORK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "Network"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.NetworkRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.NetworkResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.AccountNumberRequest,
      walletrpc.Api.AccountNumberResponse> METHOD_ACCOUNT_NUMBER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "AccountNumber"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.AccountNumberRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.AccountNumberResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.AccountsRequest,
      walletrpc.Api.AccountsResponse> METHOD_ACCOUNTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "Accounts"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.AccountsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.AccountsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.BalanceRequest,
      walletrpc.Api.BalanceResponse> METHOD_BALANCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "Balance"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.BalanceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.BalanceResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.GetTransactionsRequest,
      walletrpc.Api.GetTransactionsResponse> METHOD_GET_TRANSACTIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "GetTransactions"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.GetTransactionsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.GetTransactionsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.TransactionNotificationsRequest,
      walletrpc.Api.TransactionNotificationsResponse> METHOD_TRANSACTION_NOTIFICATIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "walletrpc.WalletService", "TransactionNotifications"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.TransactionNotificationsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.TransactionNotificationsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.SpentnessNotificationsRequest,
      walletrpc.Api.SpentnessNotificationsResponse> METHOD_SPENTNESS_NOTIFICATIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "walletrpc.WalletService", "SpentnessNotifications"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.SpentnessNotificationsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.SpentnessNotificationsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.AccountNotificationsRequest,
      walletrpc.Api.AccountNotificationsResponse> METHOD_ACCOUNT_NOTIFICATIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "walletrpc.WalletService", "AccountNotifications"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.AccountNotificationsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.AccountNotificationsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.ChangePassphraseRequest,
      walletrpc.Api.ChangePassphraseResponse> METHOD_CHANGE_PASSPHRASE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "ChangePassphrase"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.ChangePassphraseRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.ChangePassphraseResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.RenameAccountRequest,
      walletrpc.Api.RenameAccountResponse> METHOD_RENAME_ACCOUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "RenameAccount"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.RenameAccountRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.RenameAccountResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.NextAccountRequest,
      walletrpc.Api.NextAccountResponse> METHOD_NEXT_ACCOUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "NextAccount"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.NextAccountRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.NextAccountResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.NextAddressRequest,
      walletrpc.Api.NextAddressResponse> METHOD_NEXT_ADDRESS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "NextAddress"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.NextAddressRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.NextAddressResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.ImportPrivateKeyRequest,
      walletrpc.Api.ImportPrivateKeyResponse> METHOD_IMPORT_PRIVATE_KEY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "ImportPrivateKey"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.ImportPrivateKeyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.ImportPrivateKeyResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.FundTransactionRequest,
      walletrpc.Api.FundTransactionResponse> METHOD_FUND_TRANSACTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "FundTransaction"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.FundTransactionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.FundTransactionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.SignTransactionRequest,
      walletrpc.Api.SignTransactionResponse> METHOD_SIGN_TRANSACTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "SignTransaction"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.SignTransactionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.SignTransactionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<walletrpc.Api.PublishTransactionRequest,
      walletrpc.Api.PublishTransactionResponse> METHOD_PUBLISH_TRANSACTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "walletrpc.WalletService", "PublishTransaction"),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.PublishTransactionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(walletrpc.Api.PublishTransactionResponse.getDefaultInstance()));

  public static WalletServiceStub newStub(io.grpc.Channel channel) {
    return new WalletServiceStub(channel);
  }

  public static WalletServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WalletServiceBlockingStub(channel);
  }

  public static WalletServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WalletServiceFutureStub(channel);
  }

  public static interface WalletService {

    public void ping(walletrpc.Api.PingRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.PingResponse> responseObserver);

    public void network(walletrpc.Api.NetworkRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.NetworkResponse> responseObserver);

    public void accountNumber(walletrpc.Api.AccountNumberRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.AccountNumberResponse> responseObserver);

    public void accounts(walletrpc.Api.AccountsRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.AccountsResponse> responseObserver);

    public void balance(walletrpc.Api.BalanceRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.BalanceResponse> responseObserver);

    public void getTransactions(walletrpc.Api.GetTransactionsRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.GetTransactionsResponse> responseObserver);

    public void transactionNotifications(walletrpc.Api.TransactionNotificationsRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.TransactionNotificationsResponse> responseObserver);

    public void spentnessNotifications(walletrpc.Api.SpentnessNotificationsRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.SpentnessNotificationsResponse> responseObserver);

    public void accountNotifications(walletrpc.Api.AccountNotificationsRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.AccountNotificationsResponse> responseObserver);

    public void changePassphrase(walletrpc.Api.ChangePassphraseRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.ChangePassphraseResponse> responseObserver);

    public void renameAccount(walletrpc.Api.RenameAccountRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.RenameAccountResponse> responseObserver);

    public void nextAccount(walletrpc.Api.NextAccountRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.NextAccountResponse> responseObserver);

    public void nextAddress(walletrpc.Api.NextAddressRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.NextAddressResponse> responseObserver);

    public void importPrivateKey(walletrpc.Api.ImportPrivateKeyRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.ImportPrivateKeyResponse> responseObserver);

    public void fundTransaction(walletrpc.Api.FundTransactionRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.FundTransactionResponse> responseObserver);

    public void signTransaction(walletrpc.Api.SignTransactionRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.SignTransactionResponse> responseObserver);

    public void publishTransaction(walletrpc.Api.PublishTransactionRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.PublishTransactionResponse> responseObserver);
  }

  public static interface WalletServiceBlockingClient {

    public walletrpc.Api.PingResponse ping(walletrpc.Api.PingRequest request);

    public walletrpc.Api.NetworkResponse network(walletrpc.Api.NetworkRequest request);

    public walletrpc.Api.AccountNumberResponse accountNumber(walletrpc.Api.AccountNumberRequest request);

    public walletrpc.Api.AccountsResponse accounts(walletrpc.Api.AccountsRequest request);

    public walletrpc.Api.BalanceResponse balance(walletrpc.Api.BalanceRequest request);

    public walletrpc.Api.GetTransactionsResponse getTransactions(walletrpc.Api.GetTransactionsRequest request);

    public java.util.Iterator<walletrpc.Api.TransactionNotificationsResponse> transactionNotifications(
        walletrpc.Api.TransactionNotificationsRequest request);

    public java.util.Iterator<walletrpc.Api.SpentnessNotificationsResponse> spentnessNotifications(
        walletrpc.Api.SpentnessNotificationsRequest request);

    public java.util.Iterator<walletrpc.Api.AccountNotificationsResponse> accountNotifications(
        walletrpc.Api.AccountNotificationsRequest request);

    public walletrpc.Api.ChangePassphraseResponse changePassphrase(walletrpc.Api.ChangePassphraseRequest request);

    public walletrpc.Api.RenameAccountResponse renameAccount(walletrpc.Api.RenameAccountRequest request);

    public walletrpc.Api.NextAccountResponse nextAccount(walletrpc.Api.NextAccountRequest request);

    public walletrpc.Api.NextAddressResponse nextAddress(walletrpc.Api.NextAddressRequest request);

    public walletrpc.Api.ImportPrivateKeyResponse importPrivateKey(walletrpc.Api.ImportPrivateKeyRequest request);

    public walletrpc.Api.FundTransactionResponse fundTransaction(walletrpc.Api.FundTransactionRequest request);

    public walletrpc.Api.SignTransactionResponse signTransaction(walletrpc.Api.SignTransactionRequest request);

    public walletrpc.Api.PublishTransactionResponse publishTransaction(walletrpc.Api.PublishTransactionRequest request);
  }

  public static interface WalletServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.PingResponse> ping(
        walletrpc.Api.PingRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.NetworkResponse> network(
        walletrpc.Api.NetworkRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.AccountNumberResponse> accountNumber(
        walletrpc.Api.AccountNumberRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.AccountsResponse> accounts(
        walletrpc.Api.AccountsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.BalanceResponse> balance(
        walletrpc.Api.BalanceRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.GetTransactionsResponse> getTransactions(
        walletrpc.Api.GetTransactionsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.ChangePassphraseResponse> changePassphrase(
        walletrpc.Api.ChangePassphraseRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.RenameAccountResponse> renameAccount(
        walletrpc.Api.RenameAccountRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.NextAccountResponse> nextAccount(
        walletrpc.Api.NextAccountRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.NextAddressResponse> nextAddress(
        walletrpc.Api.NextAddressRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.ImportPrivateKeyResponse> importPrivateKey(
        walletrpc.Api.ImportPrivateKeyRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.FundTransactionResponse> fundTransaction(
        walletrpc.Api.FundTransactionRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.SignTransactionResponse> signTransaction(
        walletrpc.Api.SignTransactionRequest request);

    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.PublishTransactionResponse> publishTransaction(
        walletrpc.Api.PublishTransactionRequest request);
  }

  public static class WalletServiceStub extends io.grpc.stub.AbstractStub<WalletServiceStub>
      implements WalletService {
    private WalletServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void ping(walletrpc.Api.PingRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void network(walletrpc.Api.NetworkRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.NetworkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NETWORK, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void accountNumber(walletrpc.Api.AccountNumberRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.AccountNumberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACCOUNT_NUMBER, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void accounts(walletrpc.Api.AccountsRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.AccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACCOUNTS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void balance(walletrpc.Api.BalanceRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.BalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BALANCE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getTransactions(walletrpc.Api.GetTransactionsRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.GetTransactionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSACTIONS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void transactionNotifications(walletrpc.Api.TransactionNotificationsRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.TransactionNotificationsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_TRANSACTION_NOTIFICATIONS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void spentnessNotifications(walletrpc.Api.SpentnessNotificationsRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.SpentnessNotificationsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SPENTNESS_NOTIFICATIONS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void accountNotifications(walletrpc.Api.AccountNotificationsRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.AccountNotificationsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_ACCOUNT_NOTIFICATIONS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void changePassphrase(walletrpc.Api.ChangePassphraseRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.ChangePassphraseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHANGE_PASSPHRASE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void renameAccount(walletrpc.Api.RenameAccountRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.RenameAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RENAME_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void nextAccount(walletrpc.Api.NextAccountRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.NextAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NEXT_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void nextAddress(walletrpc.Api.NextAddressRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.NextAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NEXT_ADDRESS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void importPrivateKey(walletrpc.Api.ImportPrivateKeyRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.ImportPrivateKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IMPORT_PRIVATE_KEY, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void fundTransaction(walletrpc.Api.FundTransactionRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.FundTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FUND_TRANSACTION, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void signTransaction(walletrpc.Api.SignTransactionRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.SignTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SIGN_TRANSACTION, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void publishTransaction(walletrpc.Api.PublishTransactionRequest request,
        io.grpc.stub.StreamObserver<walletrpc.Api.PublishTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PUBLISH_TRANSACTION, getCallOptions()), request, responseObserver);
    }
  }

  public static class WalletServiceBlockingStub extends io.grpc.stub.AbstractStub<WalletServiceBlockingStub>
      implements WalletServiceBlockingClient {
    private WalletServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public walletrpc.Api.PingResponse ping(walletrpc.Api.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.NetworkResponse network(walletrpc.Api.NetworkRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NETWORK, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.AccountNumberResponse accountNumber(walletrpc.Api.AccountNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACCOUNT_NUMBER, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.AccountsResponse accounts(walletrpc.Api.AccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACCOUNTS, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.BalanceResponse balance(walletrpc.Api.BalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BALANCE, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.GetTransactionsResponse getTransactions(walletrpc.Api.GetTransactionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TRANSACTIONS, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<walletrpc.Api.TransactionNotificationsResponse> transactionNotifications(
        walletrpc.Api.TransactionNotificationsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_TRANSACTION_NOTIFICATIONS, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<walletrpc.Api.SpentnessNotificationsResponse> spentnessNotifications(
        walletrpc.Api.SpentnessNotificationsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SPENTNESS_NOTIFICATIONS, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<walletrpc.Api.AccountNotificationsResponse> accountNotifications(
        walletrpc.Api.AccountNotificationsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_ACCOUNT_NOTIFICATIONS, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.ChangePassphraseResponse changePassphrase(walletrpc.Api.ChangePassphraseRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHANGE_PASSPHRASE, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.RenameAccountResponse renameAccount(walletrpc.Api.RenameAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RENAME_ACCOUNT, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.NextAccountResponse nextAccount(walletrpc.Api.NextAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NEXT_ACCOUNT, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.NextAddressResponse nextAddress(walletrpc.Api.NextAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NEXT_ADDRESS, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.ImportPrivateKeyResponse importPrivateKey(walletrpc.Api.ImportPrivateKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IMPORT_PRIVATE_KEY, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.FundTransactionResponse fundTransaction(walletrpc.Api.FundTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FUND_TRANSACTION, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.SignTransactionResponse signTransaction(walletrpc.Api.SignTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SIGN_TRANSACTION, getCallOptions(), request);
    }

    @java.lang.Override
    public walletrpc.Api.PublishTransactionResponse publishTransaction(walletrpc.Api.PublishTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PUBLISH_TRANSACTION, getCallOptions(), request);
    }
  }

  public static class WalletServiceFutureStub extends io.grpc.stub.AbstractStub<WalletServiceFutureStub>
      implements WalletServiceFutureClient {
    private WalletServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.PingResponse> ping(
        walletrpc.Api.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.NetworkResponse> network(
        walletrpc.Api.NetworkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NETWORK, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.AccountNumberResponse> accountNumber(
        walletrpc.Api.AccountNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACCOUNT_NUMBER, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.AccountsResponse> accounts(
        walletrpc.Api.AccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACCOUNTS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.BalanceResponse> balance(
        walletrpc.Api.BalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BALANCE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.GetTransactionsResponse> getTransactions(
        walletrpc.Api.GetTransactionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSACTIONS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.ChangePassphraseResponse> changePassphrase(
        walletrpc.Api.ChangePassphraseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHANGE_PASSPHRASE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.RenameAccountResponse> renameAccount(
        walletrpc.Api.RenameAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RENAME_ACCOUNT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.NextAccountResponse> nextAccount(
        walletrpc.Api.NextAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NEXT_ACCOUNT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.NextAddressResponse> nextAddress(
        walletrpc.Api.NextAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NEXT_ADDRESS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.ImportPrivateKeyResponse> importPrivateKey(
        walletrpc.Api.ImportPrivateKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IMPORT_PRIVATE_KEY, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.FundTransactionResponse> fundTransaction(
        walletrpc.Api.FundTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FUND_TRANSACTION, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.SignTransactionResponse> signTransaction(
        walletrpc.Api.SignTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SIGN_TRANSACTION, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<walletrpc.Api.PublishTransactionResponse> publishTransaction(
        walletrpc.Api.PublishTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PUBLISH_TRANSACTION, getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_NETWORK = 1;
  private static final int METHODID_ACCOUNT_NUMBER = 2;
  private static final int METHODID_ACCOUNTS = 3;
  private static final int METHODID_BALANCE = 4;
  private static final int METHODID_GET_TRANSACTIONS = 5;
  private static final int METHODID_TRANSACTION_NOTIFICATIONS = 6;
  private static final int METHODID_SPENTNESS_NOTIFICATIONS = 7;
  private static final int METHODID_ACCOUNT_NOTIFICATIONS = 8;
  private static final int METHODID_CHANGE_PASSPHRASE = 9;
  private static final int METHODID_RENAME_ACCOUNT = 10;
  private static final int METHODID_NEXT_ACCOUNT = 11;
  private static final int METHODID_NEXT_ADDRESS = 12;
  private static final int METHODID_IMPORT_PRIVATE_KEY = 13;
  private static final int METHODID_FUND_TRANSACTION = 14;
  private static final int METHODID_SIGN_TRANSACTION = 15;
  private static final int METHODID_PUBLISH_TRANSACTION = 16;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletService serviceImpl;
    private final int methodId;

    public MethodHandlers(WalletService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((walletrpc.Api.PingRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.PingResponse>) responseObserver);
          break;
        case METHODID_NETWORK:
          serviceImpl.network((walletrpc.Api.NetworkRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.NetworkResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_NUMBER:
          serviceImpl.accountNumber((walletrpc.Api.AccountNumberRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.AccountNumberResponse>) responseObserver);
          break;
        case METHODID_ACCOUNTS:
          serviceImpl.accounts((walletrpc.Api.AccountsRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.AccountsResponse>) responseObserver);
          break;
        case METHODID_BALANCE:
          serviceImpl.balance((walletrpc.Api.BalanceRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.BalanceResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTIONS:
          serviceImpl.getTransactions((walletrpc.Api.GetTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.GetTransactionsResponse>) responseObserver);
          break;
        case METHODID_TRANSACTION_NOTIFICATIONS:
          serviceImpl.transactionNotifications((walletrpc.Api.TransactionNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.TransactionNotificationsResponse>) responseObserver);
          break;
        case METHODID_SPENTNESS_NOTIFICATIONS:
          serviceImpl.spentnessNotifications((walletrpc.Api.SpentnessNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.SpentnessNotificationsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_NOTIFICATIONS:
          serviceImpl.accountNotifications((walletrpc.Api.AccountNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.AccountNotificationsResponse>) responseObserver);
          break;
        case METHODID_CHANGE_PASSPHRASE:
          serviceImpl.changePassphrase((walletrpc.Api.ChangePassphraseRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.ChangePassphraseResponse>) responseObserver);
          break;
        case METHODID_RENAME_ACCOUNT:
          serviceImpl.renameAccount((walletrpc.Api.RenameAccountRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.RenameAccountResponse>) responseObserver);
          break;
        case METHODID_NEXT_ACCOUNT:
          serviceImpl.nextAccount((walletrpc.Api.NextAccountRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.NextAccountResponse>) responseObserver);
          break;
        case METHODID_NEXT_ADDRESS:
          serviceImpl.nextAddress((walletrpc.Api.NextAddressRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.NextAddressResponse>) responseObserver);
          break;
        case METHODID_IMPORT_PRIVATE_KEY:
          serviceImpl.importPrivateKey((walletrpc.Api.ImportPrivateKeyRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.ImportPrivateKeyResponse>) responseObserver);
          break;
        case METHODID_FUND_TRANSACTION:
          serviceImpl.fundTransaction((walletrpc.Api.FundTransactionRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.FundTransactionResponse>) responseObserver);
          break;
        case METHODID_SIGN_TRANSACTION:
          serviceImpl.signTransaction((walletrpc.Api.SignTransactionRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.SignTransactionResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_TRANSACTION:
          serviceImpl.publishTransaction((walletrpc.Api.PublishTransactionRequest) request,
              (io.grpc.stub.StreamObserver<walletrpc.Api.PublishTransactionResponse>) responseObserver);
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
      final WalletService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_PING,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.PingRequest,
              walletrpc.Api.PingResponse>(
                serviceImpl, METHODID_PING)))
        .addMethod(
          METHOD_NETWORK,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.NetworkRequest,
              walletrpc.Api.NetworkResponse>(
                serviceImpl, METHODID_NETWORK)))
        .addMethod(
          METHOD_ACCOUNT_NUMBER,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.AccountNumberRequest,
              walletrpc.Api.AccountNumberResponse>(
                serviceImpl, METHODID_ACCOUNT_NUMBER)))
        .addMethod(
          METHOD_ACCOUNTS,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.AccountsRequest,
              walletrpc.Api.AccountsResponse>(
                serviceImpl, METHODID_ACCOUNTS)))
        .addMethod(
          METHOD_BALANCE,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.BalanceRequest,
              walletrpc.Api.BalanceResponse>(
                serviceImpl, METHODID_BALANCE)))
        .addMethod(
          METHOD_GET_TRANSACTIONS,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.GetTransactionsRequest,
              walletrpc.Api.GetTransactionsResponse>(
                serviceImpl, METHODID_GET_TRANSACTIONS)))
        .addMethod(
          METHOD_TRANSACTION_NOTIFICATIONS,
          asyncServerStreamingCall(
            new MethodHandlers<
              walletrpc.Api.TransactionNotificationsRequest,
              walletrpc.Api.TransactionNotificationsResponse>(
                serviceImpl, METHODID_TRANSACTION_NOTIFICATIONS)))
        .addMethod(
          METHOD_SPENTNESS_NOTIFICATIONS,
          asyncServerStreamingCall(
            new MethodHandlers<
              walletrpc.Api.SpentnessNotificationsRequest,
              walletrpc.Api.SpentnessNotificationsResponse>(
                serviceImpl, METHODID_SPENTNESS_NOTIFICATIONS)))
        .addMethod(
          METHOD_ACCOUNT_NOTIFICATIONS,
          asyncServerStreamingCall(
            new MethodHandlers<
              walletrpc.Api.AccountNotificationsRequest,
              walletrpc.Api.AccountNotificationsResponse>(
                serviceImpl, METHODID_ACCOUNT_NOTIFICATIONS)))
        .addMethod(
          METHOD_CHANGE_PASSPHRASE,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.ChangePassphraseRequest,
              walletrpc.Api.ChangePassphraseResponse>(
                serviceImpl, METHODID_CHANGE_PASSPHRASE)))
        .addMethod(
          METHOD_RENAME_ACCOUNT,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.RenameAccountRequest,
              walletrpc.Api.RenameAccountResponse>(
                serviceImpl, METHODID_RENAME_ACCOUNT)))
        .addMethod(
          METHOD_NEXT_ACCOUNT,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.NextAccountRequest,
              walletrpc.Api.NextAccountResponse>(
                serviceImpl, METHODID_NEXT_ACCOUNT)))
        .addMethod(
          METHOD_NEXT_ADDRESS,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.NextAddressRequest,
              walletrpc.Api.NextAddressResponse>(
                serviceImpl, METHODID_NEXT_ADDRESS)))
        .addMethod(
          METHOD_IMPORT_PRIVATE_KEY,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.ImportPrivateKeyRequest,
              walletrpc.Api.ImportPrivateKeyResponse>(
                serviceImpl, METHODID_IMPORT_PRIVATE_KEY)))
        .addMethod(
          METHOD_FUND_TRANSACTION,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.FundTransactionRequest,
              walletrpc.Api.FundTransactionResponse>(
                serviceImpl, METHODID_FUND_TRANSACTION)))
        .addMethod(
          METHOD_SIGN_TRANSACTION,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.SignTransactionRequest,
              walletrpc.Api.SignTransactionResponse>(
                serviceImpl, METHODID_SIGN_TRANSACTION)))
        .addMethod(
          METHOD_PUBLISH_TRANSACTION,
          asyncUnaryCall(
            new MethodHandlers<
              walletrpc.Api.PublishTransactionRequest,
              walletrpc.Api.PublishTransactionResponse>(
                serviceImpl, METHODID_PUBLISH_TRANSACTION)))
        .build();
  }
}

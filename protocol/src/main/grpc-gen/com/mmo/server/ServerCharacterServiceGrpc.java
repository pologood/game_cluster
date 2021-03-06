package com.mmo.server;

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
    value = "by gRPC proto compiler (version 0.14.1)",
    comments = "Source: char_server.proto")
public class ServerCharacterServiceGrpc {

  private ServerCharacterServiceGrpc() {}

  public static final String SERVICE_NAME = "ServerCharacterService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.mmo.server.ServerCharacterProtocol.GetCharacterRequest,
      com.mmo.server.ServerCharacterProtocol.GetCharacterResponse> METHOD_GET_CHARACTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ServerCharacterService", "getCharacter"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.mmo.server.ServerCharacterProtocol.GetCharacterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.mmo.server.ServerCharacterProtocol.GetCharacterResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.mmo.server.ServerCharacterProtocol.UpdateCharacterRequest,
      com.mmo.server.CommonProtocol.CommonResponse> METHOD_UPDATE_CHARACTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ServerCharacterService", "updateCharacter"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.mmo.server.ServerCharacterProtocol.UpdateCharacterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.mmo.server.CommonProtocol.CommonResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.mmo.server.ServerCharacterProtocol.CreateCharacterRequest,
      com.mmo.server.ServerCharacterProtocol.CreateCharacterResponse> METHOD_CREATE_CHARACTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ServerCharacterService", "createCharacter"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.mmo.server.ServerCharacterProtocol.CreateCharacterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.mmo.server.ServerCharacterProtocol.CreateCharacterResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.mmo.server.ServerCharacterProtocol.CharacterUnloadRequest,
      com.mmo.server.CommonProtocol.CommonResponse> METHOD_CHARACTER_UNLOAD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ServerCharacterService", "characterUnload"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.mmo.server.ServerCharacterProtocol.CharacterUnloadRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.mmo.server.CommonProtocol.CommonResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerCharacterServiceStub newStub(io.grpc.Channel channel) {
    return new ServerCharacterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerCharacterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServerCharacterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ServerCharacterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServerCharacterServiceFutureStub(channel);
  }

  /**
   */
  public static interface ServerCharacterService {

    /**
     */
    public void getCharacter(com.mmo.server.ServerCharacterProtocol.GetCharacterRequest request,
        io.grpc.stub.StreamObserver<com.mmo.server.ServerCharacterProtocol.GetCharacterResponse> responseObserver);

    /**
     */
    public void updateCharacter(com.mmo.server.ServerCharacterProtocol.UpdateCharacterRequest request,
        io.grpc.stub.StreamObserver<com.mmo.server.CommonProtocol.CommonResponse> responseObserver);

    /**
     */
    public void createCharacter(com.mmo.server.ServerCharacterProtocol.CreateCharacterRequest request,
        io.grpc.stub.StreamObserver<com.mmo.server.ServerCharacterProtocol.CreateCharacterResponse> responseObserver);

    /**
     */
    public void characterUnload(com.mmo.server.ServerCharacterProtocol.CharacterUnloadRequest request,
        io.grpc.stub.StreamObserver<com.mmo.server.CommonProtocol.CommonResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractServerCharacterService implements ServerCharacterService, io.grpc.BindableService {

    @java.lang.Override
    public void getCharacter(com.mmo.server.ServerCharacterProtocol.GetCharacterRequest request,
        io.grpc.stub.StreamObserver<com.mmo.server.ServerCharacterProtocol.GetCharacterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CHARACTER, responseObserver);
    }

    @java.lang.Override
    public void updateCharacter(com.mmo.server.ServerCharacterProtocol.UpdateCharacterRequest request,
        io.grpc.stub.StreamObserver<com.mmo.server.CommonProtocol.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_CHARACTER, responseObserver);
    }

    @java.lang.Override
    public void createCharacter(com.mmo.server.ServerCharacterProtocol.CreateCharacterRequest request,
        io.grpc.stub.StreamObserver<com.mmo.server.ServerCharacterProtocol.CreateCharacterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CHARACTER, responseObserver);
    }

    @java.lang.Override
    public void characterUnload(com.mmo.server.ServerCharacterProtocol.CharacterUnloadRequest request,
        io.grpc.stub.StreamObserver<com.mmo.server.CommonProtocol.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHARACTER_UNLOAD, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return ServerCharacterServiceGrpc.bindService(this);
    }
  }

  /**
   */
  public static interface ServerCharacterServiceBlockingClient {

    /**
     */
    public com.mmo.server.ServerCharacterProtocol.GetCharacterResponse getCharacter(com.mmo.server.ServerCharacterProtocol.GetCharacterRequest request);

    /**
     */
    public com.mmo.server.CommonProtocol.CommonResponse updateCharacter(com.mmo.server.ServerCharacterProtocol.UpdateCharacterRequest request);

    /**
     */
    public com.mmo.server.ServerCharacterProtocol.CreateCharacterResponse createCharacter(com.mmo.server.ServerCharacterProtocol.CreateCharacterRequest request);

    /**
     */
    public com.mmo.server.CommonProtocol.CommonResponse characterUnload(com.mmo.server.ServerCharacterProtocol.CharacterUnloadRequest request);
  }

  /**
   */
  public static interface ServerCharacterServiceFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mmo.server.ServerCharacterProtocol.GetCharacterResponse> getCharacter(
        com.mmo.server.ServerCharacterProtocol.GetCharacterRequest request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mmo.server.CommonProtocol.CommonResponse> updateCharacter(
        com.mmo.server.ServerCharacterProtocol.UpdateCharacterRequest request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mmo.server.ServerCharacterProtocol.CreateCharacterResponse> createCharacter(
        com.mmo.server.ServerCharacterProtocol.CreateCharacterRequest request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mmo.server.CommonProtocol.CommonResponse> characterUnload(
        com.mmo.server.ServerCharacterProtocol.CharacterUnloadRequest request);
  }

  public static class ServerCharacterServiceStub extends io.grpc.stub.AbstractStub<ServerCharacterServiceStub>
      implements ServerCharacterService {
    private ServerCharacterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerCharacterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerCharacterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerCharacterServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void getCharacter(com.mmo.server.ServerCharacterProtocol.GetCharacterRequest request,
        io.grpc.stub.StreamObserver<com.mmo.server.ServerCharacterProtocol.GetCharacterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CHARACTER, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void updateCharacter(com.mmo.server.ServerCharacterProtocol.UpdateCharacterRequest request,
        io.grpc.stub.StreamObserver<com.mmo.server.CommonProtocol.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CHARACTER, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void createCharacter(com.mmo.server.ServerCharacterProtocol.CreateCharacterRequest request,
        io.grpc.stub.StreamObserver<com.mmo.server.ServerCharacterProtocol.CreateCharacterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CHARACTER, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void characterUnload(com.mmo.server.ServerCharacterProtocol.CharacterUnloadRequest request,
        io.grpc.stub.StreamObserver<com.mmo.server.CommonProtocol.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHARACTER_UNLOAD, getCallOptions()), request, responseObserver);
    }
  }

  public static class ServerCharacterServiceBlockingStub extends io.grpc.stub.AbstractStub<ServerCharacterServiceBlockingStub>
      implements ServerCharacterServiceBlockingClient {
    private ServerCharacterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerCharacterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerCharacterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerCharacterServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.mmo.server.ServerCharacterProtocol.GetCharacterResponse getCharacter(com.mmo.server.ServerCharacterProtocol.GetCharacterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CHARACTER, getCallOptions(), request);
    }

    @java.lang.Override
    public com.mmo.server.CommonProtocol.CommonResponse updateCharacter(com.mmo.server.ServerCharacterProtocol.UpdateCharacterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_CHARACTER, getCallOptions(), request);
    }

    @java.lang.Override
    public com.mmo.server.ServerCharacterProtocol.CreateCharacterResponse createCharacter(com.mmo.server.ServerCharacterProtocol.CreateCharacterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CHARACTER, getCallOptions(), request);
    }

    @java.lang.Override
    public com.mmo.server.CommonProtocol.CommonResponse characterUnload(com.mmo.server.ServerCharacterProtocol.CharacterUnloadRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHARACTER_UNLOAD, getCallOptions(), request);
    }
  }

  public static class ServerCharacterServiceFutureStub extends io.grpc.stub.AbstractStub<ServerCharacterServiceFutureStub>
      implements ServerCharacterServiceFutureClient {
    private ServerCharacterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerCharacterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerCharacterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerCharacterServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.mmo.server.ServerCharacterProtocol.GetCharacterResponse> getCharacter(
        com.mmo.server.ServerCharacterProtocol.GetCharacterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CHARACTER, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.mmo.server.CommonProtocol.CommonResponse> updateCharacter(
        com.mmo.server.ServerCharacterProtocol.UpdateCharacterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CHARACTER, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.mmo.server.ServerCharacterProtocol.CreateCharacterResponse> createCharacter(
        com.mmo.server.ServerCharacterProtocol.CreateCharacterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CHARACTER, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.mmo.server.CommonProtocol.CommonResponse> characterUnload(
        com.mmo.server.ServerCharacterProtocol.CharacterUnloadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHARACTER_UNLOAD, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CHARACTER = 0;
  private static final int METHODID_UPDATE_CHARACTER = 1;
  private static final int METHODID_CREATE_CHARACTER = 2;
  private static final int METHODID_CHARACTER_UNLOAD = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerCharacterService serviceImpl;
    private final int methodId;

    public MethodHandlers(ServerCharacterService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CHARACTER:
          serviceImpl.getCharacter((com.mmo.server.ServerCharacterProtocol.GetCharacterRequest) request,
              (io.grpc.stub.StreamObserver<com.mmo.server.ServerCharacterProtocol.GetCharacterResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CHARACTER:
          serviceImpl.updateCharacter((com.mmo.server.ServerCharacterProtocol.UpdateCharacterRequest) request,
              (io.grpc.stub.StreamObserver<com.mmo.server.CommonProtocol.CommonResponse>) responseObserver);
          break;
        case METHODID_CREATE_CHARACTER:
          serviceImpl.createCharacter((com.mmo.server.ServerCharacterProtocol.CreateCharacterRequest) request,
              (io.grpc.stub.StreamObserver<com.mmo.server.ServerCharacterProtocol.CreateCharacterResponse>) responseObserver);
          break;
        case METHODID_CHARACTER_UNLOAD:
          serviceImpl.characterUnload((com.mmo.server.ServerCharacterProtocol.CharacterUnloadRequest) request,
              (io.grpc.stub.StreamObserver<com.mmo.server.CommonProtocol.CommonResponse>) responseObserver);
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

  public static io.grpc.ServerServiceDefinition bindService(
      final ServerCharacterService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_GET_CHARACTER,
          asyncUnaryCall(
            new MethodHandlers<
              com.mmo.server.ServerCharacterProtocol.GetCharacterRequest,
              com.mmo.server.ServerCharacterProtocol.GetCharacterResponse>(
                serviceImpl, METHODID_GET_CHARACTER)))
        .addMethod(
          METHOD_UPDATE_CHARACTER,
          asyncUnaryCall(
            new MethodHandlers<
              com.mmo.server.ServerCharacterProtocol.UpdateCharacterRequest,
              com.mmo.server.CommonProtocol.CommonResponse>(
                serviceImpl, METHODID_UPDATE_CHARACTER)))
        .addMethod(
          METHOD_CREATE_CHARACTER,
          asyncUnaryCall(
            new MethodHandlers<
              com.mmo.server.ServerCharacterProtocol.CreateCharacterRequest,
              com.mmo.server.ServerCharacterProtocol.CreateCharacterResponse>(
                serviceImpl, METHODID_CREATE_CHARACTER)))
        .addMethod(
          METHOD_CHARACTER_UNLOAD,
          asyncUnaryCall(
            new MethodHandlers<
              com.mmo.server.ServerCharacterProtocol.CharacterUnloadRequest,
              com.mmo.server.CommonProtocol.CommonResponse>(
                serviceImpl, METHODID_CHARACTER_UNLOAD)))
        .build();
  }
}

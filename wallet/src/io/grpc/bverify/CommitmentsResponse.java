// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/api.proto

package io.grpc.bverify;

/**
 * Protobuf type {@code api.CommitmentsResponse}
 */
public  final class CommitmentsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.CommitmentsResponse)
    CommitmentsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommitmentsResponse.newBuilder() to construct.
  private CommitmentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommitmentsResponse() {
    commitments_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CommitmentsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              commitments_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            commitments_.add(input.readBytes());
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        commitments_ = java.util.Collections.unmodifiableList(commitments_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Api.internal_static_api_CommitmentsResponse_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Api.internal_static_api_CommitmentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CommitmentsResponse.class, Builder.class);
  }

  public static final int COMMITMENTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.protobuf.ByteString> commitments_;
  /**
   * <code>repeated bytes commitments = 1;</code>
   */
  public java.util.List<com.google.protobuf.ByteString>
      getCommitmentsList() {
    return commitments_;
  }
  /**
   * <code>repeated bytes commitments = 1;</code>
   */
  public int getCommitmentsCount() {
    return commitments_.size();
  }
  /**
   * <code>repeated bytes commitments = 1;</code>
   */
  public com.google.protobuf.ByteString getCommitments(int index) {
    return commitments_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < commitments_.size(); i++) {
      output.writeBytes(1, commitments_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < commitments_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(commitments_.get(i));
      }
      size += dataSize;
      size += 1 * getCommitmentsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof CommitmentsResponse)) {
      return super.equals(obj);
    }
    CommitmentsResponse other = (CommitmentsResponse) obj;

    boolean result = true;
    result = result && getCommitmentsList()
        .equals(other.getCommitmentsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCommitmentsCount() > 0) {
      hash = (37 * hash) + COMMITMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getCommitmentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CommitmentsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CommitmentsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CommitmentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CommitmentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CommitmentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CommitmentsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CommitmentsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CommitmentsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CommitmentsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CommitmentsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CommitmentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CommitmentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(CommitmentsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api.CommitmentsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.CommitmentsResponse)
      io.grpc.bverify.CommitmentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Api.internal_static_api_CommitmentsResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Api.internal_static_api_CommitmentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CommitmentsResponse.class, Builder.class);
    }

    // Construct using io.grpc.bverify.CommitmentsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      commitments_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Api.internal_static_api_CommitmentsResponse_descriptor;
    }

    public CommitmentsResponse getDefaultInstanceForType() {
      return CommitmentsResponse.getDefaultInstance();
    }

    public CommitmentsResponse build() {
      CommitmentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public CommitmentsResponse buildPartial() {
      CommitmentsResponse result = new CommitmentsResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        commitments_ = java.util.Collections.unmodifiableList(commitments_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.commitments_ = commitments_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof CommitmentsResponse) {
        return mergeFrom((CommitmentsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CommitmentsResponse other) {
      if (other == CommitmentsResponse.getDefaultInstance()) return this;
      if (!other.commitments_.isEmpty()) {
        if (commitments_.isEmpty()) {
          commitments_ = other.commitments_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCommitmentsIsMutable();
          commitments_.addAll(other.commitments_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      CommitmentsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (CommitmentsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.protobuf.ByteString> commitments_ = java.util.Collections.emptyList();
    private void ensureCommitmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        commitments_ = new java.util.ArrayList<com.google.protobuf.ByteString>(commitments_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated bytes commitments = 1;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getCommitmentsList() {
      return java.util.Collections.unmodifiableList(commitments_);
    }
    /**
     * <code>repeated bytes commitments = 1;</code>
     */
    public int getCommitmentsCount() {
      return commitments_.size();
    }
    /**
     * <code>repeated bytes commitments = 1;</code>
     */
    public com.google.protobuf.ByteString getCommitments(int index) {
      return commitments_.get(index);
    }
    /**
     * <code>repeated bytes commitments = 1;</code>
     */
    public Builder setCommitments(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCommitmentsIsMutable();
      commitments_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes commitments = 1;</code>
     */
    public Builder addCommitments(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCommitmentsIsMutable();
      commitments_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes commitments = 1;</code>
     */
    public Builder addAllCommitments(
        Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureCommitmentsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, commitments_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes commitments = 1;</code>
     */
    public Builder clearCommitments() {
      commitments_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.CommitmentsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.CommitmentsResponse)
  private static final CommitmentsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CommitmentsResponse();
  }

  public static CommitmentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitmentsResponse>
      PARSER = new com.google.protobuf.AbstractParser<CommitmentsResponse>() {
    public CommitmentsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CommitmentsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CommitmentsResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<CommitmentsResponse> getParserForType() {
    return PARSER;
  }

  public CommitmentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


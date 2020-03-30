/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v1/storage.proto

package com.google.storage.v1;

/**
 *
 *
 * <pre>
 * Request message for GetBucketAccessControl.
 * </pre>
 *
 * Protobuf type {@code google.storage.v1.GetBucketAccessControlRequest}
 */
public final class GetBucketAccessControlRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.storage.v1.GetBucketAccessControlRequest)
    GetBucketAccessControlRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetBucketAccessControlRequest.newBuilder() to construct.
  private GetBucketAccessControlRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetBucketAccessControlRequest() {
    bucket_ = "";
    entity_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetBucketAccessControlRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GetBucketAccessControlRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              bucket_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              entity_ = s;
              break;
            }
          case 34:
            {
              com.google.storage.v1.CommonRequestParams.Builder subBuilder = null;
              if (commonRequestParams_ != null) {
                subBuilder = commonRequestParams_.toBuilder();
              }
              commonRequestParams_ =
                  input.readMessage(
                      com.google.storage.v1.CommonRequestParams.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(commonRequestParams_);
                commonRequestParams_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.storage.v1.StorageOuterClass
        .internal_static_google_storage_v1_GetBucketAccessControlRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.storage.v1.StorageOuterClass
        .internal_static_google_storage_v1_GetBucketAccessControlRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.storage.v1.GetBucketAccessControlRequest.class,
            com.google.storage.v1.GetBucketAccessControlRequest.Builder.class);
  }

  public static final int BUCKET_FIELD_NUMBER = 1;
  private volatile java.lang.Object bucket_;
  /**
   *
   *
   * <pre>
   * Required. Name of a bucket.
   * </pre>
   *
   * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bucket.
   */
  public java.lang.String getBucket() {
    java.lang.Object ref = bucket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bucket_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of a bucket.
   * </pre>
   *
   * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for bucket.
   */
  public com.google.protobuf.ByteString getBucketBytes() {
    java.lang.Object ref = bucket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      bucket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_FIELD_NUMBER = 2;
  private volatile java.lang.Object entity_;
  /**
   *
   *
   * <pre>
   * Required. The entity holding the permission. Can be one of:
   * * `user-`*userId*
   * * `user-`*emailAddress*
   * * `group-`*groupId*
   * * `group-`*emailAddress*
   * * `allUsers`
   * * `allAuthenticatedUsers`
   * </pre>
   *
   * <code>string entity = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The entity.
   */
  public java.lang.String getEntity() {
    java.lang.Object ref = entity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entity_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The entity holding the permission. Can be one of:
   * * `user-`*userId*
   * * `user-`*emailAddress*
   * * `group-`*groupId*
   * * `group-`*emailAddress*
   * * `allUsers`
   * * `allAuthenticatedUsers`
   * </pre>
   *
   * <code>string entity = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for entity.
   */
  public com.google.protobuf.ByteString getEntityBytes() {
    java.lang.Object ref = entity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      entity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMON_REQUEST_PARAMS_FIELD_NUMBER = 4;
  private com.google.storage.v1.CommonRequestParams commonRequestParams_;
  /**
   *
   *
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 4;</code>
   *
   * @return Whether the commonRequestParams field is set.
   */
  public boolean hasCommonRequestParams() {
    return commonRequestParams_ != null;
  }
  /**
   *
   *
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 4;</code>
   *
   * @return The commonRequestParams.
   */
  public com.google.storage.v1.CommonRequestParams getCommonRequestParams() {
    return commonRequestParams_ == null
        ? com.google.storage.v1.CommonRequestParams.getDefaultInstance()
        : commonRequestParams_;
  }
  /**
   *
   *
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 4;</code>
   */
  public com.google.storage.v1.CommonRequestParamsOrBuilder getCommonRequestParamsOrBuilder() {
    return getCommonRequestParams();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getBucketBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bucket_);
    }
    if (!getEntityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entity_);
    }
    if (commonRequestParams_ != null) {
      output.writeMessage(4, getCommonRequestParams());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBucketBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bucket_);
    }
    if (!getEntityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, entity_);
    }
    if (commonRequestParams_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getCommonRequestParams());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.storage.v1.GetBucketAccessControlRequest)) {
      return super.equals(obj);
    }
    com.google.storage.v1.GetBucketAccessControlRequest other =
        (com.google.storage.v1.GetBucketAccessControlRequest) obj;

    if (!getBucket().equals(other.getBucket())) return false;
    if (!getEntity().equals(other.getEntity())) return false;
    if (hasCommonRequestParams() != other.hasCommonRequestParams()) return false;
    if (hasCommonRequestParams()) {
      if (!getCommonRequestParams().equals(other.getCommonRequestParams())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BUCKET_FIELD_NUMBER;
    hash = (53 * hash) + getBucket().hashCode();
    hash = (37 * hash) + ENTITY_FIELD_NUMBER;
    hash = (53 * hash) + getEntity().hashCode();
    if (hasCommonRequestParams()) {
      hash = (37 * hash) + COMMON_REQUEST_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getCommonRequestParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.storage.v1.GetBucketAccessControlRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for GetBucketAccessControl.
   * </pre>
   *
   * Protobuf type {@code google.storage.v1.GetBucketAccessControlRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.storage.v1.GetBucketAccessControlRequest)
      com.google.storage.v1.GetBucketAccessControlRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.storage.v1.StorageOuterClass
          .internal_static_google_storage_v1_GetBucketAccessControlRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.storage.v1.StorageOuterClass
          .internal_static_google_storage_v1_GetBucketAccessControlRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.storage.v1.GetBucketAccessControlRequest.class,
              com.google.storage.v1.GetBucketAccessControlRequest.Builder.class);
    }

    // Construct using com.google.storage.v1.GetBucketAccessControlRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bucket_ = "";

      entity_ = "";

      if (commonRequestParamsBuilder_ == null) {
        commonRequestParams_ = null;
      } else {
        commonRequestParams_ = null;
        commonRequestParamsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.storage.v1.StorageOuterClass
          .internal_static_google_storage_v1_GetBucketAccessControlRequest_descriptor;
    }

    @java.lang.Override
    public com.google.storage.v1.GetBucketAccessControlRequest getDefaultInstanceForType() {
      return com.google.storage.v1.GetBucketAccessControlRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.storage.v1.GetBucketAccessControlRequest build() {
      com.google.storage.v1.GetBucketAccessControlRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.storage.v1.GetBucketAccessControlRequest buildPartial() {
      com.google.storage.v1.GetBucketAccessControlRequest result =
          new com.google.storage.v1.GetBucketAccessControlRequest(this);
      result.bucket_ = bucket_;
      result.entity_ = entity_;
      if (commonRequestParamsBuilder_ == null) {
        result.commonRequestParams_ = commonRequestParams_;
      } else {
        result.commonRequestParams_ = commonRequestParamsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.storage.v1.GetBucketAccessControlRequest) {
        return mergeFrom((com.google.storage.v1.GetBucketAccessControlRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.storage.v1.GetBucketAccessControlRequest other) {
      if (other == com.google.storage.v1.GetBucketAccessControlRequest.getDefaultInstance())
        return this;
      if (!other.getBucket().isEmpty()) {
        bucket_ = other.bucket_;
        onChanged();
      }
      if (!other.getEntity().isEmpty()) {
        entity_ = other.entity_;
        onChanged();
      }
      if (other.hasCommonRequestParams()) {
        mergeCommonRequestParams(other.getCommonRequestParams());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.storage.v1.GetBucketAccessControlRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.storage.v1.GetBucketAccessControlRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object bucket_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of a bucket.
     * </pre>
     *
     * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bucket.
     */
    public java.lang.String getBucket() {
      java.lang.Object ref = bucket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bucket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of a bucket.
     * </pre>
     *
     * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for bucket.
     */
    public com.google.protobuf.ByteString getBucketBytes() {
      java.lang.Object ref = bucket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        bucket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of a bucket.
     * </pre>
     *
     * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucket(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      bucket_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of a bucket.
     * </pre>
     *
     * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBucket() {

      bucket_ = getDefaultInstance().getBucket();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of a bucket.
     * </pre>
     *
     * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucketBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      bucket_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object entity_ = "";
    /**
     *
     *
     * <pre>
     * Required. The entity holding the permission. Can be one of:
     * * `user-`*userId*
     * * `user-`*emailAddress*
     * * `group-`*groupId*
     * * `group-`*emailAddress*
     * * `allUsers`
     * * `allAuthenticatedUsers`
     * </pre>
     *
     * <code>string entity = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The entity.
     */
    public java.lang.String getEntity() {
      java.lang.Object ref = entity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The entity holding the permission. Can be one of:
     * * `user-`*userId*
     * * `user-`*emailAddress*
     * * `group-`*groupId*
     * * `group-`*emailAddress*
     * * `allUsers`
     * * `allAuthenticatedUsers`
     * </pre>
     *
     * <code>string entity = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for entity.
     */
    public com.google.protobuf.ByteString getEntityBytes() {
      java.lang.Object ref = entity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        entity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The entity holding the permission. Can be one of:
     * * `user-`*userId*
     * * `user-`*emailAddress*
     * * `group-`*groupId*
     * * `group-`*emailAddress*
     * * `allUsers`
     * * `allAuthenticatedUsers`
     * </pre>
     *
     * <code>string entity = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The entity to set.
     * @return This builder for chaining.
     */
    public Builder setEntity(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      entity_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entity holding the permission. Can be one of:
     * * `user-`*userId*
     * * `user-`*emailAddress*
     * * `group-`*groupId*
     * * `group-`*emailAddress*
     * * `allUsers`
     * * `allAuthenticatedUsers`
     * </pre>
     *
     * <code>string entity = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntity() {

      entity_ = getDefaultInstance().getEntity();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entity holding the permission. Can be one of:
     * * `user-`*userId*
     * * `user-`*emailAddress*
     * * `group-`*groupId*
     * * `group-`*emailAddress*
     * * `allUsers`
     * * `allAuthenticatedUsers`
     * </pre>
     *
     * <code>string entity = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for entity to set.
     * @return This builder for chaining.
     */
    public Builder setEntityBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      entity_ = value;
      onChanged();
      return this;
    }

    private com.google.storage.v1.CommonRequestParams commonRequestParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v1.CommonRequestParams,
            com.google.storage.v1.CommonRequestParams.Builder,
            com.google.storage.v1.CommonRequestParamsOrBuilder>
        commonRequestParamsBuilder_;
    /**
     *
     *
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 4;</code>
     *
     * @return Whether the commonRequestParams field is set.
     */
    public boolean hasCommonRequestParams() {
      return commonRequestParamsBuilder_ != null || commonRequestParams_ != null;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 4;</code>
     *
     * @return The commonRequestParams.
     */
    public com.google.storage.v1.CommonRequestParams getCommonRequestParams() {
      if (commonRequestParamsBuilder_ == null) {
        return commonRequestParams_ == null
            ? com.google.storage.v1.CommonRequestParams.getDefaultInstance()
            : commonRequestParams_;
      } else {
        return commonRequestParamsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 4;</code>
     */
    public Builder setCommonRequestParams(com.google.storage.v1.CommonRequestParams value) {
      if (commonRequestParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commonRequestParams_ = value;
        onChanged();
      } else {
        commonRequestParamsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 4;</code>
     */
    public Builder setCommonRequestParams(
        com.google.storage.v1.CommonRequestParams.Builder builderForValue) {
      if (commonRequestParamsBuilder_ == null) {
        commonRequestParams_ = builderForValue.build();
        onChanged();
      } else {
        commonRequestParamsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 4;</code>
     */
    public Builder mergeCommonRequestParams(com.google.storage.v1.CommonRequestParams value) {
      if (commonRequestParamsBuilder_ == null) {
        if (commonRequestParams_ != null) {
          commonRequestParams_ =
              com.google.storage.v1.CommonRequestParams.newBuilder(commonRequestParams_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          commonRequestParams_ = value;
        }
        onChanged();
      } else {
        commonRequestParamsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 4;</code>
     */
    public Builder clearCommonRequestParams() {
      if (commonRequestParamsBuilder_ == null) {
        commonRequestParams_ = null;
        onChanged();
      } else {
        commonRequestParams_ = null;
        commonRequestParamsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 4;</code>
     */
    public com.google.storage.v1.CommonRequestParams.Builder getCommonRequestParamsBuilder() {

      onChanged();
      return getCommonRequestParamsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 4;</code>
     */
    public com.google.storage.v1.CommonRequestParamsOrBuilder getCommonRequestParamsOrBuilder() {
      if (commonRequestParamsBuilder_ != null) {
        return commonRequestParamsBuilder_.getMessageOrBuilder();
      } else {
        return commonRequestParams_ == null
            ? com.google.storage.v1.CommonRequestParams.getDefaultInstance()
            : commonRequestParams_;
      }
    }
    /**
     *
     *
     * <pre>
     * A set of parameters common to all Storage API requests.
     * </pre>
     *
     * <code>.google.storage.v1.CommonRequestParams common_request_params = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v1.CommonRequestParams,
            com.google.storage.v1.CommonRequestParams.Builder,
            com.google.storage.v1.CommonRequestParamsOrBuilder>
        getCommonRequestParamsFieldBuilder() {
      if (commonRequestParamsBuilder_ == null) {
        commonRequestParamsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.storage.v1.CommonRequestParams,
                com.google.storage.v1.CommonRequestParams.Builder,
                com.google.storage.v1.CommonRequestParamsOrBuilder>(
                getCommonRequestParams(), getParentForChildren(), isClean());
        commonRequestParams_ = null;
      }
      return commonRequestParamsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.storage.v1.GetBucketAccessControlRequest)
  }

  // @@protoc_insertion_point(class_scope:google.storage.v1.GetBucketAccessControlRequest)
  private static final com.google.storage.v1.GetBucketAccessControlRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.storage.v1.GetBucketAccessControlRequest();
  }

  public static com.google.storage.v1.GetBucketAccessControlRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBucketAccessControlRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetBucketAccessControlRequest>() {
        @java.lang.Override
        public GetBucketAccessControlRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetBucketAccessControlRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GetBucketAccessControlRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBucketAccessControlRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.storage.v1.GetBucketAccessControlRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

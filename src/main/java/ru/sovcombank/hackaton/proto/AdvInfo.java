// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AdvInfo.proto

package ru.sovcombank.hackaton.proto;

/**
 * Protobuf type {@code ru.sovcombank.hackaton.proto.AdvInfo}
 */
public final class AdvInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ru.sovcombank.hackaton.proto.AdvInfo)
    AdvInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdvInfo.newBuilder() to construct.
  private AdvInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdvInfo() {
    caption_ = "";
    fields_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdvInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.sovcombank.hackaton.proto.AdvInfoProto.internal_static_ru_sovcombank_hackaton_proto_AdvInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.sovcombank.hackaton.proto.AdvInfoProto.internal_static_ru_sovcombank_hackaton_proto_AdvInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.sovcombank.hackaton.proto.AdvInfo.class, ru.sovcombank.hackaton.proto.AdvInfo.Builder.class);
  }

  private int bitField0_;
  public static final int CAPTION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object caption_ = "";
  /**
   * <pre>
   * Заголовок
   * </pre>
   *
   * <code>string caption = 1;</code>
   * @return The caption.
   */
  @java.lang.Override
  public java.lang.String getCaption() {
    java.lang.Object ref = caption_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      caption_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Заголовок
   * </pre>
   *
   * <code>string caption = 1;</code>
   * @return The bytes for caption.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCaptionBytes() {
    java.lang.Object ref = caption_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      caption_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<ru.sovcombank.hackaton.proto.AdvInfoFieldRef> fields_;
  /**
   * <pre>
   * Список описания полей
   * </pre>
   *
   * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
   */
  @java.lang.Override
  public java.util.List<ru.sovcombank.hackaton.proto.AdvInfoFieldRef> getFieldsList() {
    return fields_;
  }
  /**
   * <pre>
   * Список описания полей
   * </pre>
   *
   * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends ru.sovcombank.hackaton.proto.AdvInfoFieldRefOrBuilder> 
      getFieldsOrBuilderList() {
    return fields_;
  }
  /**
   * <pre>
   * Список описания полей
   * </pre>
   *
   * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
   */
  @java.lang.Override
  public int getFieldsCount() {
    return fields_.size();
  }
  /**
   * <pre>
   * Список описания полей
   * </pre>
   *
   * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
   */
  @java.lang.Override
  public ru.sovcombank.hackaton.proto.AdvInfoFieldRef getFields(int index) {
    return fields_.get(index);
  }
  /**
   * <pre>
   * Список описания полей
   * </pre>
   *
   * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
   */
  @java.lang.Override
  public ru.sovcombank.hackaton.proto.AdvInfoFieldRefOrBuilder getFieldsOrBuilder(
      int index) {
    return fields_.get(index);
  }

  public static final int DATA_FIELD_NUMBER = 3;
  private ru.sovcombank.hackaton.proto.AdvInfoData data_;
  /**
   * <pre>
   * Данные
   * </pre>
   *
   * <code>optional .ru.sovcombank.hackaton.proto.AdvInfoData data = 3;</code>
   * @return Whether the data field is set.
   */
  @java.lang.Override
  public boolean hasData() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Данные
   * </pre>
   *
   * <code>optional .ru.sovcombank.hackaton.proto.AdvInfoData data = 3;</code>
   * @return The data.
   */
  @java.lang.Override
  public ru.sovcombank.hackaton.proto.AdvInfoData getData() {
    return data_ == null ? ru.sovcombank.hackaton.proto.AdvInfoData.getDefaultInstance() : data_;
  }
  /**
   * <pre>
   * Данные
   * </pre>
   *
   * <code>optional .ru.sovcombank.hackaton.proto.AdvInfoData data = 3;</code>
   */
  @java.lang.Override
  public ru.sovcombank.hackaton.proto.AdvInfoDataOrBuilder getDataOrBuilder() {
    return data_ == null ? ru.sovcombank.hackaton.proto.AdvInfoData.getDefaultInstance() : data_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(caption_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, caption_);
    }
    for (int i = 0; i < fields_.size(); i++) {
      output.writeMessage(2, fields_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getData());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(caption_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, caption_);
    }
    for (int i = 0; i < fields_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, fields_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getData());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ru.sovcombank.hackaton.proto.AdvInfo)) {
      return super.equals(obj);
    }
    ru.sovcombank.hackaton.proto.AdvInfo other = (ru.sovcombank.hackaton.proto.AdvInfo) obj;

    if (!getCaption()
        .equals(other.getCaption())) return false;
    if (!getFieldsList()
        .equals(other.getFieldsList())) return false;
    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CAPTION_FIELD_NUMBER;
    hash = (53 * hash) + getCaption().hashCode();
    if (getFieldsCount() > 0) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldsList().hashCode();
    }
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.sovcombank.hackaton.proto.AdvInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.sovcombank.hackaton.proto.AdvInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.sovcombank.hackaton.proto.AdvInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.sovcombank.hackaton.proto.AdvInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.sovcombank.hackaton.proto.AdvInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.sovcombank.hackaton.proto.AdvInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.sovcombank.hackaton.proto.AdvInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.sovcombank.hackaton.proto.AdvInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.sovcombank.hackaton.proto.AdvInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.sovcombank.hackaton.proto.AdvInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.sovcombank.hackaton.proto.AdvInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.sovcombank.hackaton.proto.AdvInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ru.sovcombank.hackaton.proto.AdvInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ru.sovcombank.hackaton.proto.AdvInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ru.sovcombank.hackaton.proto.AdvInfo)
      ru.sovcombank.hackaton.proto.AdvInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.sovcombank.hackaton.proto.AdvInfoProto.internal_static_ru_sovcombank_hackaton_proto_AdvInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.sovcombank.hackaton.proto.AdvInfoProto.internal_static_ru_sovcombank_hackaton_proto_AdvInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.sovcombank.hackaton.proto.AdvInfo.class, ru.sovcombank.hackaton.proto.AdvInfo.Builder.class);
    }

    // Construct using ru.sovcombank.hackaton.proto.AdvInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getFieldsFieldBuilder();
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      caption_ = "";
      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
      } else {
        fields_ = null;
        fieldsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      data_ = null;
      if (dataBuilder_ != null) {
        dataBuilder_.dispose();
        dataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.sovcombank.hackaton.proto.AdvInfoProto.internal_static_ru_sovcombank_hackaton_proto_AdvInfo_descriptor;
    }

    @java.lang.Override
    public ru.sovcombank.hackaton.proto.AdvInfo getDefaultInstanceForType() {
      return ru.sovcombank.hackaton.proto.AdvInfo.getDefaultInstance();
    }

    @java.lang.Override
    public ru.sovcombank.hackaton.proto.AdvInfo build() {
      ru.sovcombank.hackaton.proto.AdvInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.sovcombank.hackaton.proto.AdvInfo buildPartial() {
      ru.sovcombank.hackaton.proto.AdvInfo result = new ru.sovcombank.hackaton.proto.AdvInfo(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ru.sovcombank.hackaton.proto.AdvInfo result) {
      if (fieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          fields_ = java.util.Collections.unmodifiableList(fields_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.fields_ = fields_;
      } else {
        result.fields_ = fieldsBuilder_.build();
      }
    }

    private void buildPartial0(ru.sovcombank.hackaton.proto.AdvInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.caption_ = caption_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.data_ = dataBuilder_ == null
            ? data_
            : dataBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ru.sovcombank.hackaton.proto.AdvInfo) {
        return mergeFrom((ru.sovcombank.hackaton.proto.AdvInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.sovcombank.hackaton.proto.AdvInfo other) {
      if (other == ru.sovcombank.hackaton.proto.AdvInfo.getDefaultInstance()) return this;
      if (!other.getCaption().isEmpty()) {
        caption_ = other.caption_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (fieldsBuilder_ == null) {
        if (!other.fields_.isEmpty()) {
          if (fields_.isEmpty()) {
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFieldsIsMutable();
            fields_.addAll(other.fields_);
          }
          onChanged();
        }
      } else {
        if (!other.fields_.isEmpty()) {
          if (fieldsBuilder_.isEmpty()) {
            fieldsBuilder_.dispose();
            fieldsBuilder_ = null;
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000002);
            fieldsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFieldsFieldBuilder() : null;
          } else {
            fieldsBuilder_.addAllMessages(other.fields_);
          }
        }
      }
      if (other.hasData()) {
        mergeData(other.getData());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              caption_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              ru.sovcombank.hackaton.proto.AdvInfoFieldRef m =
                  input.readMessage(
                      ru.sovcombank.hackaton.proto.AdvInfoFieldRef.parser(),
                      extensionRegistry);
              if (fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                fields_.add(m);
              } else {
                fieldsBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object caption_ = "";
    /**
     * <pre>
     * Заголовок
     * </pre>
     *
     * <code>string caption = 1;</code>
     * @return The caption.
     */
    public java.lang.String getCaption() {
      java.lang.Object ref = caption_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        caption_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Заголовок
     * </pre>
     *
     * <code>string caption = 1;</code>
     * @return The bytes for caption.
     */
    public com.google.protobuf.ByteString
        getCaptionBytes() {
      java.lang.Object ref = caption_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        caption_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Заголовок
     * </pre>
     *
     * <code>string caption = 1;</code>
     * @param value The caption to set.
     * @return This builder for chaining.
     */
    public Builder setCaption(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      caption_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Заголовок
     * </pre>
     *
     * <code>string caption = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCaption() {
      caption_ = getDefaultInstance().getCaption();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Заголовок
     * </pre>
     *
     * <code>string caption = 1;</code>
     * @param value The bytes for caption to set.
     * @return This builder for chaining.
     */
    public Builder setCaptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      caption_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<ru.sovcombank.hackaton.proto.AdvInfoFieldRef> fields_ =
      java.util.Collections.emptyList();
    private void ensureFieldsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        fields_ = new java.util.ArrayList<ru.sovcombank.hackaton.proto.AdvInfoFieldRef>(fields_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ru.sovcombank.hackaton.proto.AdvInfoFieldRef, ru.sovcombank.hackaton.proto.AdvInfoFieldRef.Builder, ru.sovcombank.hackaton.proto.AdvInfoFieldRefOrBuilder> fieldsBuilder_;

    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public java.util.List<ru.sovcombank.hackaton.proto.AdvInfoFieldRef> getFieldsList() {
      if (fieldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fields_);
      } else {
        return fieldsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public int getFieldsCount() {
      if (fieldsBuilder_ == null) {
        return fields_.size();
      } else {
        return fieldsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public ru.sovcombank.hackaton.proto.AdvInfoFieldRef getFields(int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);
      } else {
        return fieldsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public Builder setFields(
        int index, ru.sovcombank.hackaton.proto.AdvInfoFieldRef value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.set(index, value);
        onChanged();
      } else {
        fieldsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public Builder setFields(
        int index, ru.sovcombank.hackaton.proto.AdvInfoFieldRef.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.set(index, builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public Builder addFields(ru.sovcombank.hackaton.proto.AdvInfoFieldRef value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.add(value);
        onChanged();
      } else {
        fieldsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public Builder addFields(
        int index, ru.sovcombank.hackaton.proto.AdvInfoFieldRef value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.add(index, value);
        onChanged();
      } else {
        fieldsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public Builder addFields(
        ru.sovcombank.hackaton.proto.AdvInfoFieldRef.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.add(builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public Builder addFields(
        int index, ru.sovcombank.hackaton.proto.AdvInfoFieldRef.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.add(index, builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public Builder addAllFields(
        java.lang.Iterable<? extends ru.sovcombank.hackaton.proto.AdvInfoFieldRef> values) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fields_);
        onChanged();
      } else {
        fieldsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public Builder clearFields() {
      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        fieldsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public Builder removeFields(int index) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.remove(index);
        onChanged();
      } else {
        fieldsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public ru.sovcombank.hackaton.proto.AdvInfoFieldRef.Builder getFieldsBuilder(
        int index) {
      return getFieldsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public ru.sovcombank.hackaton.proto.AdvInfoFieldRefOrBuilder getFieldsOrBuilder(
        int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);  } else {
        return fieldsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public java.util.List<? extends ru.sovcombank.hackaton.proto.AdvInfoFieldRefOrBuilder> 
         getFieldsOrBuilderList() {
      if (fieldsBuilder_ != null) {
        return fieldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fields_);
      }
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public ru.sovcombank.hackaton.proto.AdvInfoFieldRef.Builder addFieldsBuilder() {
      return getFieldsFieldBuilder().addBuilder(
          ru.sovcombank.hackaton.proto.AdvInfoFieldRef.getDefaultInstance());
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public ru.sovcombank.hackaton.proto.AdvInfoFieldRef.Builder addFieldsBuilder(
        int index) {
      return getFieldsFieldBuilder().addBuilder(
          index, ru.sovcombank.hackaton.proto.AdvInfoFieldRef.getDefaultInstance());
    }
    /**
     * <pre>
     * Список описания полей
     * </pre>
     *
     * <code>repeated .ru.sovcombank.hackaton.proto.AdvInfoFieldRef fields = 2;</code>
     */
    public java.util.List<ru.sovcombank.hackaton.proto.AdvInfoFieldRef.Builder> 
         getFieldsBuilderList() {
      return getFieldsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ru.sovcombank.hackaton.proto.AdvInfoFieldRef, ru.sovcombank.hackaton.proto.AdvInfoFieldRef.Builder, ru.sovcombank.hackaton.proto.AdvInfoFieldRefOrBuilder> 
        getFieldsFieldBuilder() {
      if (fieldsBuilder_ == null) {
        fieldsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ru.sovcombank.hackaton.proto.AdvInfoFieldRef, ru.sovcombank.hackaton.proto.AdvInfoFieldRef.Builder, ru.sovcombank.hackaton.proto.AdvInfoFieldRefOrBuilder>(
                fields_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        fields_ = null;
      }
      return fieldsBuilder_;
    }

    private ru.sovcombank.hackaton.proto.AdvInfoData data_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ru.sovcombank.hackaton.proto.AdvInfoData, ru.sovcombank.hackaton.proto.AdvInfoData.Builder, ru.sovcombank.hackaton.proto.AdvInfoDataOrBuilder> dataBuilder_;
    /**
     * <pre>
     * Данные
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.AdvInfoData data = 3;</code>
     * @return Whether the data field is set.
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Данные
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.AdvInfoData data = 3;</code>
     * @return The data.
     */
    public ru.sovcombank.hackaton.proto.AdvInfoData getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? ru.sovcombank.hackaton.proto.AdvInfoData.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Данные
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.AdvInfoData data = 3;</code>
     */
    public Builder setData(ru.sovcombank.hackaton.proto.AdvInfoData value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
      } else {
        dataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Данные
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.AdvInfoData data = 3;</code>
     */
    public Builder setData(
        ru.sovcombank.hackaton.proto.AdvInfoData.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Данные
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.AdvInfoData data = 3;</code>
     */
    public Builder mergeData(ru.sovcombank.hackaton.proto.AdvInfoData value) {
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          data_ != null &&
          data_ != ru.sovcombank.hackaton.proto.AdvInfoData.getDefaultInstance()) {
          getDataBuilder().mergeFrom(value);
        } else {
          data_ = value;
        }
      } else {
        dataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Данные
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.AdvInfoData data = 3;</code>
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000004);
      data_ = null;
      if (dataBuilder_ != null) {
        dataBuilder_.dispose();
        dataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Данные
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.AdvInfoData data = 3;</code>
     */
    public ru.sovcombank.hackaton.proto.AdvInfoData.Builder getDataBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Данные
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.AdvInfoData data = 3;</code>
     */
    public ru.sovcombank.hackaton.proto.AdvInfoDataOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            ru.sovcombank.hackaton.proto.AdvInfoData.getDefaultInstance() : data_;
      }
    }
    /**
     * <pre>
     * Данные
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.AdvInfoData data = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ru.sovcombank.hackaton.proto.AdvInfoData, ru.sovcombank.hackaton.proto.AdvInfoData.Builder, ru.sovcombank.hackaton.proto.AdvInfoDataOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ru.sovcombank.hackaton.proto.AdvInfoData, ru.sovcombank.hackaton.proto.AdvInfoData.Builder, ru.sovcombank.hackaton.proto.AdvInfoDataOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ru.sovcombank.hackaton.proto.AdvInfo)
  }

  // @@protoc_insertion_point(class_scope:ru.sovcombank.hackaton.proto.AdvInfo)
  private static final ru.sovcombank.hackaton.proto.AdvInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.sovcombank.hackaton.proto.AdvInfo();
  }

  public static ru.sovcombank.hackaton.proto.AdvInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdvInfo>
      PARSER = new com.google.protobuf.AbstractParser<AdvInfo>() {
    @java.lang.Override
    public AdvInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AdvInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdvInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.sovcombank.hackaton.proto.AdvInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

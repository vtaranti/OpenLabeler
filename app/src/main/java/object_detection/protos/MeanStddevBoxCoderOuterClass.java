/*
 * Copyright (c) 2020. Kin-Hong Wong. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: object_detection/protos/mean_stddev_box_coder.proto

package object_detection.protos;

public final class MeanStddevBoxCoderOuterClass {
  private MeanStddevBoxCoderOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MeanStddevBoxCoderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:object_detection.protos.MeanStddevBoxCoder)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The standard deviation used to encode and decode boxes.
     * </pre>
     *
     * <code>optional float stddev = 1 [default = 0.01];</code>
     * @return Whether the stddev field is set.
     */
    boolean hasStddev();
    /**
     * <pre>
     * The standard deviation used to encode and decode boxes.
     * </pre>
     *
     * <code>optional float stddev = 1 [default = 0.01];</code>
     * @return The stddev.
     */
    float getStddev();
  }
  /**
   * <pre>
   * Configuration proto for MeanStddevBoxCoder. See
   * box_coders/mean_stddev_box_coder.py for details.
   * </pre>
   *
   * Protobuf type {@code object_detection.protos.MeanStddevBoxCoder}
   */
  public static final class MeanStddevBoxCoder extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:object_detection.protos.MeanStddevBoxCoder)
      MeanStddevBoxCoderOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MeanStddevBoxCoder.newBuilder() to construct.
    private MeanStddevBoxCoder(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MeanStddevBoxCoder() {
      stddev_ = 0.01F;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MeanStddevBoxCoder();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MeanStddevBoxCoder(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
            case 13: {
              bitField0_ |= 0x00000001;
              stddev_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return object_detection.protos.MeanStddevBoxCoderOuterClass.internal_static_object_detection_protos_MeanStddevBoxCoder_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return object_detection.protos.MeanStddevBoxCoderOuterClass.internal_static_object_detection_protos_MeanStddevBoxCoder_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder.class, object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder.Builder.class);
    }

    private int bitField0_;
    public static final int STDDEV_FIELD_NUMBER = 1;
    private float stddev_;
    /**
     * <pre>
     * The standard deviation used to encode and decode boxes.
     * </pre>
     *
     * <code>optional float stddev = 1 [default = 0.01];</code>
     * @return Whether the stddev field is set.
     */
    @java.lang.Override
    public boolean hasStddev() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The standard deviation used to encode and decode boxes.
     * </pre>
     *
     * <code>optional float stddev = 1 [default = 0.01];</code>
     * @return The stddev.
     */
    @java.lang.Override
    public float getStddev() {
      return stddev_;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeFloat(1, stddev_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, stddev_);
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
      if (!(obj instanceof object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder)) {
        return super.equals(obj);
      }
      object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder other = (object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder) obj;

      if (hasStddev() != other.hasStddev()) return false;
      if (hasStddev()) {
        if (java.lang.Float.floatToIntBits(getStddev())
            != java.lang.Float.floatToIntBits(
                other.getStddev())) return false;
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
      if (hasStddev()) {
        hash = (37 * hash) + STDDEV_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getStddev());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parseFrom(
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
    public static Builder newBuilder(object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder prototype) {
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
     * <pre>
     * Configuration proto for MeanStddevBoxCoder. See
     * box_coders/mean_stddev_box_coder.py for details.
     * </pre>
     *
     * Protobuf type {@code object_detection.protos.MeanStddevBoxCoder}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:object_detection.protos.MeanStddevBoxCoder)
        object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return object_detection.protos.MeanStddevBoxCoderOuterClass.internal_static_object_detection_protos_MeanStddevBoxCoder_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return object_detection.protos.MeanStddevBoxCoderOuterClass.internal_static_object_detection_protos_MeanStddevBoxCoder_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder.class, object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder.Builder.class);
      }

      // Construct using object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        stddev_ = 0.01F;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return object_detection.protos.MeanStddevBoxCoderOuterClass.internal_static_object_detection_protos_MeanStddevBoxCoder_descriptor;
      }

      @java.lang.Override
      public object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder getDefaultInstanceForType() {
        return object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder.getDefaultInstance();
      }

      @java.lang.Override
      public object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder build() {
        object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder buildPartial() {
        object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder result = new object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.stddev_ = stddev_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
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
        if (other instanceof object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder) {
          return mergeFrom((object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder other) {
        if (other == object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder.getDefaultInstance()) return this;
        if (other.hasStddev()) {
          setStddev(other.getStddev());
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
        object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private float stddev_ = 0.01F;
      /**
       * <pre>
       * The standard deviation used to encode and decode boxes.
       * </pre>
       *
       * <code>optional float stddev = 1 [default = 0.01];</code>
       * @return Whether the stddev field is set.
       */
      @java.lang.Override
      public boolean hasStddev() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * The standard deviation used to encode and decode boxes.
       * </pre>
       *
       * <code>optional float stddev = 1 [default = 0.01];</code>
       * @return The stddev.
       */
      @java.lang.Override
      public float getStddev() {
        return stddev_;
      }
      /**
       * <pre>
       * The standard deviation used to encode and decode boxes.
       * </pre>
       *
       * <code>optional float stddev = 1 [default = 0.01];</code>
       * @param value The stddev to set.
       * @return This builder for chaining.
       */
      public Builder setStddev(float value) {
        bitField0_ |= 0x00000001;
        stddev_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The standard deviation used to encode and decode boxes.
       * </pre>
       *
       * <code>optional float stddev = 1 [default = 0.01];</code>
       * @return This builder for chaining.
       */
      public Builder clearStddev() {
        bitField0_ = (bitField0_ & ~0x00000001);
        stddev_ = 0.01F;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:object_detection.protos.MeanStddevBoxCoder)
    }

    // @@protoc_insertion_point(class_scope:object_detection.protos.MeanStddevBoxCoder)
    private static final object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder();
    }

    public static object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<MeanStddevBoxCoder>
        PARSER = new com.google.protobuf.AbstractParser<MeanStddevBoxCoder>() {
      @java.lang.Override
      public MeanStddevBoxCoder parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MeanStddevBoxCoder(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MeanStddevBoxCoder> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MeanStddevBoxCoder> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public object_detection.protos.MeanStddevBoxCoderOuterClass.MeanStddevBoxCoder getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_detection_protos_MeanStddevBoxCoder_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_detection_protos_MeanStddevBoxCoder_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3object_detection/protos/mean_stddev_bo" +
      "x_coder.proto\022\027object_detection.protos\"*" +
      "\n\022MeanStddevBoxCoder\022\024\n\006stddev\030\001 \001(\002:\0040." +
      "01"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_object_detection_protos_MeanStddevBoxCoder_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_object_detection_protos_MeanStddevBoxCoder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_detection_protos_MeanStddevBoxCoder_descriptor,
        new java.lang.String[] { "Stddev", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

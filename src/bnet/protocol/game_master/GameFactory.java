// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/game_master/game_factory.proto

package bnet.protocol.game_master;

public final class GameFactory {
  private GameFactory() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class GameProperties extends
      com.google.protobuf.GeneratedMessage {
    // Use GameProperties.newBuilder() to construct.
    private GameProperties() {
      initFields();
    }
    private GameProperties(boolean noInit) {}
    
    private static final GameProperties defaultInstance;
    public static GameProperties getDefaultInstance() {
      return defaultInstance;
    }
    
    public GameProperties getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bnet.protocol.game_master.GameFactory.internal_static_bnet_protocol_game_master_GameProperties_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bnet.protocol.game_master.GameFactory.internal_static_bnet_protocol_game_master_GameProperties_fieldAccessorTable;
    }
    
    // optional .bnet.protocol.attribute.AttributeFilter filter = 1;
    public static final int FILTER_FIELD_NUMBER = 1;
    private boolean hasFilter;
    private bnet.protocol.attribute.AttributeProto.AttributeFilter filter_;
    public boolean hasFilter() { return hasFilter; }
    public bnet.protocol.attribute.AttributeProto.AttributeFilter getFilter() { return filter_; }
    
    // optional bool create = 2;
    public static final int CREATE_FIELD_NUMBER = 2;
    private boolean hasCreate;
    private boolean create_ = false;
    public boolean hasCreate() { return hasCreate; }
    public boolean getCreate() { return create_; }
    
    // optional bool open = 3;
    public static final int OPEN_FIELD_NUMBER = 3;
    private boolean hasOpen;
    private boolean open_ = false;
    public boolean hasOpen() { return hasOpen; }
    public boolean getOpen() { return open_; }
    
    // optional fixed32 program_id = 4;
    public static final int PROGRAM_ID_FIELD_NUMBER = 4;
    private boolean hasProgramId;
    private int programId_ = 0;
    public boolean hasProgramId() { return hasProgramId; }
    public int getProgramId() { return programId_; }
    
    private void initFields() {
      filter_ = bnet.protocol.attribute.AttributeProto.AttributeFilter.getDefaultInstance();
    }
    public final boolean isInitialized() {
      if (hasFilter()) {
        if (!getFilter().isInitialized()) return false;
      }
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasFilter()) {
        output.writeMessage(1, getFilter());
      }
      if (hasCreate()) {
        output.writeBool(2, getCreate());
      }
      if (hasOpen()) {
        output.writeBool(3, getOpen());
      }
      if (hasProgramId()) {
        output.writeFixed32(4, getProgramId());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasFilter()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getFilter());
      }
      if (hasCreate()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, getCreate());
      }
      if (hasOpen()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, getOpen());
      }
      if (hasProgramId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(4, getProgramId());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static bnet.protocol.game_master.GameFactory.GameProperties parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static bnet.protocol.game_master.GameFactory.GameProperties parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static bnet.protocol.game_master.GameFactory.GameProperties parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static bnet.protocol.game_master.GameFactory.GameProperties parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static bnet.protocol.game_master.GameFactory.GameProperties parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static bnet.protocol.game_master.GameFactory.GameProperties parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static bnet.protocol.game_master.GameFactory.GameProperties parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static bnet.protocol.game_master.GameFactory.GameProperties parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static bnet.protocol.game_master.GameFactory.GameProperties parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static bnet.protocol.game_master.GameFactory.GameProperties parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(bnet.protocol.game_master.GameFactory.GameProperties prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private bnet.protocol.game_master.GameFactory.GameProperties result;
      
      // Construct using bnet.protocol.game_master.GameFactory.GameProperties.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new bnet.protocol.game_master.GameFactory.GameProperties();
        return builder;
      }
      
      protected bnet.protocol.game_master.GameFactory.GameProperties internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new bnet.protocol.game_master.GameFactory.GameProperties();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return bnet.protocol.game_master.GameFactory.GameProperties.getDescriptor();
      }
      
      public bnet.protocol.game_master.GameFactory.GameProperties getDefaultInstanceForType() {
        return bnet.protocol.game_master.GameFactory.GameProperties.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public bnet.protocol.game_master.GameFactory.GameProperties build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private bnet.protocol.game_master.GameFactory.GameProperties buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public bnet.protocol.game_master.GameFactory.GameProperties buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        bnet.protocol.game_master.GameFactory.GameProperties returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof bnet.protocol.game_master.GameFactory.GameProperties) {
          return mergeFrom((bnet.protocol.game_master.GameFactory.GameProperties)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(bnet.protocol.game_master.GameFactory.GameProperties other) {
        if (other == bnet.protocol.game_master.GameFactory.GameProperties.getDefaultInstance()) return this;
        if (other.hasFilter()) {
          mergeFilter(other.getFilter());
        }
        if (other.hasCreate()) {
          setCreate(other.getCreate());
        }
        if (other.hasOpen()) {
          setOpen(other.getOpen());
        }
        if (other.hasProgramId()) {
          setProgramId(other.getProgramId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              bnet.protocol.attribute.AttributeProto.AttributeFilter.Builder subBuilder = bnet.protocol.attribute.AttributeProto.AttributeFilter.newBuilder();
              if (hasFilter()) {
                subBuilder.mergeFrom(getFilter());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setFilter(subBuilder.buildPartial());
              break;
            }
            case 16: {
              setCreate(input.readBool());
              break;
            }
            case 24: {
              setOpen(input.readBool());
              break;
            }
            case 37: {
              setProgramId(input.readFixed32());
              break;
            }
          }
        }
      }
      
      
      // optional .bnet.protocol.attribute.AttributeFilter filter = 1;
      public boolean hasFilter() {
        return result.hasFilter();
      }
      public bnet.protocol.attribute.AttributeProto.AttributeFilter getFilter() {
        return result.getFilter();
      }
      public Builder setFilter(bnet.protocol.attribute.AttributeProto.AttributeFilter value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasFilter = true;
        result.filter_ = value;
        return this;
      }
      public Builder setFilter(bnet.protocol.attribute.AttributeProto.AttributeFilter.Builder builderForValue) {
        result.hasFilter = true;
        result.filter_ = builderForValue.build();
        return this;
      }
      public Builder mergeFilter(bnet.protocol.attribute.AttributeProto.AttributeFilter value) {
        if (result.hasFilter() &&
            result.filter_ != bnet.protocol.attribute.AttributeProto.AttributeFilter.getDefaultInstance()) {
          result.filter_ =
            bnet.protocol.attribute.AttributeProto.AttributeFilter.newBuilder(result.filter_).mergeFrom(value).buildPartial();
        } else {
          result.filter_ = value;
        }
        result.hasFilter = true;
        return this;
      }
      public Builder clearFilter() {
        result.hasFilter = false;
        result.filter_ = bnet.protocol.attribute.AttributeProto.AttributeFilter.getDefaultInstance();
        return this;
      }
      
      // optional bool create = 2;
      public boolean hasCreate() {
        return result.hasCreate();
      }
      public boolean getCreate() {
        return result.getCreate();
      }
      public Builder setCreate(boolean value) {
        result.hasCreate = true;
        result.create_ = value;
        return this;
      }
      public Builder clearCreate() {
        result.hasCreate = false;
        result.create_ = false;
        return this;
      }
      
      // optional bool open = 3;
      public boolean hasOpen() {
        return result.hasOpen();
      }
      public boolean getOpen() {
        return result.getOpen();
      }
      public Builder setOpen(boolean value) {
        result.hasOpen = true;
        result.open_ = value;
        return this;
      }
      public Builder clearOpen() {
        result.hasOpen = false;
        result.open_ = false;
        return this;
      }
      
      // optional fixed32 program_id = 4;
      public boolean hasProgramId() {
        return result.hasProgramId();
      }
      public int getProgramId() {
        return result.getProgramId();
      }
      public Builder setProgramId(int value) {
        result.hasProgramId = true;
        result.programId_ = value;
        return this;
      }
      public Builder clearProgramId() {
        result.hasProgramId = false;
        result.programId_ = 0;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:bnet.protocol.game_master.GameProperties)
    }
    
    static {
      defaultInstance = new GameProperties(true);
      bnet.protocol.game_master.GameFactory.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:bnet.protocol.game_master.GameProperties)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_bnet_protocol_game_master_GameProperties_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_bnet_protocol_game_master_GameProperties_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&service/game_master/game_factory.proto" +
      "\022\031bnet.protocol.game_master\032\034lib/protoco" +
      "l/attribute.proto\032\031lib/protocol/entity.p" +
      "roto\"|\n\016GameProperties\0228\n\006filter\030\001 \001(\0132(" +
      ".bnet.protocol.attribute.AttributeFilter" +
      "\022\016\n\006create\030\002 \001(\010\022\014\n\004open\030\003 \001(\010\022\022\n\nprogra" +
      "m_id\030\004 \001(\007"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_bnet_protocol_game_master_GameProperties_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_bnet_protocol_game_master_GameProperties_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_bnet_protocol_game_master_GameProperties_descriptor,
              new java.lang.String[] { "Filter", "Create", "Open", "ProgramId", },
              bnet.protocol.game_master.GameFactory.GameProperties.class,
              bnet.protocol.game_master.GameFactory.GameProperties.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          bnet.protocol.attribute.AttributeProto.getDescriptor(),
          bnet.protocol.Entity.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

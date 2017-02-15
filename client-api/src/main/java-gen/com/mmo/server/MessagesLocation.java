// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_identify.proto

package com.mmo.server;

public final class MessagesLocation {
  private MessagesLocation() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code MessageRegistry}
   */
  public enum MessageRegistry
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CLIENTCOMMONRESPONSE = 0;</code>
     */
    CLIENTCOMMONRESPONSE(0, 0),
    /**
     * <code>USERLOGINREQUEST = 1;</code>
     */
    USERLOGINREQUEST(1, 1),
    /**
     * <code>USERLOGINRESPONSE = 2;</code>
     */
    USERLOGINRESPONSE(2, 2),
    /**
     * <code>USERLOGOUTREQUEST = 3;</code>
     */
    USERLOGOUTREQUEST(3, 3),
    /**
     * <code>USERLOGOUTRESPONSE = 4;</code>
     */
    USERLOGOUTRESPONSE(4, 4),
    /**
     * <code>GETCHARACTERINFOREQUEST = 5;</code>
     */
    GETCHARACTERINFOREQUEST(5, 5),
    /**
     * <code>GETCHARACTERINFORESPONSE = 6;</code>
     */
    GETCHARACTERINFORESPONSE(6, 6),
    /**
     * <code>ITEMMOVEEVENT = 7;</code>
     */
    ITEMMOVEEVENT(7, 7),
    /**
     * <code>ITEMCRAATEEVENT = 8;</code>
     */
    ITEMCRAATEEVENT(8, 8),
    /**
     * <code>ITEMDESTROYEVENT = 9;</code>
     */
    ITEMDESTROYEVENT(9, 9),
    /**
     * <code>CHARACTERCREATEEVENT = 10;</code>
     */
    CHARACTERCREATEEVENT(10, 10),
    ;

    /**
     * <code>CLIENTCOMMONRESPONSE = 0;</code>
     */
    public static final int CLIENTCOMMONRESPONSE_VALUE = 0;
    /**
     * <code>USERLOGINREQUEST = 1;</code>
     */
    public static final int USERLOGINREQUEST_VALUE = 1;
    /**
     * <code>USERLOGINRESPONSE = 2;</code>
     */
    public static final int USERLOGINRESPONSE_VALUE = 2;
    /**
     * <code>USERLOGOUTREQUEST = 3;</code>
     */
    public static final int USERLOGOUTREQUEST_VALUE = 3;
    /**
     * <code>USERLOGOUTRESPONSE = 4;</code>
     */
    public static final int USERLOGOUTRESPONSE_VALUE = 4;
    /**
     * <code>GETCHARACTERINFOREQUEST = 5;</code>
     */
    public static final int GETCHARACTERINFOREQUEST_VALUE = 5;
    /**
     * <code>GETCHARACTERINFORESPONSE = 6;</code>
     */
    public static final int GETCHARACTERINFORESPONSE_VALUE = 6;
    /**
     * <code>ITEMMOVEEVENT = 7;</code>
     */
    public static final int ITEMMOVEEVENT_VALUE = 7;
    /**
     * <code>ITEMCRAATEEVENT = 8;</code>
     */
    public static final int ITEMCRAATEEVENT_VALUE = 8;
    /**
     * <code>ITEMDESTROYEVENT = 9;</code>
     */
    public static final int ITEMDESTROYEVENT_VALUE = 9;
    /**
     * <code>CHARACTERCREATEEVENT = 10;</code>
     */
    public static final int CHARACTERCREATEEVENT_VALUE = 10;


    public final int getNumber() { return value; }

    public static MessageRegistry valueOf(int value) {
      switch (value) {
        case 0: return CLIENTCOMMONRESPONSE;
        case 1: return USERLOGINREQUEST;
        case 2: return USERLOGINRESPONSE;
        case 3: return USERLOGOUTREQUEST;
        case 4: return USERLOGOUTRESPONSE;
        case 5: return GETCHARACTERINFOREQUEST;
        case 6: return GETCHARACTERINFORESPONSE;
        case 7: return ITEMMOVEEVENT;
        case 8: return ITEMCRAATEEVENT;
        case 9: return ITEMDESTROYEVENT;
        case 10: return CHARACTERCREATEEVENT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MessageRegistry>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<MessageRegistry>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MessageRegistry>() {
            public MessageRegistry findValueByNumber(int number) {
              return MessageRegistry.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.mmo.server.MessagesLocation.getDescriptor().getEnumTypes().get(0);
    }

    private static final MessageRegistry[] VALUES = values();

    public static MessageRegistry valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private MessageRegistry(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MessageRegistry)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026message_identify.proto*\232\002\n\017MessageRegi" +
      "stry\022\030\n\024CLIENTCOMMONRESPONSE\020\000\022\024\n\020USERLO" +
      "GINREQUEST\020\001\022\025\n\021USERLOGINRESPONSE\020\002\022\025\n\021U" +
      "SERLOGOUTREQUEST\020\003\022\026\n\022USERLOGOUTRESPONSE" +
      "\020\004\022\033\n\027GETCHARACTERINFOREQUEST\020\005\022\034\n\030GETCH" +
      "ARACTERINFORESPONSE\020\006\022\021\n\rITEMMOVEEVENT\020\007" +
      "\022\023\n\017ITEMCRAATEEVENT\020\010\022\024\n\020ITEMDESTROYEVEN" +
      "T\020\t\022\030\n\024CHARACTERCREATEEVENT\020\nB(\n\016com.mmo" +
      ".serverB\020MessagesLocation\210\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}

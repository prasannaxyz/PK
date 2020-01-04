package com.pk.common.exception;

import org.apache.commons.lang3.ObjectUtils;

import com.pk.common.util.MessageCode;
import com.pk.common.util.MessageType;

public class DefaultMessageCode implements MessageCode {
  private final String message;
  private final String code;
  private final MessageType messageType;
  private final Object[] params;
  private final String objectIdentifier;

  public DefaultMessageCode(final String code, final String message, final MessageType messageType, 
      final Object[] params) {
    this.code = code;
    this.message = message;
    this.messageType = messageType;
    this.params = ObjectUtils.cloneIfPossible(params);
    this.objectIdentifier = null;
  }
  
  public DefaultMessageCode(final String code, final String message, final MessageType messageType, 
      final Object[] params, String objectIdentifier) {
    this.code = code;
    this.message = message;
    this.messageType = messageType;
    this.params = ObjectUtils.cloneIfPossible(params);
    this.objectIdentifier = objectIdentifier;
  }

  public DefaultMessageCode(final MessageCode messageCode,
      final Object[] params) {
    this(messageCode.getCode(), messageCode.getDefaultMessage(), messageCode.getMessageType(), params);
  }

  public DefaultMessageCode(final MessageCode messageCode,
      final String objectIdentifier) {
    this(messageCode.getCode(), messageCode.getDefaultMessage(), messageCode.getMessageType(), messageCode.getParameters(), objectIdentifier);
  }


  @Override
  public String getDefaultMessage() {
    return message;
  }

  @Override
  public String getCode() {
    return code;
  }

  @Override
  public MessageType getMessageType() {
    return messageType;
  }

  @Override
  public Object[] getParameters() {
    return params;
  }

  @Override
  public String getObjectIdentifier() {
    return objectIdentifier;
  }

  @Override
  public MessageCode withParams(final Object... params) {
    return new DefaultMessageCode(getCode(), getDefaultMessage(), getMessageType(), params);
  }

  @Override
  public MessageCode withObjectIdentifierAs(String objectId) {
    return new DefaultMessageCode(getCode(), getDefaultMessage(), getMessageType(), params, objectId);
  }
}

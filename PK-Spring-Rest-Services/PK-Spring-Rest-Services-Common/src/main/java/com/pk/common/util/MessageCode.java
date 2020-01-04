package com.pk.common.util;

public interface MessageCode {

	String getCode();

	String getDefaultMessage();

	MessageType getMessageType();

	Object[] getParameters();

	String getObjectIdentifier();

	MessageCode withParams(final Object... params);

	MessageCode withObjectIdentifierAs(String objectId);
}

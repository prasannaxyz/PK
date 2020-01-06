/*******************************************************************************
 * PS Technology Proprietary and Confidential Copyright (c) 2017 PS Technology Incorporated. All
 * Rights Reserved.
 *
 * NOTICE: All information contained herein is, and remains the property of PST. The intellectual
 * and technical concepts contained herein are proprietary to PST and are protected by trade secret
 * and copyright law. Dissemination of this information or reproduction of this material in any form
 * is strictly forbidden without prior written permission.
 *******************************************************************************/
package org.PK.Spring.Rest.Services.Get.common;

import java.text.MessageFormat;

import com.pk.common.exception.DefaultMessageCode;
import com.pk.common.util.MessageCode;
import com.pk.common.util.MessageType;

public enum GetEmployeeProfileMessageCode
        implements MessageCode {
    NOTHING_TO_SAVE(400, "No records found to save."),
    CREATE_FAIL(501, "Failed to create {0}"),
    ERROR_DUPLICATE(502, "Duplicate {0} are not allowed with the same key"),
    CREATED_SUCCESSFULLY(901, "{0} created successfully", MessageType.SUCCESS),
    NOT_EMPTY(902,"{0} is not empty"),
    EMPLOYEE_NOT_FOUND(903,"{0} are not found.");

    private final String message;
    private final int code;
    private final MessageType messageType;

    private GetEmployeeProfileMessageCode(final int code, final String message, final MessageType messageType) {
        this.code = code;
        this.message = message;
        this.messageType = messageType;
    }

    private GetEmployeeProfileMessageCode(final int code, final String message) {
        this.code = code;
        this.message = message;
        this.messageType = MessageType.ERROR;
    }

    @Override
    public String getCode() {
        return "GET_EMPLOYEE-" + this.code;
    }

    @Override
    public String getDefaultMessage() {
        return String.format(message);
    }

    @Override
    public MessageType getMessageType() {
        return messageType;
    }

    @Override
    public String getObjectIdentifier() {
        return null;
    }

    @Override
    public Object[] getParameters() {
        return null;
    }

    @Override
    public MessageCode withObjectIdentifierAs(String arg0) {
        return null;
    }

    @Override
    public MessageCode withParams(Object... params) {
        return new DefaultMessageCode(getCode(), getDefaultMessage(), getMessageType(), params);
    }

}

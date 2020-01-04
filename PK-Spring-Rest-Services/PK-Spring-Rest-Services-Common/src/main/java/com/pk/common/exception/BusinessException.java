package com.pk.common.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.pk.common.util.MessageCode;

public class BusinessException
        extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private transient final List<MessageCode> messageCodes = new ArrayList<>();

    public BusinessException(final Throwable cause, final List<MessageCode> messageCodes) {
        super(cause);
        if (messageCodes != null) {
            this.messageCodes.addAll(messageCodes);
        }
    }

    public BusinessException(final List<MessageCode> messageCodes) {
        if (messageCodes != null) {
            this.messageCodes.addAll(messageCodes);
        }
    }

    public List<MessageCode> getMessageCodes() {
        return messageCodes;
    }

    public static BusinessException create(final Throwable cause, final MessageCode messageCode, final MessageCode... messageCodes) {
        Preconditions.checkArgument(messageCode != null);
        final List<MessageCode> messageCodesAsList = Lists.newArrayList();
        messageCodesAsList.add(messageCode);
        if (messageCodes != null && messageCodes.length > 0) {
            messageCodesAsList.addAll(Arrays.asList(messageCodes));
        }
        return create(cause, messageCodesAsList);
    }

    public static BusinessException create(final Throwable cause, final List<MessageCode> messageCodes) {
        Preconditions.checkArgument(messageCodes != null && !messageCodes.isEmpty());
        return new BusinessException(cause, messageCodes);
    }

    public static BusinessException create(final List<MessageCode> messageCodes) {
        Preconditions.checkArgument(messageCodes != null && !messageCodes.isEmpty());
        return new BusinessException(messageCodes);
    }

    public static BusinessException create(final MessageCode... messageCodes) {
        Preconditions.checkArgument(messageCodes != null && messageCodes.length > 0);

        final List<MessageCode> messageCodesAsList = Lists.newArrayList();
        messageCodesAsList.addAll(Arrays.asList(messageCodes));
        return create(messageCodesAsList);
    }
}

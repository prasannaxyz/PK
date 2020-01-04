package com.pk.common.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Response<T>
        implements Serializable {

    private static final long serialVersionUID = 1L;

    private ResultType result;
    private transient T data;
    @Deprecated
    private transient List<ErrorVO> errors;
    private transient List<MessageVO> messages;

    public static final ErrorVO getInternalError() {
        return new ErrorVO("INTERNAL_ERROR", "Internal System Error Occured. Please check application/server logs.", "Internal System Error Occured");
    }

    public static final List<ErrorVO> getDefaultError() {
        final ErrorVO internalError = Response.getInternalError();
        final List<ErrorVO> errors = new ArrayList<ErrorVO>();
        errors.add(internalError);
        return errors;
    }

    public enum ResultType {
        ERROR,
        SUCCESS,
        WARNING;
    }

    public Response() {
        this.result = ResultType.SUCCESS;
    }

    public Response(final T data) {
        this.data = data;
        this.result = ResultType.SUCCESS;

    }

    public Response(List<MessageVO> messagesList, final Exception ex) {
        this.result = ResultType.ERROR;
        this.messages = messagesList;
    }

    public Response(List<MessageVO> messagesList, final Exception ex, ResultType resultType) {
        this.result = resultType;
        this.messages = messagesList;
    }

    /*
     * public Response(final Exception ex) { this.result = ResultType.ERROR; if (ex instanceof
     * CrewProException) { CrewProException crewproException = (CrewProException) ex; this.errors =
     * crewproException.getErrors(); } if (this.errors == null) { this.errors =
     * Response.getDefaultError(); } }
     */

    /**
     * @return the result
     */
    public ResultType getResult() {
        return this.result;
    }

    /**
     * @param result
     *            the result to set
     */
    public void setResult(final ResultType result) {
        this.result = result;
    }

    /**
     * @return the data
     */
    public T getData() {
        return this.data;
    }

    /**
     * @param data
     *            the data to set
     */
    public void setData(final T data) {
        this.data = data;
    }

    /**
     * @return the errors
     */
    public List<ErrorVO> getErrors() {
        return this.errors;
    }

    /**
     * @param errors
     *            the errors to set
     */
    public void setErrors(final List<ErrorVO> errors) {
        this.errors = errors;
    }

    /**
     * @return the messages
     */
    public List<MessageVO> getMessages() {
        return messages;
    }

    /**
     * @param messages
     *            the messages to set
     */
    public void setMessages(List<MessageVO> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Response [result=");
        builder.append(this.result);
        builder.append(", data=");
        builder.append(this.data);
        builder.append(", errors=");
        builder.append(this.errors);
        builder.append(", messages=");
        builder.append(this.messages);
        builder.append("]");
        return builder.toString();
    }

}

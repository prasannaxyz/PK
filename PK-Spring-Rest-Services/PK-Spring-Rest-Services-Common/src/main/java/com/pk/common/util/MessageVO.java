package com.pk.common.util;


import java.util.ArrayList;
import java.util.List;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;


@AutoProperty
public class MessageVO {

    private String code;

    private String description;
    private String systemMessage;
    private MessageType type;
    private String[] values;
    private List<AttributeVO> attributes;
    private String objectIdentifier;

    public MessageVO() {
    }

    public MessageVO(MessageCode messageCode) {
        this.code = messageCode.getCode();
        this.type = messageCode.getMessageType();
        this.description = messageCode.getDefaultMessage();
        this.systemMessage = messageCode.getDefaultMessage();
        this.objectIdentifier = messageCode.getObjectIdentifier();
    }

    public MessageVO(String code) {
        this.code = code;
        this.type = MessageType.ERROR;
    }

    public MessageVO(String code, MessageType messageType) {
        this.code = code;
        this.type = messageType;
    }


    public MessageVO(String code, String description) {
        this.code = code;
        this.description = description;
        this.type = MessageType.ERROR;
    }

    public MessageVO(String code, String description, String systemMessage, MessageType messageType) {
        this.code = code;
        this.description = description;
        this.systemMessage = systemMessage;
        this.type = messageType;
    }

    public MessageVO(String code, String description, MessageType messageType) {
        this.code = code;
        this.description = description;
        this.type = messageType;
    }

    public MessageVO(String code, String description, String systemMessage, String... values) {
        this.code = code;
        this.description = description;
        this.systemMessage = systemMessage;
        this.type = MessageType.ERROR;
        this.values = values;
    }

    public MessageVO(String code, String description, String systemMessage, MessageType messageType, String... values) {
        this.code = code;
        this.description = description;
        this.systemMessage = systemMessage;
        this.type = messageType;
        this.values = values;
    }

    public MessageVO(String code, String description, List<AttributeVO> attributes) {
        this.code = code;
        this.description = description;
        this.attributes = attributes;
        this.type = MessageType.ERROR;
    }
    
    public MessageVO(String code, String description, String systemMessage, List<AttributeVO> attributes) {
        this.code = code;
        this.description = description;
        this.attributes = attributes;
        this.type = MessageType.ERROR;
    }

    public MessageVO(String code, String description, String systemMessage, MessageType messageType, List<AttributeVO> attributes) {
        this.code = code;
        this.description = description;
        this.systemMessage = systemMessage;
        this.attributes = attributes;
        this.type = messageType;
    }
    
    
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     *            the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the type
     */
    public MessageType getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(MessageType type) {
        this.type = type;
    }

    /**
     * @param values
     *            the values to set
     */
    public void setValues(String[] values) {
        this.values = values;
    }

    /**
     * @return the errorMessage
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param errorMessage
     *            the errorMessage to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the systemMessage
     */
    public String getSystemMessage() {
        return systemMessage;
    }

    /**
     * @param systemMessage
     *            the systemMessage to set
     */
    public void setSystemMessage(String systemMessage) {
        this.systemMessage = systemMessage;
    }

    /**
     * @return the values
     */
    public String[] getValues() {
        return values;
    }

    /**
     * @return the attributes
     */
    public List<AttributeVO> getAttributes() {
        return attributes;
    }

    /**
     * @param attributes
     *            the attributes to set
     */
    public void setAttributes(List<AttributeVO> attributes) {
        this.attributes = attributes;
    }

    public void setObjectIdentifier(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }
    
    public String getObjectIdentifier() {
        return objectIdentifier;
    }
    /*
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Pojomatic.toString(this);
    }

    /*
     * @see java.lang.Object#equals()
     */
    @Override
    public boolean equals(final Object obj) {
        return Pojomatic.equals(this, obj);
    }

    /*
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Pojomatic.hashCode(this);
    }
    
    public void addAttribute(Integer attributeIndex, String attributeName, String attributeValue) {
        if (attributes == null) {
            attributes = new ArrayList<AttributeVO>();
        }
        attributes.add(new AttributeVO(attributeIndex, attributeName, attributeValue));
    }
    
    public void addAttribute(AttributeVO attribute) {
        if (attributes == null) {
            attributes = new ArrayList<AttributeVO>();
        }
        attributes.add(attribute);
    }

}

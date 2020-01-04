package com.pk.common.util;

import java.util.Arrays;
import java.util.List;


/**
 * @author nyadlapati
 *
 */
public class ErrorVO extends MessageVO{

    public ErrorVO() {
    }

    public ErrorVO(String errorCode, String description) {
    	super(errorCode, description, MessageType.ERROR);
    }
    
    public ErrorVO(String errorCode, String description, MessageType type) {
        super(errorCode, description, type);
    }

    public ErrorVO(String errorCode, String description, String systemMessage) {
    	super(errorCode, description, systemMessage, MessageType.ERROR);
    }

    @Deprecated
    public ErrorVO(String errorCode, String description, String systemMessage, String... values) {
    	super(errorCode, description, systemMessage, MessageType.ERROR);
    }
    
    public ErrorVO(String errorCode, String description, List<AttributeVO> attributes) {
        super(errorCode, description, attributes);
    }
    
    public ErrorVO(String errorCode, String description, String systemMessage, List<AttributeVO> attributes, MessageType type) {
    	super(errorCode, description, systemMessage, type, attributes);
    }

    public ErrorVO(String errorCode, String description, String systemMessage, Integer attributeIndex, String attributeName, String attributeValue) {
    	super(errorCode, description, systemMessage, MessageType.ERROR);
        super.addAttribute(attributeIndex, attributeName, attributeValue);
        setType(MessageType.ERROR);
    }
    
    public ErrorVO(String errorCode, String description, String systemMessage, AttributeVO... attributesArg) {
    	super(errorCode, description, systemMessage, MessageType.ERROR);
        
        if ( attributesArg != null && attributesArg.length > 0 )
        {
        	for (AttributeVO attributeVO : attributesArg) {
                super.addAttribute(attributeVO);
    		}
        }
    }



    /**
     * @return the errorCode
     */
    public String getErrorCode() {
        return super.getCode();
    }

    /**
     * @param errorCode
     *            the errorCode to set
     */
    public void setErrorCode(String errorCode) {
        super.setCode(errorCode);
    }

    public void addAttribute(Integer attributeIndex, String attributeName, String attributeValue) {
    	super.addAttribute(attributeIndex, attributeName, attributeValue);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ErrorVO [errorCode=");
        builder.append(getCode());
        builder.append(", description=");
        builder.append(getDescription());
        builder.append(", systemMessage=");
        builder.append(getSystemMessage());
        builder.append(", values=");
        builder.append(Arrays.toString(getValues()));
        builder.append(", attributes=");
        builder.append(getAttributes());
        builder.append(", type=");
        builder.append(getType());
        builder.append("]");
        return builder.toString();
    }

}

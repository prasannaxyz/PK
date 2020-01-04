package com.pk.common.util;

/**
 * @author bnagaraju
 *
 */
public class AttributeVO {

    private Integer attributeIndex;
    private String attributeName;
    private String attributeValue;

    public AttributeVO() {
    }

    public AttributeVO(Integer attributeIndex, String attributeName, String attributeValue) {
        this.attributeIndex = attributeIndex;
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    /**
     * @return the attributeIndex
     */
    public Integer getAttributeIndex() {
        return attributeIndex;
    }

    /**
     * @param attributeIndex
     *            the attributeIndex to set
     */
    public void setAttributeIndex(Integer attributeIndex) {
        this.attributeIndex = attributeIndex;
    }

    /**
     * @return the attributeName
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * @param attributeName
     *            the attributeName to set
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * @return the attributeValue
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * @param attributeValue
     *            the attributeValue to set
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AttributeVO [attributeName=");
        builder.append(attributeName);
        builder.append(", attributeValue=");
        builder.append(attributeValue);
        builder.append("]");
        return builder.toString();
    }

}

/**
 * ReceiveCFDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class ReceiveCFDResponse  implements java.io.Serializable {
    private java.lang.String receiveCFDResult;

    public ReceiveCFDResponse() {
    }

    public ReceiveCFDResponse(
           java.lang.String receiveCFDResult) {
           this.receiveCFDResult = receiveCFDResult;
    }


    /**
     * Gets the receiveCFDResult value for this ReceiveCFDResponse.
     * 
     * @return receiveCFDResult
     */
    public java.lang.String getReceiveCFDResult() {
        return receiveCFDResult;
    }


    /**
     * Sets the receiveCFDResult value for this ReceiveCFDResponse.
     * 
     * @param receiveCFDResult
     */
    public void setReceiveCFDResult(java.lang.String receiveCFDResult) {
        this.receiveCFDResult = receiveCFDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiveCFDResponse)) return false;
        ReceiveCFDResponse other = (ReceiveCFDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiveCFDResult==null && other.getReceiveCFDResult()==null) || 
             (this.receiveCFDResult!=null &&
              this.receiveCFDResult.equals(other.getReceiveCFDResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getReceiveCFDResult() != null) {
            _hashCode += getReceiveCFDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceiveCFDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", ">receiveCFDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCFDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "receiveCFDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

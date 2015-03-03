/**
 * GeneraPDF_RecepcionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class GeneraPDF_RecepcionResponse  implements java.io.Serializable {
    private java.lang.String generaPDF_RecepcionResult;

    public GeneraPDF_RecepcionResponse() {
    }

    public GeneraPDF_RecepcionResponse(
           java.lang.String generaPDF_RecepcionResult) {
           this.generaPDF_RecepcionResult = generaPDF_RecepcionResult;
    }


    /**
     * Gets the generaPDF_RecepcionResult value for this GeneraPDF_RecepcionResponse.
     * 
     * @return generaPDF_RecepcionResult
     */
    public java.lang.String getGeneraPDF_RecepcionResult() {
        return generaPDF_RecepcionResult;
    }


    /**
     * Sets the generaPDF_RecepcionResult value for this GeneraPDF_RecepcionResponse.
     * 
     * @param generaPDF_RecepcionResult
     */
    public void setGeneraPDF_RecepcionResult(java.lang.String generaPDF_RecepcionResult) {
        this.generaPDF_RecepcionResult = generaPDF_RecepcionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneraPDF_RecepcionResponse)) return false;
        GeneraPDF_RecepcionResponse other = (GeneraPDF_RecepcionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.generaPDF_RecepcionResult==null && other.getGeneraPDF_RecepcionResult()==null) || 
             (this.generaPDF_RecepcionResult!=null &&
              this.generaPDF_RecepcionResult.equals(other.getGeneraPDF_RecepcionResult())));
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
        if (getGeneraPDF_RecepcionResult() != null) {
            _hashCode += getGeneraPDF_RecepcionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneraPDF_RecepcionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", ">generaPDF_RecepcionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generaPDF_RecepcionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "generaPDF_RecepcionResult"));
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

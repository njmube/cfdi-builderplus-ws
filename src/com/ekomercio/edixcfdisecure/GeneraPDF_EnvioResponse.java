/**
 * GeneraPDF_EnvioResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class GeneraPDF_EnvioResponse  implements java.io.Serializable {
    private java.lang.String generaPDF_EnvioResult;

    public GeneraPDF_EnvioResponse() {
    }

    public GeneraPDF_EnvioResponse(
           java.lang.String generaPDF_EnvioResult) {
           this.generaPDF_EnvioResult = generaPDF_EnvioResult;
    }


    /**
     * Gets the generaPDF_EnvioResult value for this GeneraPDF_EnvioResponse.
     * 
     * @return generaPDF_EnvioResult
     */
    public java.lang.String getGeneraPDF_EnvioResult() {
        return generaPDF_EnvioResult;
    }


    /**
     * Sets the generaPDF_EnvioResult value for this GeneraPDF_EnvioResponse.
     * 
     * @param generaPDF_EnvioResult
     */
    public void setGeneraPDF_EnvioResult(java.lang.String generaPDF_EnvioResult) {
        this.generaPDF_EnvioResult = generaPDF_EnvioResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneraPDF_EnvioResponse)) return false;
        GeneraPDF_EnvioResponse other = (GeneraPDF_EnvioResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.generaPDF_EnvioResult==null && other.getGeneraPDF_EnvioResult()==null) || 
             (this.generaPDF_EnvioResult!=null &&
              this.generaPDF_EnvioResult.equals(other.getGeneraPDF_EnvioResult())));
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
        if (getGeneraPDF_EnvioResult() != null) {
            _hashCode += getGeneraPDF_EnvioResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneraPDF_EnvioResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", ">generaPDF_EnvioResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generaPDF_EnvioResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "generaPDF_EnvioResult"));
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

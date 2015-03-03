/**
 * GetCFDI_FromCFDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class GetCFDI_FromCFDResponse  implements java.io.Serializable {
    private java.lang.String getCFDI_FromCFDResult;

    public GetCFDI_FromCFDResponse() {
    }

    public GetCFDI_FromCFDResponse(
           java.lang.String getCFDI_FromCFDResult) {
           this.getCFDI_FromCFDResult = getCFDI_FromCFDResult;
    }


    /**
     * Gets the getCFDI_FromCFDResult value for this GetCFDI_FromCFDResponse.
     * 
     * @return getCFDI_FromCFDResult
     */
    public java.lang.String getGetCFDI_FromCFDResult() {
        return getCFDI_FromCFDResult;
    }


    /**
     * Sets the getCFDI_FromCFDResult value for this GetCFDI_FromCFDResponse.
     * 
     * @param getCFDI_FromCFDResult
     */
    public void setGetCFDI_FromCFDResult(java.lang.String getCFDI_FromCFDResult) {
        this.getCFDI_FromCFDResult = getCFDI_FromCFDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCFDI_FromCFDResponse)) return false;
        GetCFDI_FromCFDResponse other = (GetCFDI_FromCFDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCFDI_FromCFDResult==null && other.getGetCFDI_FromCFDResult()==null) || 
             (this.getCFDI_FromCFDResult!=null &&
              this.getCFDI_FromCFDResult.equals(other.getGetCFDI_FromCFDResult())));
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
        if (getGetCFDI_FromCFDResult() != null) {
            _hashCode += getGetCFDI_FromCFDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCFDI_FromCFDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", ">getCFDI_FromCFDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCFDI_FromCFDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "getCFDI_FromCFDResult"));
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

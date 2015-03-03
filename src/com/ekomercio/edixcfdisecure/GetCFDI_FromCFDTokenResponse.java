/**
 * GetCFDI_FromCFDTokenResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class GetCFDI_FromCFDTokenResponse  implements java.io.Serializable {
    private java.lang.String getCFDI_FromCFDTokenResult;

    public GetCFDI_FromCFDTokenResponse() {
    }

    public GetCFDI_FromCFDTokenResponse(
           java.lang.String getCFDI_FromCFDTokenResult) {
           this.getCFDI_FromCFDTokenResult = getCFDI_FromCFDTokenResult;
    }


    /**
     * Gets the getCFDI_FromCFDTokenResult value for this GetCFDI_FromCFDTokenResponse.
     * 
     * @return getCFDI_FromCFDTokenResult
     */
    public java.lang.String getGetCFDI_FromCFDTokenResult() {
        return getCFDI_FromCFDTokenResult;
    }


    /**
     * Sets the getCFDI_FromCFDTokenResult value for this GetCFDI_FromCFDTokenResponse.
     * 
     * @param getCFDI_FromCFDTokenResult
     */
    public void setGetCFDI_FromCFDTokenResult(java.lang.String getCFDI_FromCFDTokenResult) {
        this.getCFDI_FromCFDTokenResult = getCFDI_FromCFDTokenResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCFDI_FromCFDTokenResponse)) return false;
        GetCFDI_FromCFDTokenResponse other = (GetCFDI_FromCFDTokenResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCFDI_FromCFDTokenResult==null && other.getGetCFDI_FromCFDTokenResult()==null) || 
             (this.getCFDI_FromCFDTokenResult!=null &&
              this.getCFDI_FromCFDTokenResult.equals(other.getGetCFDI_FromCFDTokenResult())));
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
        if (getGetCFDI_FromCFDTokenResult() != null) {
            _hashCode += getGetCFDI_FromCFDTokenResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCFDI_FromCFDTokenResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", ">getCFDI_FromCFDTokenResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCFDI_FromCFDTokenResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "getCFDI_FromCFDTokenResult"));
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

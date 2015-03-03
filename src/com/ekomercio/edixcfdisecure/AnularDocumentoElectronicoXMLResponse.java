/**
 * AnularDocumentoElectronicoXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class AnularDocumentoElectronicoXMLResponse  implements java.io.Serializable {
    private java.lang.String anularDocumentoElectronicoXMLResult;

    public AnularDocumentoElectronicoXMLResponse() {
    }

    public AnularDocumentoElectronicoXMLResponse(
           java.lang.String anularDocumentoElectronicoXMLResult) {
           this.anularDocumentoElectronicoXMLResult = anularDocumentoElectronicoXMLResult;
    }


    /**
     * Gets the anularDocumentoElectronicoXMLResult value for this AnularDocumentoElectronicoXMLResponse.
     * 
     * @return anularDocumentoElectronicoXMLResult
     */
    public java.lang.String getAnularDocumentoElectronicoXMLResult() {
        return anularDocumentoElectronicoXMLResult;
    }


    /**
     * Sets the anularDocumentoElectronicoXMLResult value for this AnularDocumentoElectronicoXMLResponse.
     * 
     * @param anularDocumentoElectronicoXMLResult
     */
    public void setAnularDocumentoElectronicoXMLResult(java.lang.String anularDocumentoElectronicoXMLResult) {
        this.anularDocumentoElectronicoXMLResult = anularDocumentoElectronicoXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnularDocumentoElectronicoXMLResponse)) return false;
        AnularDocumentoElectronicoXMLResponse other = (AnularDocumentoElectronicoXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anularDocumentoElectronicoXMLResult==null && other.getAnularDocumentoElectronicoXMLResult()==null) || 
             (this.anularDocumentoElectronicoXMLResult!=null &&
              this.anularDocumentoElectronicoXMLResult.equals(other.getAnularDocumentoElectronicoXMLResult())));
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
        if (getAnularDocumentoElectronicoXMLResult() != null) {
            _hashCode += getAnularDocumentoElectronicoXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnularDocumentoElectronicoXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", ">anularDocumentoElectronicoXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anularDocumentoElectronicoXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "anularDocumentoElectronicoXMLResult"));
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

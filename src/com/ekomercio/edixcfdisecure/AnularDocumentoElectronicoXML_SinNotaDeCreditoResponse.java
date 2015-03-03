/**
 * AnularDocumentoElectronicoXML_SinNotaDeCreditoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class AnularDocumentoElectronicoXML_SinNotaDeCreditoResponse  implements java.io.Serializable {
    private java.lang.String anularDocumentoElectronicoXML_SinNotaDeCreditoResult;

    public AnularDocumentoElectronicoXML_SinNotaDeCreditoResponse() {
    }

    public AnularDocumentoElectronicoXML_SinNotaDeCreditoResponse(
           java.lang.String anularDocumentoElectronicoXML_SinNotaDeCreditoResult) {
           this.anularDocumentoElectronicoXML_SinNotaDeCreditoResult = anularDocumentoElectronicoXML_SinNotaDeCreditoResult;
    }


    /**
     * Gets the anularDocumentoElectronicoXML_SinNotaDeCreditoResult value for this AnularDocumentoElectronicoXML_SinNotaDeCreditoResponse.
     * 
     * @return anularDocumentoElectronicoXML_SinNotaDeCreditoResult
     */
    public java.lang.String getAnularDocumentoElectronicoXML_SinNotaDeCreditoResult() {
        return anularDocumentoElectronicoXML_SinNotaDeCreditoResult;
    }


    /**
     * Sets the anularDocumentoElectronicoXML_SinNotaDeCreditoResult value for this AnularDocumentoElectronicoXML_SinNotaDeCreditoResponse.
     * 
     * @param anularDocumentoElectronicoXML_SinNotaDeCreditoResult
     */
    public void setAnularDocumentoElectronicoXML_SinNotaDeCreditoResult(java.lang.String anularDocumentoElectronicoXML_SinNotaDeCreditoResult) {
        this.anularDocumentoElectronicoXML_SinNotaDeCreditoResult = anularDocumentoElectronicoXML_SinNotaDeCreditoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnularDocumentoElectronicoXML_SinNotaDeCreditoResponse)) return false;
        AnularDocumentoElectronicoXML_SinNotaDeCreditoResponse other = (AnularDocumentoElectronicoXML_SinNotaDeCreditoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anularDocumentoElectronicoXML_SinNotaDeCreditoResult==null && other.getAnularDocumentoElectronicoXML_SinNotaDeCreditoResult()==null) || 
             (this.anularDocumentoElectronicoXML_SinNotaDeCreditoResult!=null &&
              this.anularDocumentoElectronicoXML_SinNotaDeCreditoResult.equals(other.getAnularDocumentoElectronicoXML_SinNotaDeCreditoResult())));
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
        if (getAnularDocumentoElectronicoXML_SinNotaDeCreditoResult() != null) {
            _hashCode += getAnularDocumentoElectronicoXML_SinNotaDeCreditoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnularDocumentoElectronicoXML_SinNotaDeCreditoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", ">anularDocumentoElectronicoXML_SinNotaDeCreditoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anularDocumentoElectronicoXML_SinNotaDeCreditoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "anularDocumentoElectronicoXML_SinNotaDeCreditoResult"));
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

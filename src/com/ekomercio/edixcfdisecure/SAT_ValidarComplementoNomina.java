/**
 * SAT_ValidarComplementoNomina.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class SAT_ValidarComplementoNomina  implements java.io.Serializable {
    private com.ekomercio.edixcfdisecure.SAT_ValidarComplementoNominaOXMLDocument oXMLDocument;

    private java.lang.String cMensaje;

    public SAT_ValidarComplementoNomina() {
    }

    public SAT_ValidarComplementoNomina(
           com.ekomercio.edixcfdisecure.SAT_ValidarComplementoNominaOXMLDocument oXMLDocument,
           java.lang.String cMensaje) {
           this.oXMLDocument = oXMLDocument;
           this.cMensaje = cMensaje;
    }


    /**
     * Gets the oXMLDocument value for this SAT_ValidarComplementoNomina.
     * 
     * @return oXMLDocument
     */
    public com.ekomercio.edixcfdisecure.SAT_ValidarComplementoNominaOXMLDocument getOXMLDocument() {
        return oXMLDocument;
    }


    /**
     * Sets the oXMLDocument value for this SAT_ValidarComplementoNomina.
     * 
     * @param oXMLDocument
     */
    public void setOXMLDocument(com.ekomercio.edixcfdisecure.SAT_ValidarComplementoNominaOXMLDocument oXMLDocument) {
        this.oXMLDocument = oXMLDocument;
    }


    /**
     * Gets the cMensaje value for this SAT_ValidarComplementoNomina.
     * 
     * @return cMensaje
     */
    public java.lang.String getCMensaje() {
        return cMensaje;
    }


    /**
     * Sets the cMensaje value for this SAT_ValidarComplementoNomina.
     * 
     * @param cMensaje
     */
    public void setCMensaje(java.lang.String cMensaje) {
        this.cMensaje = cMensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SAT_ValidarComplementoNomina)) return false;
        SAT_ValidarComplementoNomina other = (SAT_ValidarComplementoNomina) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oXMLDocument==null && other.getOXMLDocument()==null) || 
             (this.oXMLDocument!=null &&
              this.oXMLDocument.equals(other.getOXMLDocument()))) &&
            ((this.cMensaje==null && other.getCMensaje()==null) || 
             (this.cMensaje!=null &&
              this.cMensaje.equals(other.getCMensaje())));
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
        if (getOXMLDocument() != null) {
            _hashCode += getOXMLDocument().hashCode();
        }
        if (getCMensaje() != null) {
            _hashCode += getCMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SAT_ValidarComplementoNomina.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", ">SAT_ValidarComplementoNomina"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OXMLDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "oXMLDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", ">>SAT_ValidarComplementoNomina>oXMLDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "cMensaje"));
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

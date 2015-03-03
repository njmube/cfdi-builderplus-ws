/**
 * ExisteConsecutivoInterno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class ExisteConsecutivoInterno  implements java.io.Serializable {
    private java.lang.String cConsecutivoInterno;

    private java.lang.String cErrorMensaje;

    public ExisteConsecutivoInterno() {
    }

    public ExisteConsecutivoInterno(
           java.lang.String cConsecutivoInterno,
           java.lang.String cErrorMensaje) {
           this.cConsecutivoInterno = cConsecutivoInterno;
           this.cErrorMensaje = cErrorMensaje;
    }


    /**
     * Gets the cConsecutivoInterno value for this ExisteConsecutivoInterno.
     * 
     * @return cConsecutivoInterno
     */
    public java.lang.String getCConsecutivoInterno() {
        return cConsecutivoInterno;
    }


    /**
     * Sets the cConsecutivoInterno value for this ExisteConsecutivoInterno.
     * 
     * @param cConsecutivoInterno
     */
    public void setCConsecutivoInterno(java.lang.String cConsecutivoInterno) {
        this.cConsecutivoInterno = cConsecutivoInterno;
    }


    /**
     * Gets the cErrorMensaje value for this ExisteConsecutivoInterno.
     * 
     * @return cErrorMensaje
     */
    public java.lang.String getCErrorMensaje() {
        return cErrorMensaje;
    }


    /**
     * Sets the cErrorMensaje value for this ExisteConsecutivoInterno.
     * 
     * @param cErrorMensaje
     */
    public void setCErrorMensaje(java.lang.String cErrorMensaje) {
        this.cErrorMensaje = cErrorMensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExisteConsecutivoInterno)) return false;
        ExisteConsecutivoInterno other = (ExisteConsecutivoInterno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cConsecutivoInterno==null && other.getCConsecutivoInterno()==null) || 
             (this.cConsecutivoInterno!=null &&
              this.cConsecutivoInterno.equals(other.getCConsecutivoInterno()))) &&
            ((this.cErrorMensaje==null && other.getCErrorMensaje()==null) || 
             (this.cErrorMensaje!=null &&
              this.cErrorMensaje.equals(other.getCErrorMensaje())));
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
        if (getCConsecutivoInterno() != null) {
            _hashCode += getCConsecutivoInterno().hashCode();
        }
        if (getCErrorMensaje() != null) {
            _hashCode += getCErrorMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExisteConsecutivoInterno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", ">existeConsecutivoInterno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CConsecutivoInterno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "cConsecutivoInterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CErrorMensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "cErrorMensaje"));
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

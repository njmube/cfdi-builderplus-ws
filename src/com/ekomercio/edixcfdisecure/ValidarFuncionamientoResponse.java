/**
 * ValidarFuncionamientoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class ValidarFuncionamientoResponse  implements java.io.Serializable {
    private boolean validarFuncionamientoResult;

    private java.lang.String cMensaje;

    public ValidarFuncionamientoResponse() {
    }

    public ValidarFuncionamientoResponse(
           boolean validarFuncionamientoResult,
           java.lang.String cMensaje) {
           this.validarFuncionamientoResult = validarFuncionamientoResult;
           this.cMensaje = cMensaje;
    }


    /**
     * Gets the validarFuncionamientoResult value for this ValidarFuncionamientoResponse.
     * 
     * @return validarFuncionamientoResult
     */
    public boolean isValidarFuncionamientoResult() {
        return validarFuncionamientoResult;
    }


    /**
     * Sets the validarFuncionamientoResult value for this ValidarFuncionamientoResponse.
     * 
     * @param validarFuncionamientoResult
     */
    public void setValidarFuncionamientoResult(boolean validarFuncionamientoResult) {
        this.validarFuncionamientoResult = validarFuncionamientoResult;
    }


    /**
     * Gets the cMensaje value for this ValidarFuncionamientoResponse.
     * 
     * @return cMensaje
     */
    public java.lang.String getCMensaje() {
        return cMensaje;
    }


    /**
     * Sets the cMensaje value for this ValidarFuncionamientoResponse.
     * 
     * @param cMensaje
     */
    public void setCMensaje(java.lang.String cMensaje) {
        this.cMensaje = cMensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidarFuncionamientoResponse)) return false;
        ValidarFuncionamientoResponse other = (ValidarFuncionamientoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.validarFuncionamientoResult == other.isValidarFuncionamientoResult() &&
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
        _hashCode += (isValidarFuncionamientoResult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCMensaje() != null) {
            _hashCode += getCMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidarFuncionamientoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", ">ValidarFuncionamientoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validarFuncionamientoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "ValidarFuncionamientoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

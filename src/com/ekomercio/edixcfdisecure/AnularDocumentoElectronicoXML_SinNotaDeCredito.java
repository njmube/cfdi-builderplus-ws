/**
 * AnularDocumentoElectronicoXML_SinNotaDeCredito.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class AnularDocumentoElectronicoXML_SinNotaDeCredito  implements java.io.Serializable {
    private java.lang.String usuario;

    private java.lang.String password;

    private java.lang.String id;

    private java.lang.String datosDocumentoXML;

    public AnularDocumentoElectronicoXML_SinNotaDeCredito() {
    }

    public AnularDocumentoElectronicoXML_SinNotaDeCredito(
           java.lang.String usuario,
           java.lang.String password,
           java.lang.String id,
           java.lang.String datosDocumentoXML) {
           this.usuario = usuario;
           this.password = password;
           this.id = id;
           this.datosDocumentoXML = datosDocumentoXML;
    }


    /**
     * Gets the usuario value for this AnularDocumentoElectronicoXML_SinNotaDeCredito.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this AnularDocumentoElectronicoXML_SinNotaDeCredito.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the password value for this AnularDocumentoElectronicoXML_SinNotaDeCredito.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this AnularDocumentoElectronicoXML_SinNotaDeCredito.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the id value for this AnularDocumentoElectronicoXML_SinNotaDeCredito.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AnularDocumentoElectronicoXML_SinNotaDeCredito.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the datosDocumentoXML value for this AnularDocumentoElectronicoXML_SinNotaDeCredito.
     * 
     * @return datosDocumentoXML
     */
    public java.lang.String getDatosDocumentoXML() {
        return datosDocumentoXML;
    }


    /**
     * Sets the datosDocumentoXML value for this AnularDocumentoElectronicoXML_SinNotaDeCredito.
     * 
     * @param datosDocumentoXML
     */
    public void setDatosDocumentoXML(java.lang.String datosDocumentoXML) {
        this.datosDocumentoXML = datosDocumentoXML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnularDocumentoElectronicoXML_SinNotaDeCredito)) return false;
        AnularDocumentoElectronicoXML_SinNotaDeCredito other = (AnularDocumentoElectronicoXML_SinNotaDeCredito) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.datosDocumentoXML==null && other.getDatosDocumentoXML()==null) || 
             (this.datosDocumentoXML!=null &&
              this.datosDocumentoXML.equals(other.getDatosDocumentoXML())));
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
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDatosDocumentoXML() != null) {
            _hashCode += getDatosDocumentoXML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnularDocumentoElectronicoXML_SinNotaDeCredito.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", ">anularDocumentoElectronicoXML_SinNotaDeCredito"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosDocumentoXML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "datosDocumentoXML"));
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

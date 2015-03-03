/**
 * EnValidacionCertificado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class EnValidacionCertificado implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnValidacionCertificado(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Ok = "Ok";
    public static final java.lang.String _NoExiste = "NoExiste";
    public static final java.lang.String _Cancelado = "Cancelado";
    public static final java.lang.String _Revocado = "Revocado";
    public static final java.lang.String _NoVigente = "NoVigente";
    public static final EnValidacionCertificado Ok = new EnValidacionCertificado(_Ok);
    public static final EnValidacionCertificado NoExiste = new EnValidacionCertificado(_NoExiste);
    public static final EnValidacionCertificado Cancelado = new EnValidacionCertificado(_Cancelado);
    public static final EnValidacionCertificado Revocado = new EnValidacionCertificado(_Revocado);
    public static final EnValidacionCertificado NoVigente = new EnValidacionCertificado(_NoVigente);
    public java.lang.String getValue() { return _value_;}
    public static EnValidacionCertificado fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnValidacionCertificado enumeration = (EnValidacionCertificado)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnValidacionCertificado fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnValidacionCertificado.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "EnValidacionCertificado"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * WSCFDBuilderPlusSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public interface WSCFDBuilderPlusSoap extends java.rmi.Remote {

    /**
     * Acerca de...
     */
    public java.lang.String about() throws java.rmi.RemoteException;
    public java.lang.String helloWorld() throws java.rmi.RemoteException;

    /**
     * Genera una factura electrónica con base en el texto plano contenidoen
     * la variable 'textoPlano'. Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * id: Identificación fiscal de la empresa emisora del documento (RFC
     * en México).
     * textoPlano: Texto plano según layout 3.60 de EdixCFD.
     */
    public java.lang.String procesarTextoPlano(java.lang.String usuario, java.lang.String password, java.lang.String id, java.lang.String textoPlano) throws java.rmi.RemoteException;

    /**
     * Timbra un CFDI con base en el xml UTF8 en la variable 'xmlFirmado'.
     * Devuelve el XML completo, timbrado. 
     * Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * xmlFirmado: XML Firmado, sin timbrar, versión 3.0 según el Anexo 20.
     */
    public java.lang.String getCFDI(java.lang.String usuario, java.lang.String password, java.lang.String xmlFirmado) throws java.rmi.RemoteException;

    /**
     * Firma y Timbra un CFDI con base en el xml UTF8 en la variable
     * 'xmlFirmado'. Devuelve el XML completo, timbrado. 
     * Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * xmlFirmado: XML Firmado, sin timbrar, versión 3.0 según el Anexo 20.
     */
    public java.lang.String getCFDI_Sign(java.lang.String usuario, java.lang.String password, java.lang.String xmlFirmado) throws java.rmi.RemoteException;

    /**
     * Timbra un CFDI con base en el xml UTF8 en la variable 'xmlFirmado'.
     * Devuelve el timbre. 
     * Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * xmlFirmado: XML Firmado, sin timbrar, versión 3.0 según el Anexo 20.
     */
    public java.lang.String getTimbreCFDI(java.lang.String usuario, java.lang.String password, java.lang.String xmlFirmado) throws java.rmi.RemoteException;

    /**
     * Cancela un UUID utilizando la información registrada por emisor
     * en la base de datos de EdixCFD.
     * Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * rfcEmisor: Identificación fiscal de la empresa emisora del documento.
     */
    public java.lang.String cancelarCFDI(java.lang.String usuario, java.lang.String password, java.lang.String rfcEmisor, java.lang.String uuid) throws java.rmi.RemoteException;
    public long SAT_ValidarListaBlanca(java.lang.String cRFC, java.lang.String cNumeroCertificado, java.util.Calendar dFechaFAK, javax.xml.rpc.holders.StringHolder cMensaje) throws java.rmi.RemoteException;
    public boolean SAT_ValidarCertificadoPropiosMedios(java.lang.String cRFC, java.lang.String cNumeroCertificado, java.lang.String cCertificadoBase64, com.ekomercio.edixcfdisecure.holders.EnValidacionCertificadoHolder nValidacionCertificado, javax.xml.rpc.holders.StringHolder cMensaje) throws java.rmi.RemoteException;
    public boolean SAT_ValidarCertificadoPropiosMediosFechaDoc(java.lang.String cRFC, java.lang.String cNumeroCertificado, java.lang.String cCertificadoBase64, com.ekomercio.edixcfdisecure.holders.EnValidacionCertificadoHolder nValidacionCertificado, javax.xml.rpc.holders.StringHolder cMensaje, java.util.Calendar dFechaDocumento) throws java.rmi.RemoteException;
    public boolean SAT_ConsecutivoDentroRango(java.lang.String cRFC, java.lang.Object oSerie, long nFolio, long nAnoAprob, java.lang.String nNumAprob, javax.xml.rpc.holders.StringHolder cMensaje) throws java.rmi.RemoteException;

    /**
     * Anula (cancela) una factura electrónica con base en el XML
     * contenido
     * en la variable 'datosDocumentoXML'. Una vez anulado, emite la nota
     * de crédito correspondiente. 
     * Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * id: Identificación fiscal de la empresa emisora del documento (RFC
     * en México).
     * datosDocumentoXML: Estructura con los datos del documento que se desea
     * anular.
     */
    public java.lang.String anularDocumentoElectronicoXML(java.lang.String usuario, java.lang.String password, java.lang.String id, java.lang.String datosDocumentoXML) throws java.rmi.RemoteException;

    /**
     * Anula (cancela) una factura electrónica con base en el XML
     * contenido
     * en la variable 'datosDocumentoXML'. Devuelve el mismo documento anulado
     * (cancelado). 
     * Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * id: Identificación fiscal de la empresa emisora del documento (RFC
     * en México).
     * datosDocumentoXML: Estructura con los datos del documento que se desea
     * anular.
     */
    public java.lang.String anularDocumentoElectronicoXML_SinNotaDeCredito(java.lang.String usuario, java.lang.String password, java.lang.String id, java.lang.String datosDocumentoXML) throws java.rmi.RemoteException;

    /**
     * Valida y recibe un CFD ó CFDI con base en el xml UTF8 en la
     * variable 'xmlFirmado'. Devuelve un acuse XML que indica el resultado.
     * 
     * Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * xmlFirmado: XML Firmado versión 2.x/3.x según el Anexo 20.
     */
    public java.lang.String receiveCFD(java.lang.String usuario, java.lang.String password, java.lang.String xmlFirmado) throws java.rmi.RemoteException;

    /**
     * Convierte un archivo xml de propios medios CFD a un CFDI con
     * base en el xml UTF8 en la variable 'xmlCFD'. Devuelve el XML completo
     * 
     * Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * xmlFile: XML, sin timbrar, versión 2.2 según el Anexo 20.
     */
    public java.lang.String getCFDI_FromCFD(java.lang.String usuario, java.lang.String password, java.lang.String xmlCFD) throws java.rmi.RemoteException;

    /**
     * Genera la representación gráfica PDF de la factura en base
     * a los documentos extraídos de datos de EdixCFD.
     * Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * rfcEmisor: Identificación fiscal de la empresa emisora del documento.
     * uuid: Identificador unico del documento fiscal.
     */
    public java.lang.String generaPDF(java.lang.String usuario, java.lang.String password, java.lang.String rfcemisor, java.lang.String uuid) throws java.rmi.RemoteException;

    /**
     * Convierte un archivo xml de propios medios CFD a un CFDI con
     * base en el xml UTF8 en la variable 'xmlCFD'. Devuelve el XML completo
     * 
     * Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * xmlFile: XML, sin timbrar, versión 2.2 según el Anexo 20.
     */
    public java.lang.String getCFDI_FromCFDToken(java.lang.String usuario, java.lang.String password, java.lang.String xmlCFD) throws java.rmi.RemoteException;
    public boolean SAT_ValidarComplementoNomina(com.ekomercio.edixcfdisecure.SAT_ValidarComplementoNominaOXMLDocument oXMLDocument, javax.xml.rpc.holders.StringHolder cMensaje) throws java.rmi.RemoteException;
    public boolean existeConsecutivoInterno(java.lang.String cConsecutivoInterno, javax.xml.rpc.holders.StringHolder cErrorMensaje) throws java.rmi.RemoteException;

    /**
     * Genera la representación gráfica PDF de los documentos recibidos
     * en EdixCFD.
     * Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * rfcReceptor: Identificación fiscal de la empresa receptora del documento.
     * uuid: Identificador unico del documento fiscal.
     */
    public java.lang.String generaPDF_Recepcion(java.lang.String usuario, java.lang.String password, java.lang.String rfcReceptor, java.lang.String uuid) throws java.rmi.RemoteException;

    /**
     * Genera la representación gráfica PDF de los documentos emitidos
     * en EdixCFD.
     * Los parámetros son los siguientes: 
     * usuario: Usuario asignado para ingresar al WebService WSCFDBuilder.
     * password: Contraseña asignada para ingresar al WebService WSCFDBuilder.
     * rfcEmisor: Identificación fiscal de la empresa emisora del documento.
     * uuid: Identificador unico del documento fiscal.
     */
    public java.lang.String generaPDF_Envio(java.lang.String usuario, java.lang.String password, java.lang.String rfcEmisor, java.lang.String uuid) throws java.rmi.RemoteException;
    public boolean validarFuncionamiento(javax.xml.rpc.holders.StringHolder cMensaje) throws java.rmi.RemoteException;
}

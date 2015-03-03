package com.ekomercio.edixcfdisecure;

public class WSCFDBuilderPlusSoapProxy implements com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoap {
  private String _endpoint = null;
  private com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoap wSCFDBuilderPlusSoap = null;
  
  public WSCFDBuilderPlusSoapProxy() {
    _initWSCFDBuilderPlusSoapProxy();
  }
  
  public WSCFDBuilderPlusSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSCFDBuilderPlusSoapProxy();
  }
  
  private void _initWSCFDBuilderPlusSoapProxy() {
    try {
      wSCFDBuilderPlusSoap = (new com.ekomercio.edixcfdisecure.WSCFDBuilderPlusLocator()).getWSCFDBuilderPlusSoap();
      if (wSCFDBuilderPlusSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSCFDBuilderPlusSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSCFDBuilderPlusSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSCFDBuilderPlusSoap != null)
      ((javax.xml.rpc.Stub)wSCFDBuilderPlusSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoap getWSCFDBuilderPlusSoap() {
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap;
  }
  
  public java.lang.String about() throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.about();
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.helloWorld();
  }
  
  public java.lang.String procesarTextoPlano(java.lang.String usuario, java.lang.String password, java.lang.String id, java.lang.String textoPlano) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.procesarTextoPlano(usuario, password, id, textoPlano);
  }
  
  public java.lang.String getCFDI(java.lang.String usuario, java.lang.String password, java.lang.String xmlFirmado) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.getCFDI(usuario, password, xmlFirmado);
  }
  
  public java.lang.String getCFDI_Sign(java.lang.String usuario, java.lang.String password, java.lang.String xmlFirmado) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.getCFDI_Sign(usuario, password, xmlFirmado);
  }
  
  public java.lang.String getTimbreCFDI(java.lang.String usuario, java.lang.String password, java.lang.String xmlFirmado) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.getTimbreCFDI(usuario, password, xmlFirmado);
  }
  
  public java.lang.String cancelarCFDI(java.lang.String usuario, java.lang.String password, java.lang.String rfcEmisor, java.lang.String uuid) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.cancelarCFDI(usuario, password, rfcEmisor, uuid);
  }
  
  public long SAT_ValidarListaBlanca(java.lang.String cRFC, java.lang.String cNumeroCertificado, java.util.Calendar dFechaFAK, javax.xml.rpc.holders.StringHolder cMensaje) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.SAT_ValidarListaBlanca(cRFC, cNumeroCertificado, dFechaFAK, cMensaje);
  }
  
  public boolean SAT_ValidarCertificadoPropiosMedios(java.lang.String cRFC, java.lang.String cNumeroCertificado, java.lang.String cCertificadoBase64, com.ekomercio.edixcfdisecure.holders.EnValidacionCertificadoHolder nValidacionCertificado, javax.xml.rpc.holders.StringHolder cMensaje) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.SAT_ValidarCertificadoPropiosMedios(cRFC, cNumeroCertificado, cCertificadoBase64, nValidacionCertificado, cMensaje);
  }
  
  public boolean SAT_ValidarCertificadoPropiosMediosFechaDoc(java.lang.String cRFC, java.lang.String cNumeroCertificado, java.lang.String cCertificadoBase64, com.ekomercio.edixcfdisecure.holders.EnValidacionCertificadoHolder nValidacionCertificado, javax.xml.rpc.holders.StringHolder cMensaje, java.util.Calendar dFechaDocumento) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.SAT_ValidarCertificadoPropiosMediosFechaDoc(cRFC, cNumeroCertificado, cCertificadoBase64, nValidacionCertificado, cMensaje, dFechaDocumento);
  }
  
  public boolean SAT_ConsecutivoDentroRango(java.lang.String cRFC, java.lang.Object oSerie, long nFolio, long nAnoAprob, java.lang.String nNumAprob, javax.xml.rpc.holders.StringHolder cMensaje) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.SAT_ConsecutivoDentroRango(cRFC, oSerie, nFolio, nAnoAprob, nNumAprob, cMensaje);
  }
  
  public java.lang.String anularDocumentoElectronicoXML(java.lang.String usuario, java.lang.String password, java.lang.String id, java.lang.String datosDocumentoXML) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.anularDocumentoElectronicoXML(usuario, password, id, datosDocumentoXML);
  }
  
  public java.lang.String anularDocumentoElectronicoXML_SinNotaDeCredito(java.lang.String usuario, java.lang.String password, java.lang.String id, java.lang.String datosDocumentoXML) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.anularDocumentoElectronicoXML_SinNotaDeCredito(usuario, password, id, datosDocumentoXML);
  }
  
  public java.lang.String receiveCFD(java.lang.String usuario, java.lang.String password, java.lang.String xmlFirmado) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.receiveCFD(usuario, password, xmlFirmado);
  }
  
  public java.lang.String getCFDI_FromCFD(java.lang.String usuario, java.lang.String password, java.lang.String xmlCFD) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.getCFDI_FromCFD(usuario, password, xmlCFD);
  }
  
  public java.lang.String generaPDF(java.lang.String usuario, java.lang.String password, java.lang.String rfcemisor, java.lang.String uuid) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.generaPDF(usuario, password, rfcemisor, uuid);
  }
  
  public java.lang.String getCFDI_FromCFDToken(java.lang.String usuario, java.lang.String password, java.lang.String xmlCFD) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.getCFDI_FromCFDToken(usuario, password, xmlCFD);
  }
  
  public boolean SAT_ValidarComplementoNomina(com.ekomercio.edixcfdisecure.SAT_ValidarComplementoNominaOXMLDocument oXMLDocument, javax.xml.rpc.holders.StringHolder cMensaje) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.SAT_ValidarComplementoNomina(oXMLDocument, cMensaje);
  }
  
  public boolean existeConsecutivoInterno(java.lang.String cConsecutivoInterno, javax.xml.rpc.holders.StringHolder cErrorMensaje) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.existeConsecutivoInterno(cConsecutivoInterno, cErrorMensaje);
  }
  
  public java.lang.String generaPDF_Recepcion(java.lang.String usuario, java.lang.String password, java.lang.String rfcReceptor, java.lang.String uuid) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.generaPDF_Recepcion(usuario, password, rfcReceptor, uuid);
  }
  
  public java.lang.String generaPDF_Envio(java.lang.String usuario, java.lang.String password, java.lang.String rfcEmisor, java.lang.String uuid) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.generaPDF_Envio(usuario, password, rfcEmisor, uuid);
  }
  
  public boolean validarFuncionamiento(javax.xml.rpc.holders.StringHolder cMensaje) throws java.rmi.RemoteException{
    if (wSCFDBuilderPlusSoap == null)
      _initWSCFDBuilderPlusSoapProxy();
    return wSCFDBuilderPlusSoap.validarFuncionamiento(cMensaje);
  }
  
  
}
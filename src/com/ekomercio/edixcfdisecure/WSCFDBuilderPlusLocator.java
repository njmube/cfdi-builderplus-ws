/**
 * WSCFDBuilderPlusLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ekomercio.edixcfdisecure;

public class WSCFDBuilderPlusLocator extends org.apache.axis.client.Service implements com.ekomercio.edixcfdisecure.WSCFDBuilderPlus {

    public WSCFDBuilderPlusLocator() {
    }


    public WSCFDBuilderPlusLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSCFDBuilderPlusLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSCFDBuilderPlusSoap
    private java.lang.String WSCFDBuilderPlusSoap_address = "https://timbradosecure.ekomercio.com/WSCFDIBuilderPlusXML/WSCFDBuilderPlus.asmx";

    public java.lang.String getWSCFDBuilderPlusSoapAddress() {
        return WSCFDBuilderPlusSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSCFDBuilderPlusSoapWSDDServiceName = "WSCFDBuilderPlusSoap";

    public java.lang.String getWSCFDBuilderPlusSoapWSDDServiceName() {
        return WSCFDBuilderPlusSoapWSDDServiceName;
    }

    public void setWSCFDBuilderPlusSoapWSDDServiceName(java.lang.String name) {
        WSCFDBuilderPlusSoapWSDDServiceName = name;
    }

    public com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoap getWSCFDBuilderPlusSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSCFDBuilderPlusSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSCFDBuilderPlusSoap(endpoint);
    }

    public com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoap getWSCFDBuilderPlusSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoapStub _stub = new com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoapStub(portAddress, this);
            _stub.setPortName(getWSCFDBuilderPlusSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSCFDBuilderPlusSoapEndpointAddress(java.lang.String address) {
        WSCFDBuilderPlusSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoapStub _stub = new com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoapStub(new java.net.URL(WSCFDBuilderPlusSoap_address), this);
                _stub.setPortName(getWSCFDBuilderPlusSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WSCFDBuilderPlusSoap".equals(inputPortName)) {
            return getWSCFDBuilderPlusSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "WSCFDBuilderPlus");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://edixcfdisecure.ekomercio.com/", "WSCFDBuilderPlusSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSCFDBuilderPlusSoap".equals(portName)) {
            setWSCFDBuilderPlusSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

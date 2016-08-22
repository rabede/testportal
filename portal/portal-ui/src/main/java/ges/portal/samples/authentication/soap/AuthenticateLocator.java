/**
 * AuthenticateLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ges.portal.samples.authentication.soap;

public class AuthenticateLocator extends org.apache.axis.client.Service implements Authenticate {

    public AuthenticateLocator() {
    }


    public AuthenticateLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AuthenticateLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for authenticate
    private java.lang.String authenticate_address = "http://wisa33.wisa.local:8000/sap/bc/srt/rfc/sap/yrb_authenticate/005/authenticate/authenticate";

    public java.lang.String getauthenticateAddress() {
        return authenticate_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String authenticateWSDDServiceName = "authenticate";

    public java.lang.String getauthenticateWSDDServiceName() {
        return authenticateWSDDServiceName;
    }

    public void setauthenticateWSDDServiceName(java.lang.String name) {
        authenticateWSDDServiceName = name;
    }

    public Yrb_authenticate getauthenticate() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(authenticate_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getauthenticate(endpoint);
    }

    public Yrb_authenticate getauthenticate(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            AuthenticateStub _stub = new AuthenticateStub(portAddress, this);
            _stub.setPortName(getauthenticateWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setauthenticateEndpointAddress(java.lang.String address) {
        authenticate_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Yrb_authenticate.class.isAssignableFrom(serviceEndpointInterface)) {
                AuthenticateStub _stub = new AuthenticateStub(new java.net.URL(authenticate_address), this);
                _stub.setPortName(getauthenticateWSDDServiceName());
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
        if ("authenticate".equals(inputPortName)) {
            return getauthenticate();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "authenticate");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "authenticate"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("authenticate".equals(portName)) {
            setauthenticateEndpointAddress(address);
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

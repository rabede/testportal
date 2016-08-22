/**
 * Authenticate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ges.portal.samples.authentication.soap;

public interface Authenticate extends javax.xml.rpc.Service {
    public java.lang.String getauthenticateAddress();

    public Yrb_authenticate getauthenticate() throws javax.xml.rpc.ServiceException;

    public Yrb_authenticate getauthenticate(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

package ges.portal.samples.authentication.soap;

public class Yrb_authenticateProxy implements Yrb_authenticate {
  private String _endpoint = null;
  private Yrb_authenticate yrb_authenticate = null;
  
  public Yrb_authenticateProxy() {
    _initYrb_authenticateProxy();
  }
  
  public Yrb_authenticateProxy(String endpoint) {
    _endpoint = endpoint;
    _initYrb_authenticateProxy();
  }
  
  private void _initYrb_authenticateProxy() {
    try {
      yrb_authenticate = (new AuthenticateLocator()).getauthenticate();
      if (yrb_authenticate != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)yrb_authenticate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)yrb_authenticate)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (yrb_authenticate != null)
      ((javax.xml.rpc.Stub)yrb_authenticate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Yrb_authenticate getYrb_authenticate() {
    if (yrb_authenticate == null)
      _initYrb_authenticateProxy();
    return yrb_authenticate;
  }
  
  public java.lang.String yrbAuthenticate(java.lang.String password, java.lang.String user) throws java.rmi.RemoteException{
    if (yrb_authenticate == null)
      _initYrb_authenticateProxy();
    return yrb_authenticate.yrbAuthenticate(password, user);
  }
  
  
}
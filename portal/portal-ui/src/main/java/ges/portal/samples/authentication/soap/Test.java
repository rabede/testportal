package ges.portal.samples.authentication.soap;

import java.rmi.RemoteException;

public class Test {

	public static void main(String[] arg) throws RemoteException {

		Yrb_authenticateProxy authenticate = new Yrb_authenticateProxy();

		String valid = authenticate.yrbAuthenticate("test", "tet");

		if (valid.equalsIgnoreCase("x")) {
			System.out.println("User OK");
		} else {
			System.out.println("User nicht OK");
		}
	}

}

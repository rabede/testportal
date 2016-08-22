package ges.portal.samples.authentication;

import ges.portal.samples.authentication.soap.*;
import java.rmi.RemoteException;

/**
 * Default mock implementation of {@link AccessControl}. This implementation
 * accepts any string as a password, and considers the user "admin" as the only
 * administrator.
 */
public class SoapAccessControl implements AccessControl {

	@Override
	public boolean signIn(String username, String password) {

		String valid = null;
		Yrb_authenticate authenticate = new Yrb_authenticateProxy();

		try {
			valid = authenticate.yrbAuthenticate(username, password);
		} catch (RemoteException re) {
			return false;
		}

		if (valid == null || valid.isEmpty())
			return false;

		CurrentUser.set(username);
		return true;
	}

	@Override
	public boolean isUserSignedIn() {
		return !CurrentUser.get().isEmpty();
	}

	@Override
	public boolean isUserInRole(String role) {
		if ("admin".equals(role)) {
			// Only the "admin" user is in the "admin" role
			return getPrincipalName().equals("admin");
		}

		// All users are in all non-admin roles
		return true;
	}

	@Override
	public String getPrincipalName() {
		return CurrentUser.get();
	}

}

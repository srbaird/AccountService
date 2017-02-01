
package com.bac.accountservice;

import java.io.Serializable;

/**
 * Specifies attributes to resolve user access to an application or account. The
 * result of the operation is represented by the
 * {@code AccountServiceAuthenticationOutcome}
 * 
 * @author Simon Baird
 */
public interface AccountServiceAuthentication extends Serializable {

	String getApplicationName();

	String getAccountKey();

	String getAccountPassword();

	String getAccountName();

	Object getAccountResource();

	AccountServiceRole getAccountRole();

	AccountServiceAuthenticationOutcome getAuthenticationOutcome();

	void setApplicationName(String applicationName);

	void setAccountKey(String accountKey);

	void setAccountPassword(String accountPassword);

	void setAccountName(String accountName);

	void setAccountResource(Object accountResource);

	void setAccountRole(AccountServiceRole accountRole);

	void setAuthenticationOutcome(AccountServiceAuthenticationOutcome authenticationOutcome);
}

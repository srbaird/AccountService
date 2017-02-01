
package com.bac.accountservice;

import java.io.Serializable;

/**
 * Specifies the attributes required to authenticate an application. Typically
 * this would be used to query an application status before presenting login
 * options.
 * 
 * @author Simon Baird
 */
public interface AccountServiceApplication extends Serializable {

	String getName();

	void setName(String name);

	boolean isEnabled();

	void setEnabled(boolean isEnabled);

	boolean isRegistrationOpen();

	void setRegistrationOpen(boolean isRegistrationOpen);

	AccountServiceAuthenticationOutcome getAuthenticationOutcome();

	void setAuthenticationOutcome(AccountServiceAuthenticationOutcome authenticationOutcome);
}

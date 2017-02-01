
package com.bac.accountservice;

/**
 * A default implementation of the {@code AccountServiceAuthentication} interface.
 * interface.
 * 
 * @author Simon Baird
 */
public class SimpleAccountServiceAuthentication implements AccountServiceAuthentication {


	private static final long serialVersionUID = 8349385620990771994L;
	//
	private String applicationName;
	private String accountKey;
	private String accountPassword;
	private String accountName;
	private Object accountResource;
	private AccountServiceRole accountRole;
	private AccountServiceAuthenticationOutcome authenticationOutcome;

	@Override
	public String getApplicationName() {
		return applicationName;
	}

	@Override
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	@Override
	public String getAccountKey() {
		return accountKey;
	}

	@Override
	public void setAccountKey(String accountKey) {
		this.accountKey = accountKey;
	}

	@Override
	public String getAccountPassword() {
		return accountPassword;
	}

	@Override
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	@Override
	public String getAccountName() {
		return accountName;
	}

	@Override
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Override
	public Object getAccountResource() {
		return accountResource;
	}

	@Override
	public void setAccountResource(Object accountResource) {
		this.accountResource = accountResource;
	}

	@Override
	public AccountServiceRole getAccountRole() {
		return accountRole;
	}

	@Override
	public void setAccountRole(AccountServiceRole accountRole) {
		this.accountRole = accountRole;
	}

	@Override
	public AccountServiceAuthenticationOutcome getAuthenticationOutcome() {
		return authenticationOutcome;
	}

	@Override
	public void setAuthenticationOutcome(AccountServiceAuthenticationOutcome authenticationOutcome) {
		this.authenticationOutcome = authenticationOutcome;
	}
}

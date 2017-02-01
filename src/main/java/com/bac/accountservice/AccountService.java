
package com.bac.accountservice;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.Authentication;

/**
 *
 * Implemented by applications that provide login authentication.
 * 
 * Access control procedures can use this to query the privileges of users as
 * well as the status of applications. It also specifies an method to create a
 * login.
 * 
 * 
 * @author Simon Baird
 */
public interface AccountService {

	/**
	 * A Spring Security based authentication method.
	 * 
	 * @param authentication
	 *            the Spring {@link AbstractAuthenticationToken} request token
	 * @return a {@link Authentication} primarily indicating the
	 *         {@code AccountServiceAuthenticationOutcome} of the request
	 */
	Authentication login(AbstractAuthenticationToken authentication);

	/**
	 * Uses the {@ AccountServiceAuthentication} as a method of authentication
	 * interrogation.
	 * 
	 * @param authentication
	 *            a populated {@code AccountServiceAuthentication} containing
	 *            the user credentials
	 * @return the parameter {@code AccountServiceAuthentication} with the
	 *         {@code AccountServiceAuthenticationOutcome} of the request
	 */
	AccountServiceAuthentication login(AccountServiceAuthentication authentication);

	/**
	 * Uses the {@ AccountServiceAuthentication} as a method of authentication
	 * interrogation. The supplied user details will be used to create access to
	 * the supplied application.
	 * 
	 * @param authentication
	 *            a {@code AccountServiceAuthentication} containing the user and
	 *            application details
	 * @return the parameter {@code AccountServiceAuthentication} with the
	 *         {@code AccountServiceAuthenticationOutcome} of the request
	 */
	AccountServiceAuthentication createLogin(AccountServiceAuthentication authentication);

	/**
	 * Uses the {@ AccountServiceApplication} as a method of application
	 * authentication interrogation. The status of an application may be
	 * retrieved before presenting login or account options.
	 * 
	 * @param authentication
	 *            a {@code AccountServiceApplication} containing the application
	 *            details
	 * @return the parameter {@code AccountServiceAuthentication} with the
	 *         {@code AccountServiceApplication} of the request
	 */
	AccountServiceApplication authenticateApplication(AccountServiceApplication authentication);
}

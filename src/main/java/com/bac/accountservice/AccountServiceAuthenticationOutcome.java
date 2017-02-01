
package com.bac.accountservice;

/**
 * Represents the possible outcomes of User or Application authentication
 * attempt.
 * 
 * @author Simon Baird
 */
public enum AccountServiceAuthenticationOutcome {

	/**
	 * The supplied Application name was not found
	 */
	NO_APPLICATION,
	/**
	 * The Application was found but new accounts may not be created
	 */
	APPLICATION_CLOSED,
	/**
	 * No Spring Security authentication provider available
	 */
	NO_PROVIDER,
	/**
	 * The User login key was not found
	 */
	UNKNOWN_PRINCIPAL,
	/**
	 * For account creation, the User key already exists
	 */
	PRINCIPAL_EXISTS,
	/**
	 * A general outcome to indicate a non-authentic User. Does not discriminate
	 * as to reason for failure.
	 */
	INVALID_PRINCIPAL,
	/**
	 * User authentication failed as a result of an incorrect password.
	 */
	BAD_CREDENTIALS,
	/**
	 * The login was authenticated but the required access was not active.
	 */
	DISABLED_PRINCIPAL,
	/**
	 * The login was authenticated but the no access to the application was
	 * found.
	 */
	NO_ROLE,
	/**
	 * No account was resource found
	 */
	NO_RESOURCE,
	/**
	 * Indicates that a User login was successfully created but is pending
	 * further action.
	 */
	PENDING_CREATION,
	/**
	 * Authentication was successful.
	 */
	AUTHENTICATED;
}


package com.bac.accountservice;

/**
 * Represents a set of roles that are assigned to a User account in order to
 * provide access restrictions if required. Interpretation of each assigned role is arbitrary.
 * 
 * @author Simon Baird
 */
public enum AccountServiceRole {

	ADMIN, SUPERUSER, OWNER, GUEST;
}


package com.bac.accountservice;

/**
 * A default implementation of the {@code AccountServiceApplication} interface.
 * 
 * @author Simon Baird
 */
public class SimpleAccountServiceApplication implements AccountServiceApplication {

	private static final long serialVersionUID = -8616698692331389329L;
	private String name;
    private boolean isEnabled;
    private boolean isRegistrationOpen;
    private AccountServiceAuthenticationOutcome authenticationOutcome;

    @Override
    public String getName() {
        
        return name;
    }

    @Override
    public void setName(String name) {
        
        this.name = name;
    }

    @Override
    public boolean isEnabled() {
        
        return isEnabled;
    }

    @Override
    public void setEnabled(boolean isEnabled) {
        
        this.isEnabled = isEnabled;
    }

    @Override
    public boolean isRegistrationOpen() {
        
        return isRegistrationOpen;
    }

    @Override
    public void setRegistrationOpen(boolean isRegistrationOpen) {
        
        this.isRegistrationOpen = isRegistrationOpen;
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

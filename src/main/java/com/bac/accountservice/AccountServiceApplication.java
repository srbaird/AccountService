/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bac.accountservice;

import java.io.Serializable;

/**
 *
 * @author user0001
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

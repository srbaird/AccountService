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

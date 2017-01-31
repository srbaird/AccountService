/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bac.accountservice;

/**
 *
 * @author user0001
 */
public enum AccountServiceAuthenticationOutcome {

    NO_APPLICATION,
    APPLICATION_CLOSED,
    NO_PROVIDER, 
    UNKNOWN_PRINCIPAL, 
    PRINCIPAL_EXISTS, 
    INVALID_PRINCIPAL, 
    BAD_CREDENTIALS, 
    DISABLED_PRINCIPAL, 
    NO_ROLE, 
    NO_RESOURCE, 
    PENDING_CREATION,
    AUTHENTICATED;
}

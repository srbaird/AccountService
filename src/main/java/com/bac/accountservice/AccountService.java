/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bac.accountservice;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.Authentication;

/**
 *
 * @author user0001
 */
public interface AccountService {

    Authentication login(AbstractAuthenticationToken authentication);

    AccountServiceAuthentication login(AccountServiceAuthentication authentication);

    AccountServiceAuthentication createLogin(AccountServiceAuthentication authentication);

    AccountServiceApplication authenticateApplication(AccountServiceApplication authentication);
}

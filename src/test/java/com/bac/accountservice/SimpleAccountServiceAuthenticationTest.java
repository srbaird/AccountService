/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bac.accountservice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author user0001
 */
public class SimpleAccountServiceAuthenticationTest {

    // logger
    private static final Logger logger = LoggerFactory.getLogger(SimpleAccountServiceAuthenticationTest.class);

    public SimpleAccountServiceAuthenticationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRegExp() {

        final String authorityStringPattern = "(.*)::(.*)";
        Pattern pattern = Pattern.compile(authorityStringPattern);

        final String match1 = "Application name::Application role";
        Matcher matcher1 = pattern.matcher(match1);
        if (matcher1.matches()) {
            logger.info("Group size: '{}'", matcher1.groupCount());
            logger.info("Group 1: '{}'", matcher1.group(1));
            logger.info("Group 2: '{}'", matcher1.group(2));
        } else {
            logger.warn("No match");
        }

        final String match2 = "Ringlefinch::";
        Matcher matcher2 = pattern.matcher(match2);
        if (matcher2.matches()) {
            logger.info("Group size: '{}'", matcher2.groupCount());
            logger.info("Group 1: '{}'", matcher2.group(1));
            logger.info("Group 2: '{}'", matcher2.group(2));
        } else {
            logger.warn("No match");
        }

        final String match3 = "::Sausage roll";
        Matcher matcher3 = pattern.matcher(match3);
        if (matcher3.matches()) {
            logger.info("Group size: '{}'", matcher3.groupCount());
            logger.info("Group 1: '{}'", matcher3.group(1));
            logger.info("Group 2: '{}'", matcher3.group(2));
        } else {
            logger.warn("No match");
        }

        final String match4 = "Hard work:Bacon butty";
        Matcher matcher4 = pattern.matcher(match4);
        if (matcher4.matches()) {
            logger.info("Group size: '{}'", matcher4.groupCount());
            logger.info("Group 1: '{}'", matcher4.group(1));
            logger.info("Group 2: '{}'", matcher4.group(2));
        } else {
            logger.warn("'{}': No match", match4);
        }

        final String match5 = "Rinty tint tint";
        Matcher matcher5 = pattern.matcher(match5);
        if (matcher5.matches()) {
            logger.info("Group size: '{}'", matcher5.groupCount());
            logger.info("Group 1: '{}'", matcher5.group(1));
            logger.info("Group 2: '{}'", matcher5.group(2));
        } else {
            logger.warn("'{}': No match", match5);
        }
    }
}

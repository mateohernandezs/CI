/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class TestCIMainTest {
    
    public TestCIMainTest() {
    }

    /**
     * Test of sum method, of class TestCIMain.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n1 = 0;
        int n2 = 0;
        TestCIMain instance = new TestCIMain();
        int expResult = 0;
        int result = instance.sum(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}

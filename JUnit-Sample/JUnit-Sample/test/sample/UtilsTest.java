/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

/**
 *
 * @author Usuario
 */
public class UtilsTest {
    
    public UtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        System.out.println("* UtilsTest: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
        System.out.println("* UtilsTest: @AfterClass method");
    }
    
    @Before
    public void setUp() throws Exception 
    {
        System.out.println("* UtilsTest: @Before method");
    }
    @After
    public void tearDown() throws Exception 
    {
        System.out.println("* UtilsTest: @After method");
    }


    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void helloWorldCheck() 
    {
        System.out.println("* UtilsTest: test method 1 - helloWorldCheck()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test(timeout=1000)
    public void testWithTimeout()
    {
        System.out.println("* UtilsTest: test method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + '!');
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }

    @Test(expected=IllegalArgumentException.class)
    public void checkExpectedException() 
    {
        System.out.println("* UtilsTest: test method 3 - checkExpectedException()");
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }
 
    /**
     * Test of normalizeWord method, of class Utils.
     */
    @Ignore
    @Test
    public void temporarilyDisabledTest() throws Exception 
    {
        System.out.println("* UtilsTest: test method 4 - temporarilyDisabledTest()");
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }

    
}

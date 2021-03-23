/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.junit;

import javafx.stage.Stage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 6teme
 */
public class PruebasJUnitTest {
    
    public PruebasJUnitTest() {
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

    /**
     * Test of start method, of class PruebasJUnit.
     */
    @Test
    public void testMax()
    {
        System.out.println("Pruebas JUnit NumeroMax");
        assertEquals(9, PruebasJUnit.max(new int [] {3, 5, 9}));
        assertEquals(9, PruebasJUnit.max(new int [] {5, 9, 3}));
        assertEquals(-3, PruebasJUnit.max(new int [] {-5, -4, -3}));
        assertEquals(1, PruebasJUnit.max(new int [] {1}));
        assertEquals(0, PruebasJUnit.max(new int [] {}));
        assertEquals(0, PruebasJUnit.max(null));
    }
    
    @Test(timeout=1000)
    public void testMaxTiempo()
    {
        System.out.println("Pruebas JUnit NumeroMax Tiempo");
        assertEquals(9, PruebasJUnit.max(new int [] {3, 5, 2, 7, 5, 8, 3, 7 ,8 ,9}));
    }
    
}

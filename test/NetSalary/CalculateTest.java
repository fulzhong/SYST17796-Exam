/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package NetSalary;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author calvi
 */
public class CalculateTest {
    
    public CalculateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Beginning Unit Tests\n");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("\nUnit Tests Completed");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        System.out.println("-----------");
    }

    /**
     * Test of calculateNet method, of class Calculate.
     */
    @Test
    public void testCalculateNetGood() {
        System.out.println("calculateNetGood");
        Double hours = 10.0;
        Double rate = 10.0;
        Double tax = 1.0;
        double expResult = 99.0;
        double result = Calculate.calculateNet(hours, rate, tax);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateNetBad() {
        System.out.println("calculateNetBad");
        Double hours = 10.0;
        Double rate = 10.0;
        Double tax = 900.0;
        double expResult = -800.0;
        double result = Calculate.calculateNet(hours, rate, tax);
        assertEquals(expResult, result, 0.0);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as;

import stm_1_0.Abc;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class AbcTest {
    
    public AbcTest() {
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
     * Test of getFullName method, of class Abc.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        String fn = "Mahee";
        String ln = "Chandranath";
        Abc instance = new Abc();
        String expResult = "Mahee Chandranath";
        String result = instance.getFullName(fn, ln);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getSum method, of class Abc.
     */
    @Test
    public void testGetSum() {
        System.out.println("getSum");
        int fn = 2;
        int ln = 8;
        Abc instance = new Abc();
        int expResult = 10;
        int result = instance.getSum(fn, ln);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

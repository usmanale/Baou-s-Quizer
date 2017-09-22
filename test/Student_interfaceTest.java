/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author baou usman
 */
public class Student_interfaceTest {
    
    public Student_interfaceTest() {
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
     * Test of ShowQuizTitle method, of class Student_interface.
     */
    @Test
    public void testShowQuizTitle() {
        System.out.println("ShowQuizTitle");
        Student_interface instance = new Student_interface();
        instance.ShowQuizTitle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Deserialize method, of class Student_interface.
     */
    @Test
    public void testDeserialize() {
        System.out.println("Deserialize");
        Student_interface instance = new Student_interface();
        Quiz expResult = null;
        Quiz result = instance.Deserialize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Student_interface.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Student_interface.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

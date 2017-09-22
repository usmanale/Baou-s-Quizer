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

        Student_interface S=new Student_interface();
        String Expout="Quiz";
        String result=S.ShowQuizTitle();
        assertEquals(result,Expout);
    }

    /**
     * Test of Deserialized method, of class Student_interface.
     */
    @Test
    public void testDeserialize() {

        Student_interface S1=new Student_interface();
        String expout="Quiz";
        Quiz result=S1.Deserialize();
        assertEquals(result.Title,expout);
    }
}

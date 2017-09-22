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
public class Instructor_interfaceTest {
    
    public Instructor_interfaceTest() {
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
     * Test of MakeQuiz method, of class Instructor_interface.
     */
    @Test
    public void testMakeQuiz() {
        Instructor_interface I=new Instructor_interface();
        I.Title1="Quiz";
        I.Description1="Science Quiz";
        I.Marks1.add("5");
        I.Questions1.add("God is one!");
        I.Answers1.add("True");
        I.CAnswers1.add("True");
        I.QType1.add("tf");
        boolean result=I.MakeQuiz();
        assertTrue(result);
    }
    
        @Test
    public void testsetQuizData() {
  
                Instructor_interface I=new Instructor_interface();
        I.Title1="Quiz";
        I.Description1="Science Quiz";
        I.Marks1.add("5");
        I.Questions1.add("God is one!");
        I.Answers1.add("True");
        I.CAnswers1.add("True");
        I.QType1.add("tf");
        Quiz result=I.setQuizData();
        assertEquals(result.Title,I.Title1);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gardensun
 */
public class SimulationControl3Test {
    
    public SimulationControl3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of runSimulation3 method, of class SimulationControl3.
     */
    @Test
    public void testRunSimulation3() {
        System.out.println("Test Case 1");
        int l = 0;
        int w = 1;
        int h = 1;
        SimulationControl3 instance = new SimulationControl3();
        String expResult = "All inputs must be greater than 0.";
        String result = instance.runSimulation3(l, w, h);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 2");
        l = 1;
        w = 0;
        h = 1;
        expResult = "All inputs must be greater than 0.";
   
        result = instance.runSimulation3(l, w, h);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 3");
        l = 1;
        w = 0;
        h = 1;
        expResult = "All inputs must be greater than 0.";
   
        result = instance.runSimulation3(l, w, h);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 4");
        l = 2;
        w = 10;
        h = 10;
        expResult = "Correct! You may enter.";
   
        result = instance.runSimulation3(l, w, h);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 4");
        l = 1;
        w = 10;
        h = 10;
        expResult = "Those inputs do not equal 200.";
   
        result = instance.runSimulation3(l, w, h);
        assertEquals(expResult, result);
    }
    
}

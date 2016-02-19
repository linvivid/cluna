/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lindsayprigmore
 */
public class SimulationControlTest {
    
    public SimulationControlTest() {
    }

    /**
     * Test of runSimulation method, of class SimulationControl.
     */
    @Test
    public void testRunSimulation() {
        System.out.println("testCase1");
        int numDoses = 250;
        double doseVolume = 4.0;
        double cureLeft = 0;
        double effectiveness = 100;
        SimulationControl instance = new SimulationControl();
        String expResult = "At " + numDoses + " doses of "+ doseVolume+ "ml each, there will be " + cureLeft + "mls of cure left, and "+effectiveness+ "% of individuals should develop an immunity.";
   
        String result = instance.runSimulation(numDoses, doseVolume);
        assertEquals(expResult, result);
        
        System.out.println("testCase2");
        numDoses = 250;
        doseVolume = -1;
        expResult = "The dose volume must be greater than zero to run the simulation.";
   
        result = instance.runSimulation(numDoses, doseVolume);
        assertEquals(expResult, result);
        
        System.out.println("testCase3");
        numDoses = -1;
        doseVolume = 4;
        expResult = "The number of doses must be greater than zero to return the simulation.";
   
        result = instance.runSimulation(numDoses, doseVolume);
        assertEquals(expResult, result);
        
        System.out.println("testCase4");
        numDoses = 1501;
        doseVolume = 4;
        expResult = "You have input too many doses to run the simulation.";
   
        result = instance.runSimulation(numDoses, doseVolume);
        assertEquals(expResult, result);
        
        System.out.println("testCase5");
        numDoses = 250;
        doseVolume = 1;
        cureLeft = 750;
        effectiveness = 25;
        expResult = "At " + numDoses + " doses of "+ doseVolume+ "ml each, there will be " + cureLeft + "mls of cure left, and "+effectiveness+ "% of individuals should develop an immunity.";
   
        result = instance.runSimulation(numDoses, doseVolume);
        assertEquals(expResult, result);
       
        System.out.println("testCase6");
        numDoses = 1;
        doseVolume = 4;
        cureLeft = 996;
        effectiveness = 100;
        expResult = "At " + numDoses + " doses of "+ doseVolume+ "ml each, there will be " + cureLeft + "mls of cure left, and "+effectiveness+ "% of individuals should develop an immunity.";
   
        result = instance.runSimulation(numDoses, doseVolume);
        assertEquals(expResult, result);
        
        System.out.println("testCase7");
        numDoses = 1500;
        doseVolume = 0.5;
        cureLeft = 250;
        effectiveness = 12.5;
        expResult = "At " + numDoses + " doses of "+ doseVolume+ "ml each, there will be " + cureLeft + "mls of cure left, and "+effectiveness+ "% of individuals should develop an immunity.";
   
        result = instance.runSimulation(numDoses, doseVolume);
        assertEquals(expResult, result);
        
        System.out.println("testCase7");
        numDoses = 1500;
        doseVolume = 0.5;
        cureLeft = 250;
        effectiveness = 12.5;
        expResult = "At " + numDoses + " doses of "+ doseVolume+ "ml each, there will be " + cureLeft + "mls of cure left, and "+effectiveness+ "% of individuals should develop an immunity.";
   
        result = instance.runSimulation(numDoses, doseVolume);
        assertEquals(expResult, result);
        
        System.out.println("testCase8");
        numDoses = 1500;
        doseVolume = 4;
        expResult = "There's not enough cure for that many doses at that volume.";
   
        result = instance.runSimulation(numDoses, doseVolume);
        assertEquals(expResult, result);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

/**
 *
 * @author gardensun
 */
public class SimulationView extends View {
    
    public SimulationView(){
        
        System.out.println("This is the cure distribution simulation. You will need to decide what dosage volume "
                + "and how many doses you will administer. The simulation will then run and tell you the effectiveness of your choice.");
    
        int numDoses = getInput();
        int doseVolume = getInput();
                
        runSimulation(numDoses,doseVolume) ;
    }
}


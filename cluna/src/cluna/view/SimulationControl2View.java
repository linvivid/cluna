/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;
import cluna.control.SimulationControl2;
        
/**
 *
 * @author lindsayprigmore
 */
/**
 *Problem Statement to Access Locked Cure:
 * A = 82
 * C = 46 + A
 * A = B + 67
 * 
 * Question:
 * B = ?
 * C = ?
 * A+B+C = ?
 */
public class SimulationControl2View extends View {
    
    public SimulationControl2View() {
    

    System.out.println("A = 82"
                  + "\n C = 46 + A"
                  + "\n A = B + 67"
                  + "\n"
                  + "\n Question:"
                  + "\n B = ?"
                  + "\n C = ?"
                  + "\n A + B + C = ?");
    
     System.out.println("Please input B");

        int guessB = getInput();
        int guessC = getInput();
        int guessAnswer = getInput();
        
     String result = runSimulation2(guessB, guessC, guessAnswer);
     
}
    
}

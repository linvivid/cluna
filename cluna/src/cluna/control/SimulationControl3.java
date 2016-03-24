/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.control;

/**
 *
 * @author gardensun
 */
public class SimulationControl3 {
    
    public boolean runSimulation3(int l,int w,int h){
        
        int vol = 200;
        
        int userAnswer = l * w * h;

        if (vol == userAnswer){
            return true;
        }
        else {
            return false;
        }
    }           
            
}

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
    
    public String runSimulation3(int l,int w,int h){
        
        int vol = 200;

        if (l<0 || w<0 || h<0){
           return "All inputs must be greater than 0.";
        }
        
        int userAnswer = l * w * h;

        if (vol == userAnswer){
            return "Those inputs do not equal 200.";
        }
        else {
            return "Correct! You may enter.";
        }
    }           
            
}

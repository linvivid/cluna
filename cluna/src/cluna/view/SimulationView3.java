/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.control.SimulationControl3;
import java.util.Scanner;
/**
 *
 * @author gardensun
 */
public class SimulationView3 {
    
    public SimulationView3(){
        System.out.println("In order to pass, you must input three numbers (a length,"
                         + "\n a width, and a height) that will result in a volume of 200.");
        
        int l = 0;
        int w = 0;
        int h = 0;
        
        try {
            System.out.println("Please input your length.");
            l = Integer.parseInt(getInput());
            System.out.println("Please input your width.");
            w = Integer.parseInt(getInput());
            System.out.println("Please input your height.");
            h = Integer.parseInt(getInput());
        } catch (Exception e) {
            System.out.println("Error on input.");
        }
        
        SimulationControl3 simulator = new SimulationControl3();
        boolean result = simulator.runSimulation3(l,w,h);
        
        if(result) {
            System.out.println("Correct! You may enter.");
        } else {
            System.out.println("Those inputs do not equal 200.");
        }
        
    }
    
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = " ";
        boolean validInput = false;

        while (!validInput) {
            input = keyboard.nextLine();
            input = input.trim();
            input = input.toUpperCase();

            if (input.length() < 1) {
                System.out.println("\nInvalid value: You must enter a character.");
                continue;
            }
            break;
        }
        return input;
    }
}

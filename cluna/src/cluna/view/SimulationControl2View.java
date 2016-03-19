/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.control.SimulationControl2;
import cluna.exceptions.WinGameException;
import java.util.Scanner;

/**
 *
 * @author lindsayprigmore
 */
/**
 * Problem Statement to Access Locked Cure: A = 82 C = 46 + A A = B + 67
 *
 * Question: B = ? C = ? A+B+C = ?
 */
public class SimulationControl2View {

    public SimulationControl2View() {

    }

    public void display() {
        System.out.println("A = 82"
                + "\n C = 46 + A"
                + "\n A = B + 67"
                + "\n"
                + "\n Question:"
                + "\n B = ?"
                + "\n C = ?"
                + "\n A + B + C = ?");

        int guessB = -1;
        int guessC = -1;
        int guessAnswer = -1;

        try {
            System.out.println("Please input B");
            guessB = Integer.parseInt(getInput());
            System.out.println("Please input C");
            guessC = Integer.parseInt(getInput());
            System.out.println("Please input the answer to A + B + C");
            guessAnswer = Integer.parseInt(getInput());
        } catch (Exception e) {
            System.out.println("Error on input");
        }

        SimulationControl2 simulator = new SimulationControl2();
        boolean result = simulator.runSimulation2(guessB, guessC, guessAnswer);
        
        if(result) {
            System.out.println("B = 15, C = 128, and the answer is 225. The cure has been unlocked.");
            throw new WinGameException();
        } else{
            System.out.println("Incorrect. You may not access the cure.");
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

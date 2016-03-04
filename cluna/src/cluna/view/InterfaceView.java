/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import java.util.Scanner;

/**
 *
 * @author lindsayprigmore
 */
public interface InterfaceView {
    public void display();
    public String getInput();
    public boolean doAction(String value);
    
public abstract class View implements InterfaceView {
        
    protected String displayMessage;
        
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
        }
    @Override
    public void display () {
        
        boolean done = false;
        do{
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
        } while (!done);
        
    }
    
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = " ";
        boolean validInput = false;

        while (!validInput) {
            input = keyboard.nextLine();
            input = input.trim();

            if (input.length() < 1) {
                System.out.println("\nInvalid value: You must enter a character.");
                continue;
            }
            break;
        }
        return input;
    }
    
    


}
    
}

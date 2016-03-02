/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import java.util.Scanner;

/**
 *
 * @author gardensun
 */
// TESTING
public class MainMenuView {
    
    private final String MENU = "\n"
            +"\n-------------------------"
            +"\n| Main Menu             |"
            +"\n|nG - New Game"
            +"\n|nH - Get Help"
            +"\n|nS - Save Game"
            +"\n|nE - Exit"
            +"\n-------------------------";
    
    public void displayMenu(){
        char selection = ' ';
        
        do{
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
                       
        } while (selection != 'E');
    }
    
    private String getInput(){
        Scanner keyboard= new Scanner(System.in);
        String input = " ";
        boolean validInput = false;
        
        while (!validInput) {
            input = keyboard.nextLine();
            input = input.trim();
        
            if(input.length() < 1){
                System.out.println("\nInvalid value: You must enter a character.");
                continue;
            }
            break; 
        }
        return input;
    }
    
    public void doAction(char selection){
        
        switch (selection) {
            case 'G':
//                this.startNewGame();
                break;
            case 'H':
//                this.displayHelpMenu();
                break;
            case 'S':
//                this.saveGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\nInvalid. Try again.");
                break;
        }
    }
}


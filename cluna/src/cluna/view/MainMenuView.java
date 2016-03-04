/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.Cluna;
import cluna.control.GameControl;
import cluna.model.Game;
import java.util.Scanner;

/**
 *
 * @author gardensun
 */
public class MainMenuView extends View {
    
    private final String MENU = "\n"
            +"\n-------------------------"
            +"\n| Main Menu             |"
            +"\n| G - New Game"
            +"\n| H - Get Help"
            +"\n| S - Save Game"
            +"\n| E - Exit"
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
                    this.startNewGame();
                break;
            case 'H':
                    this.displayHelpMenu();
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
    
    private void startNewGame() {
        Game game = GameControl.createGame(Cluna.getPlayer());
        Cluna.setCurrentGame(game);
        
        GameMenuView gm = new GameMenuView();
        gm.displayMenu();
    }
    
    private void displayHelpMenu() {
        System.out.println("TO BE IMPLEMENTED");
    }
}


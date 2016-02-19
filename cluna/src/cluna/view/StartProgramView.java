/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.control.GameControl;
import cluna.model.Player;

/**
 *
 * @author gardensun
 */
public class StartProgramView {
//Banner to show first then prompt message
//
    
    private String promptMessage;
    
    public StartProgramView(){
           this.displayBanner();
           this.promptMessage= "\nThis journal belongs to: ";
           
    }

    public void displayBanner() {
        System.out.println(
             "\n*           Welcome to Cluna.            *"
           + "\n* Cluna is a text-based roleplaying game.*");
    }

    public void displayStartProgramView() {
    }
        
    private String getPlayerName(){
        Scanner keyboard= new Scanner(System.in);
        String playerName = "";
        boolean validName = false;
        
        while (!validName) {
            System.out.println("\n" + this.promptMessage);
        
            playerName = keyboard.nextLine();
            playerName = playerName.trim();
        
            if(playerName.length() < 1){
                System.out.println("\nInvalid value: Your name can't be blank.");
                continue;
            }
            if(playerName.length() < 2){
                System.out.println("\nInvalid value: Your name must be greater than 1 character");
                continue;
            }
            
            break; 
        }
        
        return playerName;
    }
        
    private boolean doAction(String playerName){
        Player player = GameControl.createPlayer(playerName);
        if (player == null) {
               System.out.println("\nError creating player.");
               return false;
        }
        this.displayNextView();
        return true; 
    }
    
    private void displayNextView(){
        System.out.println("\n This is the first entry in the journal"
                            + "\n that belongs to" + player.getName() + "."
                            );
            
    }
    
}
    
 
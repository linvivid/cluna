/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.Cluna;
import cluna.control.GameControl;
import cluna.model.Player;

/**
 *
 * @author gardensun
 */
public class StartProgramView extends View{
//Banner to show first then prompt message
//

    public StartProgramView() {

    }

    public void displayBanner() {
        console.println(
                "\n*                       Welcome to Cluna.                        *"
              + "\n*  In this game, you and your group of explorers are trapped on  *"
              + "\n*  an abandoned planet. After stopping in a desolate town, your  *"
              + "\n* people were struck by a plague. As the scientist, your task is *"
              + "\n* to explore the area and find the materials you need to develop *"
              + "\n*                 a cure in time to save everyone.               *");
        console.println("Please enter your name.");
    }

    public void displayStartProgramView() {
        this.displayBanner();

        String playerName = this.getPlayerName();
        Player p = GameControl.createPlayer(playerName);
        
        displayWelcome(p.getName());
        
        Cluna.setPlayer(p);
        
        MainMenuView mm = new MainMenuView();
        mm.display();
    }

    private void displayWelcome(String name) {
        console.println("Welcome " + name + ", to Cluna\n\n");
    }
    
    private String getPlayerName() {
        String playerName = "";
        boolean validName = false;

        while (!validName) {
            
            try{
                playerName = keyboard.readLine();
            } catch (Exception e){
                ErrorView.display(this.getClass().getName(), "Error reading input.");
            }
            
            playerName = playerName.trim();

            if (playerName.length() < 1) {
                console.println("\nInvalid value: Your name can't be blank.");
                continue;
            }
            if (playerName.length() < 2) {
                console.println("\nInvalid value: Your name must be greater than 1 character");
                continue;
            }

            break;
        }

        return playerName;
    }

}

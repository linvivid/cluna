/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.Cluna;
import cluna.control.GameControl;
import cluna.model.Player;
import java.util.Scanner;

/**
 *
 * @author gardensun
 */
public class StartProgramView {
//Banner to show first then prompt message
//

    public StartProgramView() {

    }

    public void displayBanner() {
        System.out.println(
                "\n*                       Welcome to Cluna.                        *"
              + "\n*  In this game, you and your group of explorers are trapped on  *"
              + "\n*  an abandoned planet. After stopping in a desolate town, your  *"
              + "\n* people were struck by a plague. As the scientist, your task is *"
              + "\n* to explore the area and find the materials you need to develop *"
              + "\n*                 a cure in time to save everyone.               *");
        System.out.println("Please enter your name.");
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
        System.out.println("Welcome " + name + ", to Cluna\n\n");
    }
    
    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in);
        String playerName = "";
        boolean validName = false;

        while (!validName) {
            
            playerName = keyboard.nextLine();
            playerName = playerName.trim();

            if (playerName.length() < 1) {
                System.out.println("\nInvalid value: Your name can't be blank.");
                continue;
            }
            if (playerName.length() < 2) {
                System.out.println("\nInvalid value: Your name must be greater than 1 character");
                continue;
            }

            break;
        }

        return playerName;
    }

}

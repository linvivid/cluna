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
    
    public MainMenuView() {    
        super("\n"
            +"\n-------------------------"
            +"\n| Main Menu             |"
            +"\n| G - New Game"
            +"\n| H - Get Help"
            +"\n| S - Save Game"
            +"\n| E - Exit"
            +"\n-------------------------");
        }

    @Override
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
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
    private void displayHelpMenu() {
        System.out.println("TO BE IMPLEMENTED");
    }
}


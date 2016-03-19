/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.Cluna;
import cluna.control.GameControl;
import cluna.exceptions.LoseGameException;
import cluna.exceptions.WinGameException;
import cluna.model.Game;
import java.util.Scanner;

/**
 *
 * @author gardensun
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n-------------------------"
                + "\n| Main Menu             |"
                + "\n| G - New Game"
                + "\n| H - Get Help"
                + "\n| S - Save Game"
                + "\n| E - Exit"
                + "\n-------------------------");
    }

    @Override
    public boolean doAction(String selection) {

        char charSelection = selection.toUpperCase().charAt(0);

        switch (charSelection) {
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
                return true;
            default:
                System.out.println("\nInvalid. Try again.");
                break;
        }

        return false;
    }

    private void startNewGame() {
        Game game = GameControl.createGame(Cluna.getPlayer());
        Cluna.setCurrentGame(game);
        try {
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        } catch (WinGameException wge) {
            System.out.println("Congrats! You Win!");
        }catch (LoseGameException lge) {
            System.out.println("Loser!");
        }
       
    }

    private void displayHelpMenu() {
        System.out.println("TO BE IMPLEMENTED");
    }
}

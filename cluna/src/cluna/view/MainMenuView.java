/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.Cluna;
import cluna.control.GameControl;
import cluna.exceptions.LoseGameException;
import cluna.exceptions.OffMapException;
import cluna.exceptions.TimeRunsOutException;
import cluna.exceptions.WinGameException;
import cluna.model.Game;

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
                + "\n| L - Load Game"
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
                saveCurrentGame();
                break;
            case 'L':
                loadSavedGame();
                break;
            case 'E':
                return true;
            default:
                console.println("\nInvalid. Try again.");
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
            console.println("Congrats! You Win!");
        }catch (LoseGameException lge) {
            console.println("Loser!");
        }catch (TimeRunsOutException troe){
            console.println("Time ran out! Do you want to start a new game?");
        }catch (OffMapException ome){
            console.println("You went off the Map! Do you want to start a new game?");
        }
       
    }

    private void displayHelpMenu() {
        console.println("TO BE IMPLEMENTED");
    }
    
    private void saveCurrentGame(){
        console.println("Enter file name: ");
        try{
            String fileName = keyboard.readline();
            GameControl.saveGame(fileName);
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(), "Error on input");
        }
    }
    
    private void loadSavedGame(){
        console.println("Enter file name: ");
        try {
            String fileName = keyboard.readLine();
            GameControl.loadGame(fileName);
            GameMenuView gmv = new GameMenuView();
            gmv.display();
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error on input.");
        }
    }
}

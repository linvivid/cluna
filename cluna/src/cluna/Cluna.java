/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna;

import cluna.model.Game;
import cluna.model.Player;
import cluna.view.StartProgramView;

/**
 *
 * @author lindsayprigmore
 */
public class Cluna {

    private static Game currentGame = null;
    private static Player player = null;

    ////MAIN FUNCTION IS HERE
    public static void main(String[] args) {
            StartProgramView startProgramView = new StartProgramView();
        try {
            
            startProgramView.displayStartProgramView();
        } catch (Exception e) {
            e.printStackTrace();
            startProgramView.displayStartProgramView();
                    
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Cluna.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Cluna.player = player;
    }
}

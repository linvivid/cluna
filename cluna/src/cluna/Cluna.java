/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna;

import cluna.model.NPC;
import cluna.model.Game;
import cluna.model.Item;
import cluna.model.LabSceneType;
import cluna.model.Location;
import cluna.model.Map;
import cluna.model.Player;
import cluna.view.StartProgramView;
/**
 *
 * @author lindsayprigmore
 */
public class Cluna {

    private static Game currentGame = null;
    private static Player player = null;
    
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
    
   ////MAIN FUNCTION IS HERE
    public static void main(String[] args) {
     
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView(); 
    }
  
}

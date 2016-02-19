/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.control;

import cluna.Cluna;
import cluna.model.Player;

/**
 *
 * @author lindsayprigmore
 */
public class GameControl {
    public static Player createPlayer(String playerName) {
       if (playerName == null){
           return null;
       }
       
       Player player = new Player();
       player.setName(playerName);
       
       Cluna.setPlayer(player);
       return player;
    }

}

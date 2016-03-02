/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.control;

import cluna.Cluna;
import cluna.model.Game;
import cluna.model.Map;
import cluna.model.Player;
import java.util.ArrayList;

/**
 *
 * @author lindsayprigmore
 */
public class GameControl {

    public static Player createPlayer(String playerName) {
        if (playerName == null) {
            return null;
        }

        Player player = new Player();
        player.setName(playerName);

        Cluna.setPlayer(player);
        return player;
    }
    
    public static Game createGame(Player p) {
        
        Game newGame = new Game();
        
        p.setItems(new ArrayList<>());
        
        newGame.setPlayer(p);
        
        Map gameMap = new Map();
        p.setLocation(gameMap.getLocation(0, 0));
        
        newGame.setMap(gameMap);
        
        return newGame;
    }

}

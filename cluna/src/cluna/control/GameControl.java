/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.control;

import cluna.Cluna;
import cluna.model.Game;
import cluna.model.Item;
import cluna.model.Map;
import cluna.model.Player;
import java.util.ArrayList;
import java.util.List;

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
        
        List<Item> gameItems = createItems();
        
        setupItemLocations(gameMap, gameItems);
        
        newGame.setMap(gameMap);
        
        return newGame;
    }
    
    private static void setupItemLocations(Map map, List<Item> items) {
        
        //TODO randomize item locations
        map.getLocation(0, 1).setItem(items.get(0));
        
    }
    
    private static List<Item> createItems() {
        
        List<Item> items = new ArrayList<>();
        
        //TODO Repeat this a lot
        Item petriDish = new Item();
        petriDish.setName("Petri Dish");
        items.add(petriDish);
        
        //end repeat section
        
        return items;
    }

}

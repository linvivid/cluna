/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.control;

import cluna.Cluna;
import cluna.model.Game;
import cluna.model.Item;
import cluna.model.Location;
import cluna.model.Map;
import cluna.model.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        
        for (Item thing: items){
            boolean placed = false;
            while(placed==false){
                Random r = new Random();
                int row = r.nextInt(Map.NUM_ROWS);
                int col = r.nextInt(Map.NUM_COLS);
                Location l = map.getLocation(row, col);
                
                if (l.getItem()==null){
                    l.setItem(thing);
                    placed = true;
                }
            }
        }
    }
    
    private static List<Item> createItems() {
        
        List<Item> items = new ArrayList<>();
        
        //list
        Item petriDish = new Item();
        petriDish.setName("Petri Dish1");
        items.add(petriDish);
        
        Item petriDish2 = new Item();
        petriDish2.setName("Petri Dish2");
        items.add(petriDish2);
        
        Item petriDish3 = new Item();
        petriDish3.setName("Petri Dish3");
        items.add(petriDish3);
        
        Item glassBeaker = new Item();
        glassBeaker.setName("Glass Beaker");
        items.add(glassBeaker);
        
        Item testTube = new Item();
        testTube.setName("Test Tube1");
        items.add(testTube);
        
        Item eyeDropper = new Item();
        eyeDropper.setName("Eye Dropper");
        items.add(eyeDropper);
        
        Item beakerTongs = new Item();
        beakerTongs.setName("Beaker Tongs");
        items.add(beakerTongs);

        Item testTube2 = new Item();
        testTube2.setName("Test Tube2");
        items.add(testTube2);
        
        Item testTube3 = new Item();
        testTube3.setName("Test Tube3");
        items.add(testTube3);
        
        Item glassFunnel = new Item();
        glassFunnel.setName("Glass Funnel");
        items.add(glassFunnel);

        Item testTubeHolder = new Item();
        testTubeHolder.setName("Test Tube Holder");
        items.add(testTubeHolder);
        
        Item testTubeRack = new Item();
        testTubeRack.setName("Test Tube Rack");
        items.add(testTubeRack);
        
        Item safetyGoggles = new Item();
        safetyGoggles.setName("Safety Goggles");
        items.add(safetyGoggles);
        
//end repeat section
        
        return items;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.control;

import cluna.model.Location;
import cluna.model.Map;
import cluna.model.Player;

/**
 *
 * @author lindsayprigmore
 */
public class LocationControl {

    public static boolean setLocation(char movement, Player player, Map map) {
        
        Location location = player.getLocation();
        int row = location.getRow();
        int col = location.getCol();
        Location newLocation = null;

        try {
            switch (movement) {
                case 'N':
                    newLocation = map.getLocation(row - 1, col);
                    break;
                case 'E':
                    newLocation = map.getLocation(row, col + 1);
                    break;
                case 'S':
                    newLocation = map.getLocation(row + 1, col);
                    break;
                case 'W':
                    newLocation = map.getLocation(row, col - 1);
                    break;
            }

        } catch (Exception e) {
            return false;
        }
        
        player.setLocation(newLocation);
        return true;
        
    }

}


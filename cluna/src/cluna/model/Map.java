/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.model;

import java.io.Serializable;

/**
 *
 * @author lindsayprigmore
 */
public class Map implements Serializable {

    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 5;
    private Location[][] locations;

    public Map() {
        locations = new Location[NUM_ROWS][NUM_COLS];
        init();
    }

    public void init() {

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                Location l = new Location();
                int locationTypeIndex = (int) (Math.random() * LocationEnum.values().length);
                l.setName(LocationEnum.values()[locationTypeIndex].toString());
                l.setDescription(LocationEnum.values()[locationTypeIndex].toString());
                locations[row][col] = l;
            }
        }
    }

    public Location getLocation(int row, int col) {
        return locations[row][col];
    }

    public String getMapDisplay() {
        String rtn = "";

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                rtn += locations[row][col].getName().charAt(0) + "  ";
            }
            rtn += "\n";
        }

        return rtn;
    }

}

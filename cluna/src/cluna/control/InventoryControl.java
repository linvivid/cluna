/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.control;
import cluna.Cluna;
import cluna.control.LocationControl;
import cluna.model.Location;


/**
 *
 * @author lindsayprigmore
 */
public class InventoryControl {
 
    //TODO methods that move the item from location to player
    public boolean moveItem(){
        Location currentLocation = Cluna.getPlayer().getLocation();
        Cluna.getPlayer().addItem(currentLocation.getItem());
        currentLocation.setItem(null);
        if (currentLocation.getItem()==null){
            return true;
        } else {
            return false;
        }
    }
    
}

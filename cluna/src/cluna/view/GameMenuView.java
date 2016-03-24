/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.Cluna;
import cluna.control.LocationControl;
import cluna.model.Location;
import cluna.control.InventoryControl;

/**
 *
 * @author gardensun
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n-------------------------"
                + "\n| Game Menu             |"
                + "\n| M - View Map"
                + "\n| I - Search for Items"
                + "\n| N - Move North"
                + "\n| E - Move East"
                + "\n| S - Move South"
                + "\n| W - Move West"
                + "\n| V - View Inventory"
                + "\n| R - Run Cure Simulation"
                + "\n| Q - Quit to Main Menu"
                + "\n-------------------------");
    }

    @Override
    public boolean doAction(String selection) {

        char charSelection = selection.toUpperCase().charAt(0);

        switch (charSelection) {
            case 'I':
                searchItems();
                break;
            case 'N':
                if (!LocationControl.setLocation('N', Cluna.getPlayer(), Cluna.getCurrentGame().getMap())) {
                    System.out.println("You cannot move there");
                }
                break;
            case 'E':
                if (!LocationControl.setLocation('E', Cluna.getPlayer(), Cluna.getCurrentGame().getMap())) {
                    System.out.println("You cannot move there");
                }
                break;
            case 'S':
                if (!LocationControl.setLocation('S', Cluna.getPlayer(), Cluna.getCurrentGame().getMap())) {
                    System.out.println("You cannot move there");
                }
                break;
            case 'W':
                if (!LocationControl.setLocation('W', Cluna.getPlayer(), Cluna.getCurrentGame().getMap())) {
                    System.out.println("You cannot move there");
                }
                break;
            case 'R':
                runSimulation();
                break;
            case 'M':
                System.out.println(Cluna.getCurrentGame().getMap().getMapDisplay());
                break;
            case 'Q':
                return true;
            case 'V':
                //show inventory and add view
                break;
            default:
                System.out.println("\nInvalid. Try again.");
                break;
        }

        return false;
    }

    private void runSimulation() {
        SimulationControl2View sim2 = new SimulationControl2View();
        sim2.display();
    }
    
    private void moveItem(){
        InventoryControl ic = new InventoryControl();
        ic.moveItem();
    }

    private void searchItems() {

        //TODO actually move the item from the location to the player
        //DONE-  just check by setting up inventory view!
        Location currentLocation = Cluna.getPlayer().getLocation();

        if (currentLocation.getItem() == null) {
            System.out.println("You find nothing");
        } else {
            System.out.println("You found a " + currentLocation.getItem().getName());
            moveItem();
        }

    }

}

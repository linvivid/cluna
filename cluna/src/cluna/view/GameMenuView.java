/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.Cluna;
import cluna.model.Location;

/**
 *
 * @author gardensun
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n-------------------------"
                + "\n| Game Menu             |"
                + "\n| V - View Map"
                + "\n| I - Search for Items"
                + "\n| N - Move North"
                + "\n| E - Move East"
                + "\n| S - Move South"
                + "\n| W - Move West"
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

                break;
            case 'E':

                break;
            case 'S':

                break;
            case 'W':

                break;
            case 'R':
                runSimulation();
                break;
            case 'V':
                System.out.println(Cluna.getCurrentGame().getMap().getMapDisplay());
                break;
            case 'Q':
                return true;
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
    
    private void searchItems() {

        //TODO actually move the item from the location to the player
        //DO THIS LOGIC IN INVENTORYCONTROL
        Location currentLocation = Cluna.getPlayer().getLocation();

        if (currentLocation.getItem() == null) {
            System.out.println("You find nothing");
        } else {
            System.out.println("You found a " + currentLocation.getItem().getName());
        }

    }

}

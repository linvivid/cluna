/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.Cluna;
import java.util.Scanner;

/**
 *
 * @author gardensun
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super ("\n"
            + "\n-------------------------"
            + "\n| Game Menu             |"
            + "\n| C - Synthesize Cure"
            + "\n| V - View Map"
            + "\n| I - Search for Items"
            + "\n| N - Move North"
            + "\n| E - Move East"
            + "\n| S - Move South"
            + "\n| W - Move West"
            + "\n| Q - Quit to Main Menu"
            + "\n-------------------------");
    }    
    
    @Override
    public void doAction(char selection) {

        switch (selection) {
            case 'C':

                break;
            case 'I':

                break;
            case 'N':

                break;
            case 'E':

                break;
            case 'S':

                break;
            case 'W':

                break;
            case 'V':
                System.out.println(Cluna.getCurrentGame().getMap().getMapDisplay());
                break;
            case 'Q':
                break;
            default:
                System.out.println("\nInvalid. Try again.");
                break;
        }
    }

}

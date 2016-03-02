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
public class GameMenuView {

    private final String MENU = "\n"
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
            + "\n-------------------------";

    public void displayMenu() {
        char selection = ' ';

        do {
            System.out.println(MENU);

            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);

        } while (selection != 'Q');
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = " ";
        boolean validInput = false;

        while (!validInput) {
            input = keyboard.nextLine();
            input = input.trim();

            if (input.length() < 1) {
                System.out.println("\nInvalid value: You must enter a character.");
                continue;
            }
            break;
        }
        return input;
    }

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

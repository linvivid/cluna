/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.Cluna;
import java.io.PrintWriter;
import java.io.BufferedReader;

public abstract class View implements ViewInterface {

        protected String displayMessage;
        protected final PrintWriter console = Cluna.getOutFile();
        protected final BufferedReader keyboard = Cluna.getInFile();

        public View() {
        }

        public View(String message) {
            this.displayMessage = message;
        }

        @Override
        public void display() {

            boolean done = false;
            do {
                //prompt for and get players name
                String value = this.getInput();
                if (value.toUpperCase().equals("Q")) {
                    return;
                }

                done = this.doAction(value);
            } while (!done);

        }

        @Override
        public String getInput() {
            String input = " ";
            boolean validInput = false;

            while (!validInput) {
                console.println("\n" + this.displayMessage);
                
                try{
                    input = keyboard.readLine();
                } catch (Exception e){
                    ErrorView.display(this.getClass().getName(), "Error reading input.");
                }
                    
                input = input.trim();
                input = input.toUpperCase();

                if (input.length() < 1) {
                    console.println("\nInvalid value: You must enter a character.");
                    continue;
                }
                break;
            }
            return input;
        }

    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import cluna.model.Game;
import cluna.model.Player;
import cluna.view.StartProgramView;

/**
 *
 * @author lindsayprigmore
 */
public class Cluna {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile;
    private static BufferedReader inFile;
    
    private static PrintWriter logFile;
    
    

    ////MAIN FUNCTION IS HERE
    public static void main(String[] args) {
        try {
            inFile = new BufferedReader(new InputStreamReader(System.in));
            outFile = new PrintWriter(System.out, true);
            String logPath = "log.txt";
            logFile = new PrintWriter(logPath);
            
            StartProgramView startProgramView = new StartProgramView();
            
            startProgramView.displayStartProgramView();
        } catch (Exception e) {
            e.printStackTrace();
            // what is our equivalent for this??
            startProgramView.displayStartProgramView();
        }
        finally {
            try{
                if(inFile != null){
                    inFile.close();
                }
                if (outFile != null){
                    outFile.close();
                }
                if(logFile != null) {
                    logFile.close();
                }
            } catch(Exception ex){
                System.out.println("Error closing files");
            }
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Cluna.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Cluna.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Cluna.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Cluna.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Cluna.logFile = logFile;
    }
    
}

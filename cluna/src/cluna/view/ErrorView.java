/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import java.io.PrintWriter;
import cluna.Cluna;

/**
 *
 * @author gardensun
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Cluna.getOutFile();
    private static final PrintWriter logFile = Cluna.getLogFile();
    
    public static void display(String className, String errorMsg){
        errorFile.println("------\nERROR " + errorMsg + " ------");
        logFile.println(className + "- " + errorMsg);
    }
    
}

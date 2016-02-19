/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna;

import cluna.model.NPC;
import cluna.model.Game;
import cluna.model.Item;
import cluna.model.LabSceneType;
import cluna.model.Location;
import cluna.model.Map;
import cluna.model.Player;
/**
 *
 * @author lindsayprigmore
 */
public class Cluna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     /**
     * NPC
     */ 
        NPC lux = new NPC();
        lux.setName("Lux");
        lux.setDescription("Best Friend");
        
        String luxInfo = lux.toString();
        System.out.println(luxInfo);
        
     /**
     * Game
     */ 
        Game time = new Game();
        //time.setTotalTime("totaltime");
        
        String timeInfo = time.toString();
        System.out.println(timeInfo);        
   
    
    /**
     * Item
     */ 
        Item cure = new Item();
        cure.setName("Cure");
       
        
        String cureInfo = cure.toString();
        System.out.println(cureInfo);
    
        
    /**
     * LabSceneType
     */ 
            LabSceneType lab = new LabSceneType();
            lab.setDescription("First Laboratory");
            
            String labInfo = lab.toString();
            System.out.println(labInfo);
        
    }
  
}

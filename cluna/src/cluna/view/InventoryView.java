/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.view;

import cluna.Cluna;
import cluna.model.Item;
import java.util.List;

/**
 *
 * @author gardensun
 */
public class InventoryView extends View{
    
    public InventoryView(){
        String view = createInventoryView();
        System.out.println(view);
    }
    
    private String createInventoryView(){
        List<Item> items = Cluna.getPlayer().getItems();
        int upperBound = items.lastIndexOf(items);
        String view = "-----Iventory-----";
        for (int count = 0; count <= Cluna.getPlayer().getItems().lastIndexOf(0); count++){
            view += "\n- " + Cluna.getPlayer().getItems().get(count).getName();
        }
        return view;
    }
}

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
public class InventoryView {
    
    public InventoryView(){
    }
    
    public String createInventoryView(){
        List<Item> items = Cluna.getPlayer().getItems();
        String view = "-----Iventory-----";
        for (int count = 0; count < items.size(); count++){
            view += "\n- " + items.get(count).getName();
        }
        return view;
    }
}

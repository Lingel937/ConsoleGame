package Characters;
import Items.*;
import lib.Lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class Inventory  {
    //declare an Array
    private  ArrayList<Item> inventory;
    private  Item NULLITEM = new Item(0,null,null,null,0,0.0,0.0,0,0,0);
    public Inventory(){
        //initialize the object array
        inventory = new ArrayList<Item>();
    }

    //function to return the number of items in the inventory
    public int getNumberOfItems(){
        int numOfItems = inventory.size();
        return numOfItems;
    }
    //a function to remove all items
    public void removeAllItems(){
       inventory.clear();
    }

    //function to sort your inventory
    private int upperLimit(){
        return inventory.size();
    }
    public void sortInventory(){

        for(int i = 0; i < inventory.size(); i++){
            for(int k = i+1; k < inventory.size(); k++){

                if(
                    inventory.get(i).getName() == inventory.get(k).getName() &&
                    inventory.get(i).getID() == inventory.get(k).getID() &&
                    inventory.get(i).getLvl() == inventory.get(k).getLvl() &&
                    inventory.get(i).getType() == inventory.get(k).getType() &&
                    inventory.get(i).getCategory() == inventory.get(k).getCategory() &&
                    inventory.get(i).getDamage() == inventory.get(k).getDamage() &&
                    inventory.get(i).getDamageFactor() == inventory.get(k).getDamageFactor()
                ){
                    inventory.get(i).setNumberOfItems(inventory.get(k).getNumberOfItems()+ inventory.get(i).getNumberOfItems());
                    inventory.set(k,NULLITEM);
                }
            }
            if (inventory.get(i).getNumberOfItems() == 0){
                inventory.set(i,NULLITEM);
            }
        }
        boolean b_status = true;
        int n_item = 0;
        while(b_status){
            if(n_item >= upperLimit()){
                b_status = false;
            }else{
                if(inventory.get(n_item) == NULLITEM){
                    inventory.remove(n_item);
                }
                n_item++;
            }
        }
    }

    //function to show your inventory
    public void showInventoryContent(){
        String filler = " | ";
        Integer[][] length;
        int[] maxLength;
        
        if(inventory.size()==0){
            System.out.println("Your inventory is empty!!!");
        }
        else{
            length = new Integer [6][inventory.size()];
            maxLength = new int[6];
            for(int i = 0; i < inventory.size(); i++){
                length[0][i] = inventory.get(i).getName().length();
                length[1][i] = inventory.get(i).getType().length();
                length[2][i] = inventory.get(i).getCategory().length();
                length[3][i] = Integer.toString(inventory.get(i).getLvl()).length();
                length[4][i] = Integer.toString(inventory.get(i).getNumberOfItems()).length();
                length[5][i] = Double.toString(inventory.get(i).getDamage()).length();
            }
            for(int i = 0; i < 6; i++){
                maxLength[i] = Collections.max(Arrays.asList(length[i]));
            }
            System.out.println("\nThis is your inventory:\nName | Type | Category | Level | Item Count | Damage");
            System.out.println(Lib.addCharToString(
                1,
                filler.length()*6+
                                maxLength[0]+
                                maxLength[1]+
                                maxLength[2]+
                                maxLength[3]+
                                maxLength[4]+
                                maxLength[5],
                "",
                "-")
            );    
            for(int o = 0; o < inventory.size(); o++){
                System.out.println(
                    Lib.addCharToString(1, maxLength[0]-length[0][o], inventory.get(o).getName(), "_")+filler+
                    Lib.addCharToString(1, maxLength[1]-length[1][o], inventory.get(o).getType(), "_")+filler+
                    Lib.addCharToString(1, maxLength[2]-length[2][o], inventory.get(o).getCategory(), "_")+filler+
                    Lib.addCharToString(1, maxLength[3]-length[3][o], Integer.toString(inventory.get(o).getLvl()),"_")+filler+
                    Lib.addCharToString(1, maxLength[4]-length[4][o], Integer.toString(inventory.get(o).getNumberOfItems()),"_")+filler+
                    Lib.addCharToString(1, maxLength[5]-length[5][o], Double.toString(inventory.get(o).getDamage()),"_")+filler
                );
            }
            System.out.println("");
        }
        maxLength = null;
        length = null;
    }
    public ArrayList<Item> getInventory(){
        return inventory;
    }
    public void setInventory(ArrayList<Item> inventory){
        this.inventory = inventory;
    }
    public void addItem(Item item){
        inventory.add(item);
    }
}

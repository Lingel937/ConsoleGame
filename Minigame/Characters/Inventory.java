package Characters;
import Items.*;
import java.util.ArrayList;
public class Inventory  {
    //declare an Array
    private  ArrayList<Item> inventory;

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
    public void sortInventory(){
        for(int i = 0; i < inventory.size(); i++){
            for(int k = i; k < inventory.size(); k++){
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
                    inventory.remove(k);
                }
            }
            if (inventory.get(i).getNumberOfItems() == 0){
                inventory.remove(i);
            }
        }
    }

    //function to show your inventory
    public void showInventoryContent(){
        String filler = " | ";
        
        if(inventory.size()==0){
            System.out.println("Your inventory is empty!!!");
        }
        else{
            //sortInventory();
            System.out.println("\nThis is your inventory:\nName | Type | Category | Level | Item Count | Damage\n----------------------------------------------------------------------------");    
            for(int o = 0; o < inventory.size(); o++){
                System.out.println(
                    inventory.get(o).getName()+filler+
                    inventory.get(o).getType()+filler+
                    inventory.get(o).getCategory()+filler+
                    inventory.get(o).getLvl()+filler+
                    inventory.get(o).getNumberOfItems()+filler+
                    inventory.get(o).getDamage()+filler
                );
            }
            
        }
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

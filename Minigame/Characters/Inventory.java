package Characters;
import Items.*;
import java.util.ArrayList;
public class Inventory  {
    //declare an Array
    private  ArrayList<Item> m_itemObjectArray_Inventory;
    private Item NULLITEM = new Item(0,null,null,null,0,0.0,0.0,0,0,0);

    public Inventory(){
        //initialize the object array
        m_itemObjectArray_Inventory = new ArrayList<Item>();
    }

    //function to return the number of items in the inventory
    public int getNumberOfItems(){
        int numOfItems = m_itemObjectArray_Inventory.size();
        return numOfItems;
    }
    //a function to remove all items
    public void removeAllItems(){
       m_itemObjectArray_Inventory.clear();
    }

    //function to sort your inventory
    public void sortInventory(){
        for(int i = 0; i < m_itemObjectArray_Inventory.size();i++){
            for(int k = i; k < m_itemObjectArray_Inventory.size();k++){
                if(
                    m_itemObjectArray_Inventory.get(i).getName() == m_itemObjectArray_Inventory.get(k).getName() &&
                    m_itemObjectArray_Inventory.get(i).getID() == m_itemObjectArray_Inventory.get(k).getID() &&
                    m_itemObjectArray_Inventory.get(i).getLvl() == m_itemObjectArray_Inventory.get(k).getLvl() &&
                    m_itemObjectArray_Inventory.get(i).getType() == m_itemObjectArray_Inventory.get(k).getType() &&
                    m_itemObjectArray_Inventory.get(i).getCategory() == m_itemObjectArray_Inventory.get(k).getCategory() &&
                    m_itemObjectArray_Inventory.get(i).getDamage() == m_itemObjectArray_Inventory.get(k).getDamage() &&
                    m_itemObjectArray_Inventory.get(i).getDamageFactor() == m_itemObjectArray_Inventory.get(k).getDamageFactor()
                ){
                    m_itemObjectArray_Inventory.get(i).setNumberOfItems(m_itemObjectArray_Inventory.get(k).getNumberOfItems()+m_itemObjectArray_Inventory.get(i).getNumberOfItems());
                    m_itemObjectArray_Inventory.remove(k);
                }
            }
            if (m_itemObjectArray_Inventory.get(i).getNumberOfItems() == 0){
                m_itemObjectArray_Inventory.set(k,NULLITEM);
            }
        }
    }

    //function to show your inventory
    public void showInventoryContent(){
        String filler = " | ";
        
        if(m_itemObjectArray_Inventory.size()==0){
            System.out.println("Your inventory is empty!!!");
        }
        else{
            //sortInventory();
            System.out.println("\nThis is your inventory:\nName | Type | Category | Level | Item Count | Damage\n----------------------------------------------------------------------------");    
            for(int o = 0; o < m_itemObjectArray_Inventory.size(); o++){
                System.out.println(
                    m_itemObjectArray_Inventory.get(o).getName()+filler+
                    m_itemObjectArray_Inventory.get(o).getType()+filler+
                    m_itemObjectArray_Inventory.get(o).getCategory()+filler+
                    m_itemObjectArray_Inventory.get(o).getLvl()+filler+
                    m_itemObjectArray_Inventory.get(o).getNumberOfItems()+filler+
                    m_itemObjectArray_Inventory.get(o).getDamage()+filler
                );
            }
            
        }
    }
    public ArrayList<Item> getInventory(){
        return m_itemObjectArray_Inventory;
    }
    public void setInventory(ArrayList<Item> inventory){
        m_itemObjectArray_Inventory = inventory;
    }
    public void addItem(Item item){
        m_itemObjectArray_Inventory.add(item);  
    }
}

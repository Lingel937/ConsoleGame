package Characters;
import Items.*;
import java.util.ArrayList;
public class Inventory  {
    //declare an Array
    public static ArrayList<Item> m_itemObjectArray_Inventory;

    public Inventory(){
        //initialize the object array
        m_itemObjectArray_Inventory = new ArrayList<Item>();
    }

    //function to return the number of items in the inventory
    public int numberOfItems(){
        int numOfItems = m_itemObjectArray_Inventory.size();
        return numOfItems;
    }
    //a function to remove all items
    public void removeAllItems(){
       m_itemObjectArray_Inventory.clear();
    }

    //function to sort your inventory
    public void sortInventory(){
        for(int i = 0; i <= m_itemObjectArray_Inventory.size()-1;i++){
            for(int k = i; k<= m_itemObjectArray_Inventory.size()-1;k++){
                if(
                    m_itemObjectArray_Inventory.get(i).getName() == m_itemObjectArray_Inventory.get(k).getName() &&
                    m_itemObjectArray_Inventory.get(i).getID() == m_itemObjectArray_Inventory.get(k).getID() &&
                    m_itemObjectArray_Inventory.get(i).getLvl() == m_itemObjectArray_Inventory.get(k).getLvl() &&
                    m_itemObjectArray_Inventory.get(i).getType() == m_itemObjectArray_Inventory.get(k).getType() &&
                    m_itemObjectArray_Inventory.get(i).getCategory() == m_itemObjectArray_Inventory.get(k).getCategory() &&
                    m_itemObjectArray_Inventory.get(i).getDamage() == m_itemObjectArray_Inventory.get(k).getDamage() &&
                    m_itemObjectArray_Inventory.get(i).getDamageFactor() == m_itemObjectArray_Inventory.get(k).getDamageFactor() &&
                    m_itemObjectArray_Inventory.get(i).getRange() == m_itemObjectArray_Inventory.get(k).getRange() &&
                    m_itemObjectArray_Inventory.get(i).getRangeFactor() == m_itemObjectArray_Inventory.get(k).getRangeFactor() &&
                    m_itemObjectArray_Inventory.get(i).getRarity() == m_itemObjectArray_Inventory.get(k).getRarity()
                ){
                    m_itemObjectArray_Inventory.get(i).setNumberOfItems(m_itemObjectArray_Inventory.get(k).getNumberOfItems()+1);
                    m_itemObjectArray_Inventory.remove(k);
                }
            }
        }
    }

    //function to show your inventory
    public void showInventory(){
        System.out.println("\nThis is your inventory:\nName | Type | Category | Level | Item Count | ");
        for(int o = 0; o <= m_itemObjectArray_Inventory.size(); o++){


        }
    }
}

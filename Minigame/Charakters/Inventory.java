package Charakters;
import Items.*;
import java.util.ArrayList;
public class Inventory  {
    //declare an Array
    public ArrayList<Item> m_itemObjectArray_Inventory;

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
}

import Items.*;
import java.util.ArrayList;
public class Inventory  {
    //declare an Array
    private ArrayList<Item> m_itemOA_Inventory;

    public Inventory(){
        //initialize the object array
        m_itemOA_Inventory = new ArrayList<Item>();
    }

    //function to return the number of items in the inventory
    public int numberOfItems(){
        int numOfItems = m_itemOA_Inventory.size();
        return numOfItems;
    }
    //a function to remove all items
    public void removeAllItems(){
       m_itemOA_Inventory.clear();
    }
}

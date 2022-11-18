import Items.*;
import java.util.ArrayList;
*public class Inventory  {
    private ArrayList<Food> m_fOA_foodList;
    private ArrayList<Ressources>m_rOA_ressourcesList;
    private ArrayList<Weapon> m_wOA_weaponList;

    public Inventory(){
        m_rOA_ressourcesList = new ArrayList<Ressources>();
        m_fOA_foodList = new ArrayList<Food>();
        m_wOA_weaponList = new ArrayList<Weapon>();
    }

    public int numberOfObjects(){
        int numOfItems = m_fOA_foodList.size()+m_rOA_ressourcesList.size()+m_wOA_weaponList.size();
        return numOfItems;
    }
    public void removeAllItems(){
        m_fOA_foodList.clear();
        m_rOA_ressourcesList.clear();
        m_wOA_weaponList.clear();
    }
}

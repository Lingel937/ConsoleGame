
/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1

    Description:

      Superclass of all items
*/
package Items;
public class Item {
    //membervariables for an item
    public String m_sItemName;
    public String m_sItemType;
    public int m_nItemLevel;
    public int m_nItemID;
    public String m_sCategory;    
    public String m_sRarity;
    public int m_nNumberOfItems;

    //membervariables for weapons:
    public double m_dDamageFactor;
    public double m_dDamage;
    public double m_dRange;
    public double m_dRangeFactor;
    
    //membervariables for the food
    public int m_nNutritionalValue;

    //constructor to get all
    public Item(
        int nID ,
        String sName, 
        String sType, 
        String sCategory, 
        int nLevel, 
        String sRarity, 
        double dDamage, 
        double dRange, 
        double dDamageFactor, 
        double dRangeFactor, 
        int nNutritionalValue,
        int nNumberOfItems
        ){
        //initialize variables
        m_nItemID = nID;
        m_sItemType = sType;
        m_sItemName = sName;
        m_nItemLevel = nLevel;
        m_sCategory = sCategory;
        m_dDamageFactor = dDamageFactor;
        m_dDamage = dDamage;
        m_dRangeFactor = dRangeFactor;
        m_dRange = dRange;
        m_nNutritionalValue = nNutritionalValue;
        m_sRarity = sRarity;
        m_nNumberOfItems =nNumberOfItems;

    }

    public void LevelUp() {
        m_nItemLevel++;
    }
    
    public int getItemID(){
        return m_nItemID;
    }

    public String getItemType() {
        return m_sItemType;
    }

    public String getName(){
        return m_sItemName;
    }
    
    public int getLvl(){
        return m_nItemLevel;
    }

    public String getCategory(){
        return m_sCategory;
    }

    public double getDamage(){
        return m_dDamage;
    }

    public double getDamageFactor(){
        return m_dDamageFactor;
    }

    public double getRange(){
        return 
    }
}


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
    private String m_sItemName;
    private String m_sItemType;
    private int m_nItemLevel;
    private int m_nItemID;
    private String m_sCategory;    
    private String m_sRarity;
    private int m_nNumberOfItems;

    //membervariables for weapons:
    private double m_dDamageFactor;
    private double m_dDamage;
    
    //membervariables for the food
    public int m_nNutritionalValue;

    //constructor to get all
    public Item(
        int nID ,
        String sName, 
        String sType, 
        String sCategory, 
        int nLevel,
        double dDamage,
        double dDamageFactor,
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
        m_nNutritionalValue = nNutritionalValue;
        m_nNumberOfItems =nNumberOfItems;

    }
    
    //list of getters for an item object

    public void LevelUp() {
        m_nItemLevel++;
    }

    public int getID(){
        return m_nItemID;
    }

    public String getName(){
        return m_sItemName;
    }

    public String getType(){
        return m_sItemType;
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

    public int getNumberOfItems(){
        return m_nNumberOfItems;
    }

    public double getNutritonalValue(){
        return m_nNutritionalValue;
    }


    //list of setters for item objects
    public void setName(String sName){
        m_sItemName = sName;
    }

    public void setLvl(int nLevel){
        m_nItemLevel = nLevel;
    }
    
    public void setDamage(double dDamage){
        m_dDamage = dDamage;
    }
    
    public void setDamageFactor(double dDamageFactor){
        m_dDamageFactor = dDamageFactor;
    }
    
    public void setRarity(String sRarity) {
        m_sRarity = sRarity;
    }

    public void setNumberOfItems(int nNumberOfItems){
        m_nNumberOfItems = nNumberOfItems;
    }

}

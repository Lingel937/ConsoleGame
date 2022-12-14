
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
    private double m_dRange;
    private double m_dRangeFactor;
    
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

    public double getRange() {
        return m_dRange;
    }

    public double getRangeFactor() {
        return m_dRangeFactor;
    }

    public int getNumberOfItems(){
        return m_nNumberOfItems;
    }

    public double getNutritonalValue(){
        return m_nNutritionalValue;
    }

    public String getRarity(){
        return m_sRarity;
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

    public void setRange(double dRange){
        m_dRange = dRange;
    }    

    public void setRangFactor(double dRangeFactor){
        m_dRangeFactor = dRangeFactor;
    }
    
    public void setRarity(String sRarity) {
        m_sRarity = sRarity;
    }

    public void setNumberOfItems(int nNumberOfItems){
        m_nNumberOfItems = nNumberOfItems;
    }

}

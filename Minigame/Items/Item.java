
/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1

    Description:

      Superclass of all items
      this class doesnt contain a lot but it inherits to every item
*/

package Items;

public class Item {
    protected String m_sItemName;
    protected String m_sItemType;
    protected int m_nItemLevel;
    protected int m_nItemID;
    private double m_dDamageFactor;
    private double m_dDamage;
    private double m_dRange;
    private double m_dRangeFactor;
    private int m_nNutritionalValue;
    private String m_sCategory;    
    private String m_sRarity

    public Item(String sName, String sType, String sCategory, int nLevel, String sRarity, double dDamage, double dRange, double dDamageFactor, double dRangeFactor, int nNutritionalValue){
     
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
    }

    public void LevelUp() {
        m_nItemLevel++;
    }



}
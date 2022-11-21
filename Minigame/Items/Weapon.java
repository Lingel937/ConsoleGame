
/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1

    Description:
      Weapon is a sub class of item
*/

package Items;

public class Weapon extends Item {

    private double m_dDamageFactor;
    private double m_dDamage;
    private double m_dRange;
    private double m_dRangeFactor;

    public Weapon(String sName, int nLevel, double dDamage, double dRange, double dDamageFactor, double dRangeFactor) {
        m_sItemType = "Weapon";
        m_sItemName = sName;
        m_nItemLevel = nLevel;
        m_dDamageFactor = dDamageFactor;
        m_dDamage = dDamage;
        m_dRangeFactor = dRangeFactor;
        m_dRange = dRange;
    }

    public void print() {
        System.out.println("Name: " + m_sItemName);
        System.out.println("Type: " + m_sItemType);
        System.out.println("Level: " + m_nItemLevel);
        System.out.println("Damage: " + m_dDamage);
        System.out.println("Damage Factor: " + m_dDamageFactor);
    }
}


/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1

    Description:
      Weapon is a sub class of item
*/

package Items;

public class Weapon extends Item {

    private double m_nDamageFactor;
    private double m_nDamage;

    public Weapon(String sName, int nLevel, int nDamage, int nRange, int nDamageFactor, int nRangeFactor) {
        m_sItemType = "Weapon";
        m_sItemName = sName;
        m_nItemLevel = nLevel;
        m_nDamageFactor = nDamageFactor;
        m_nDamage = nDamage;
    }

    public void print() {
        System.out.println("Name: " + m_sItemName);
        System.out.println("Type: " + m_sItemType);
        System.out.println("Level: " + m_nItemLevel);
        System.out.println("Damage: " + m_nDamage);
        System.out.println("Damage Factor: " + m_nDamageFactor);
    }
}

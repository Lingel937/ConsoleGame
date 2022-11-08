package Charakters;
import Items.*;
import Charakters.Inventory;
/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1
*/
 /*Character class to store important values related to the character*/

public class PlayerCharakter {
    private String m_sPlayerName;
    private int m_nMaxHealth;
    private int m_nLevel;
    private String m_sCharakterType;
    private int m_nHealth;
    private int m_nSizeInventory;

  
  
    public PlayerCharakter(String sName, int nMaxHealth, String nType) {
        m_sPlayerName = sName;
        m_nMaxHealth = nMaxHealth;
        m_nLevel = 1;
        m_sCharakterType = nType;

         
        

        System.out.println("Your Name: " + m_sPlayerName);
        System.out.println("Your Class: " + m_sCharakterType);

    }

    public void changeHealth(int nHealthdifference) {
        m_nHealth = m_nHealth-nHealthdifference;
        System.out.println("You just lost"+m_nHealth+"HP");


    }
}

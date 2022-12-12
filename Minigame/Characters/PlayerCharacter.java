package Characters;
import java.util.ArrayList;
import java.math.*;
import Items.*;


/*
    Author:                  Valentin Lingelbach (@Lingel)
    Version added:           WIP_0.1.0
    Last Update in Version:  WIP_0.1
*/
 /*Character class to store important values related to the character*/
import Items.Item;

public class PlayerCharacter {
    private String m_sPlayerName;       //name of the Character. @Lingel937
    private int m_nMaxHealth;           //maximum of hp your character can reach. @Lingel937
    private int m_nLevel;               //level of the character @Lingel937
    private String m_sCharacterType;    //type of the Character(e.g. Elve, Dwarf ect..) @Lingel
    private int m_nHealth;              //Current health of the character @Lingel937
    private ArrayList<Item> m_itemObjectArray_Inventory; //object array of the class item to store your inventory @maulie5
    private int m_nInventorySize; //variable to store the size of the inventory @maulie5
    private int  m_nExperiencePoints;
    private int m_nMoney;
  
    public void checkLevelUp(){
        if(m_nExperiencePoints >= m_nLevel*10){
            m_nLevel++;
            m_nExperiencePoints = 0;
            

        }

    }
    public PlayerCharacter(String sName, int nMaxHealth, String nType) {
        //Constructor of Player Charakter @Lingel
        m_sPlayerName = sName;
        m_nMaxHealth = nMaxHealth;
        m_nLevel = 1;
        m_nInventorySize = 21;
        m_sCharacterType = nType;
        m_nHealth = m_nMaxHealth;
        m_itemObjectArray_Inventory = Inventory.m_itemObjectArray_Inventory; //set membervariable to store the inventoy an imported value @maulie5
         
        

        System.out.println("Your Name: " + m_sPlayerName);
        System.out.println("Your Class: " + m_sCharacterType);

    }

    public void changeHealth(int nHealthdifference) {
        //changes the health of the Player Character by the given nHealthdifference @Lingel

        m_nHealth = m_nHealth-nHealthdifference;
        System.out.println("You just lost "+nHealthdifference+" HP");
        System.out.println("you have "+m_nHealth+" remaining");


    }
    public void changeLevel(int nLevelDifference) {
        //changes the level of the Player Character by the given nLevelDifference @Lingel937

        m_nLevel = m_nLevel+nLevelDifference;
        System.out.println("You just reached level "+m_nLevel);

    }


    //function to check if the inventory is full and displays a message
    public void fullInventory(){
        if(m_itemObjectArray_Inventory.size()>= m_nInventorySize){
            System.out.println("Your inventory is full!!!");
            System.out.println("Try to get rid some items or to get a better backpack.");
        }
    }

    //getter methods  @Lingel937
    public int getHealth(){
        //returns the current health of the Player Character @Lingel

        return m_nHealth;
    }
    public String getName() {

        return m_sPlayerName;
    }

    public String getCharacterType() {
        return m_sCharacterType;
    }
    public int getLevel() {
        return m_nLevel;
    }
}




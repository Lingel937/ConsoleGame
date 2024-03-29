package Characters;

import Items.Item;


/*
    Author:                  Valentin Lingelbach (@Lingel)
    Version added:           WIP_0.1.0
    Last Update in Version:  WIP_0.1
*/
 /*Character class to store important values related to the character*/


import Location.*;


public class PlayerCharacter extends Inventory{
    private String m_sPlayerName;       //name of the Character. @Lingel937
    private int m_nMaxHealth;           //maximum of hp your character can reach. @Lingel937
    private int m_nLevel;               //level of the character @Lingel937
    private String m_sCharacterType;    //type of the Character(e.g. Elve, Dwarf ect..) @Lingel
    private int m_nHealth;              //Current health of the character @Lingel937
    public  Inventory inventory; //object array of the class item to store your inventory @maulie5
    private int m_nInventorySize; //variable to store the size of the inventory @maulie5
    private int  m_nExperiencePoints;
    private Location m_oCurrentLocation;
    private int m_nMoney;
    private Item m_oCurrentHelmet;
    private Item m_oCurrentBodyArmor;
    private Item m_oCurrentPants;
    private Item m_oCurrentBoots;
    public PlayerCharacter(
        String sName, 
        int nMaxHealth, 
        String sType
        ){
        //Constructor of Player Charakter @Lingel
        m_sPlayerName = sName;
        m_nMaxHealth = nMaxHealth;
        m_nLevel = 1;
        m_nInventorySize = 21;
        m_sCharacterType = sType;
        m_nHealth = m_nMaxHealth;
        m_nExperiencePoints = 0;
        m_nMoney = 0;
        inventory = new Inventory(); //set membervariable to store the inventoy of the character @maulie5
        m_oCurrentLocation = Locations.forest;

        System.out.println("Your Name: " + m_sPlayerName);
        System.out.println("Your Class: " + m_sCharacterType);
    }
    public PlayerCharacter(
        String sName, 
        int nMaxHealth, 
        int nInventorySize,
        String sType, 
        int nLevel, 
        int nHealth, 
        int nExperiencePoints, 
        int nMoney, 
        Inventory inv_inventory

        ) {
        //Constructor of Player Charakter @Lingel
        m_sPlayerName = sName;
        m_nMaxHealth = nMaxHealth;
        m_nLevel = nLevel;
        m_nInventorySize = nInventorySize;
        m_sCharacterType = sType;
        m_nHealth = nHealth;
        m_nExperiencePoints = nExperiencePoints;
        m_nMoney = nMoney;
        inventory = inv_inventory; //set membervariable to store the inventoy of the character @maulie5
        m_oCurrentLocation = new Location(nLevel);
        m_oCurrentLocation = Locations.forest;
        System.out.println("Your Name: " + m_sPlayerName);
        System.out.println("Your Class: " + m_sCharacterType);
        System.out.println("Character was succesfully loaded!!!");
    }

    public void addXP(int nXP){
        m_nExperiencePoints += nXP;
    }
    
    public void checkLevelUp(){
        if(m_nExperiencePoints >= m_nLevel*10){
            m_nLevel++;
            m_nExperiencePoints = 0;
            System.out.println("you gained a Level");
        }

    }
    public void changeHealth(int nHealthdifference) {
        //changes the health of the Player Character by the given nHealthdifference @Lingel

        m_nHealth = m_nHealth-nHealthdifference;

    }
    public void changeLevel(int nLevelDifference) {
        //changes the level of the Player Character by the given nLevelDifference @Lingel937

        m_nLevel = m_nLevel+nLevelDifference;
        System.out.println("You just reached level "+m_nLevel);

    }


    //function to check if the inventory is full and displays a message
    public void fullInventory(){
        if(inventory.getNumberOfItems() >= m_nInventorySize){
            System.out.println("Your inventory is full!!!");
            System.out.println("Try to get rid some items or to get a better backpack.");
        }
    }

    //getter methods  @Lingel937
    public int getHealth(){
        //returns the current health of the Player Character @Lingel937
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

    public int getMoney(){
        return m_nMoney;
    }
    public void addMoney(int nMoney){
        m_nMoney += nMoney;
    }
    public Inventory getPlayerInventory(){
        return inventory;
    }
    public int getMaxHealth(){
        return m_nMaxHealth;
    }
    public int getExperiencePoints(){
        return m_nExperiencePoints;
    }
    public int getInventorySize () {
        return m_nInventorySize;
    }

    public void setCurrentLocation(Location oCurrentLocation){
        m_oCurrentLocation = oCurrentLocation;
    }
    public Location getCurrentLocation(){
        return m_oCurrentLocation;

    }

    public Item getCurrentHelmet(){
        return m_oCurrentHelmet;
    }
    public Item getCurrentBodyArmor(){
        return m_oCurrentBodyArmor;
    }
    public Item getCurrentPants(){
        return m_oCurrentPants;
    }
    public Item getCurrentBoots(){
        return m_oCurrentBoots;
    }
    public void setCurrentHelmet(Item nArmor){
        m_oCurrentHelmet = nArmor;

    }
    public void setCurrentBodyArmor(Item nArmor){
        m_oCurrentBodyArmor = nArmor;

    }
    public void setCurrentPants(Item nArmor){
        m_oCurrentPants = nArmor;

    }
    public void setCurrentBoots(Item nArmor){
        m_oCurrentBoots = nArmor;

    }
}




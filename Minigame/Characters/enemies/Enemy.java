/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1

*/
package Characters.enemies;
import Characters.NPC;
import Items.Item;
import java.util.Random;
import java.util.ArrayList;


public class Enemy extends NPC {
    Random rand = new Random();
    protected int m_nDamage;
    private int m_nMinDroppedMoney;
    private int m_nMaxDroppedMoney;
    private int m_nDroppedXP;
    ArrayList<Item> commonlyDroppedItems = new ArrayList<>();
    ArrayList<Item> rarelyDroppedItems = new ArrayList<>();
    ArrayList<Item> epicDroppedItems = new ArrayList<>();


    public Enemy
            (
            int nLevel,
            int nDamage,
            String sName,
            int nMinDroppedMoney,
            int nMaxDroppedMoney,
            int nDroppedXP
            )
    {
        m_nDroppedXP = nDroppedXP;
        m_nLevel = nLevel;
        m_nDamage = nDamage;
        m_sName = sName;
        m_nMinDroppedMoney = nMinDroppedMoney;
        m_nMaxDroppedMoney = nMaxDroppedMoney;

    }
    public int dropXP(){
        return m_nDroppedXP;
    }
    public int dropMoney(){
        return rand.nextInt(m_nMinDroppedMoney,m_nMaxDroppedMoney);
    }
    public Item dropItem(int nRarity){
        switch (nRarity) {

            default:
                return null;

            case 1:
                return commonlyDroppedItems.get(rand.nextInt(commonlyDroppedItems.size()));
            case 2:
                return rarelyDroppedItems.get(rand.nextInt(rarelyDroppedItems.size()));
            case 3:
                return epicDroppedItems.get(rand.nextInt(epicDroppedItems.size()));
        }


    }
    public void addCommonlyDroppedItem(Item item){
        commonlyDroppedItems.add(item);
    }
    public void addRarelyDroppedItem(Item item){
        rarelyDroppedItems.add(item);
    }
    public void addEpicDroppedItem(Item item){
        epicDroppedItems.add(item);
    }
    public int getCommonItemLength(){
        return commonlyDroppedItems.size();
    }
    public int getRareItemLength(){
        return rarelyDroppedItems.size();
    }
    public int getEpicItemLength(){
        return epicDroppedItems.size();
    }


    public int getDamage(){
        return m_nDamage;
    }
}

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
    protected int m_nDamage;
    static Random rand = new Random();
    ArrayList<Item> commonlyDroppedItems = new ArrayList<>();
    ArrayList<Item> rarelyDroppedItems = new ArrayList<>();
    ArrayList<Item> epicDroppedItems = new ArrayList<>();

    public Enemy(int nLevel, int nDamage){
        m_nLevel = nLevel;
        m_nDamage = nDamage;
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
    public void setCommonlyDroppedItems(int index, Item item){
        commonlyDroppedItems.set(index, item);
    }
    public void setRarelyDroppedItems(int index, Item item){
        rarelyDroppedItems.set(index, item);
    }
    public void setEpicDroppedItems(int index, Item item){
        epicDroppedItems.set(index, item);
    }
    public void removeCommonlyDroppedItem(int index){
        commonlyDroppedItems.remove(index);
    }
    public void removeRarelyDroppedItem(int index){
        rarelyDroppedItems.remove(index);
    }
    public void removeEpicDroppedItem(int index){
        epicDroppedItems.remove(index);
    }



}

/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1

*/
package Enemies;

import Items.Item;
import java.util.Random;
import java.util.ArrayList;


public class Enemy {
    Random rand = new Random();
    protected int level;
    protected String name;
    protected int damage;
    private int minDroppedMoney;
    private int maxDroppedMoney;
    private int droppedXP;
    ArrayList<Item> commonlyDroppedItems = new ArrayList<>();
    ArrayList<Item> rarelyDroppedItems = new ArrayList<>();
    ArrayList<Item> epicDroppedItems = new ArrayList<>();


    public Enemy
            (
            int level,
            int damage,
            String name,
            int minDroppedMoney,
            int maxDroppedMoney,
            int droppedXP
            )
    {
        this.droppedXP = droppedXP;
        this.level = level;
        this.damage = damage;
        this.name = name;
        this.minDroppedMoney = minDroppedMoney;
        this.maxDroppedMoney = maxDroppedMoney;

    }
    public int dropXP(){
        return droppedXP;
    }
    public int dropMoney(){
        return rand.nextInt(minDroppedMoney, maxDroppedMoney);
    }
    public Item dropItem(int rarity){
        switch (rarity) {

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
    public String getName(){
        return name;
    }

    public int getDamage(){
        return damage;
    }
}

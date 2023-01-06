/*
        Author:                  Valentin Lingelbach
        Version added:           WIP_0.1
        Last Update in Version:  WIP_0.1

        Class location is the superclass of all location classes

       Locations contain specific monsters to be found at hunt and also randomly appear.
       Locations also contain specific types of items, especially Resources but also Weapons and Food.
       Some Friendly NPCs are also differently found, for example in different levels or raritys.

*/

package Location;

import Enemies.Enemies;
import Enemies.Enemy;
import Items.Item;

import java.util.ArrayList;
import java.util.Random;


public class Location {
    protected int s_nLevel;
    protected String s_sname;
    protected String s_sdescription;
    ArrayList<Enemy> commonEnemies = new ArrayList<Enemy>();
    ArrayList<Enemy> rareEnemies = new ArrayList<Enemy>();
    ArrayList<Enemy> epicEnemies = new ArrayList<Enemy>();
    ArrayList<Item> commonItems = new ArrayList<Item>();
    ArrayList<Item> rareItems = new ArrayList<Item>();
    ArrayList<Item> EpicItems = new ArrayList<Item>();
    public Location(int nLevel){
        nLevel = s_nLevel;
    }

    public Enemy spawnEnemy(int nRarity) {

        switch (nRarity) {
            default:
                return Enemies.bandit;
            case 1:
                return commonEnemies.get(new Random().nextInt(commonEnemies.size()));
            case 2:
                return rareEnemies.get(new Random().nextInt(rareEnemies.size()));
            case 3:
                return epicEnemies.get(new Random().nextInt(epicEnemies.size()));
        }
    }

    public void addCommonEnemy(Enemy oCommonEnemy){
        commonEnemies.add(oCommonEnemy);
    }
    public void addRareEnemy(Enemy rareEnemy){
        rareEnemies.add(rareEnemy);
    }
    public void addEpicEnemy(Enemy epicEnemy){
        epicEnemies.add(epicEnemy);
    }

    public void addCommonItem(Item nItem){
        commonItems.add(nItem);
    }
    public void addRareItem(Item nItem){
        rareItems.add(nItem);
    }
    public void addEpicItem(Item nItem){
        EpicItems.add(nItem);
    }
}

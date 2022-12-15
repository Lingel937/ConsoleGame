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

import Characters.enemies.Enemy;
import Items.Item;

import java.util.ArrayList;

public class Location {
    protected int s_nLevel;
    protected String s_sname;
    protected String s_sdescription;
    ArrayList<Enemy> commonEnemies = new ArrayList<Enemy>();
    ArrayList<Enemy> rareEnemies = new ArrayList<Enemy>();
    ArrayList<Enemy> epicEnemies = new ArrayList<Enemy>();
    ArrayList<Item> commonItems =new ArrayList<>();
    ArrayList<Item> rareItems =new ArrayList<>();
    ArrayList<Item> EpicItems =new ArrayList<>();
    public Location(int nLevel){
        nLevel = s_nLevel;
    }
    public void addCommonEnemy(Enemy commonEnemy){
        commonEnemies.add(commonEnemy);
    }
    public void addRareEnemy(Enemy rareEnemy){
        rareEnemies.add(rareEnemy);
    }
    public void addEpicEnemy(Enemy epicEnemy){
        epicEnemies.add(epicEnemy);
    }

    public void addCommonItem(){

    }
    public void addRareItem(){

    }
    public void addEpicItem(){

    }
}

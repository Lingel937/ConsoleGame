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

import java.util.ArrayList;

public class Location {
    protected int s_nLevel;
    protected String s_sname;
    protected String s_sdescription;
    ArrayList<Enemy> commonEnemies = new ArrayList<Enemy>();
    ArrayList<Enemy> rareEnemies = new ArrayList<Enemy>();
    ArrayList<Enemy> epicEnemies = new ArrayList<Enemy>();
    
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

    public void setCommonEnemies(int index, Enemy commonEnemy){
        commonEnemies.set(index, commonEnemy);
    }
    public void setRareEnemies(int index, Enemy rareEnemy){
        rareEnemies.set(index, rareEnemy);
    }
    public void setEpicEnemies(int index, Enemy epicEnemy){
        epicEnemies.set(index, epicEnemy);
    }
    public void removeCommonEnemy(int index){
        commonEnemies.remove(index);
    }
    public void removeRareEnemy(int index){
        rareEnemies.remove(index);
    }
    public void removeEpicEnemy(int index){
        epicEnemies.remove(index);
    }
}

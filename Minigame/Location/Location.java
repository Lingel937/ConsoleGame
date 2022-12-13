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
    Enemy bauer = new Enemy();
    protected static int s_nlevel;
    protected static String s_sname;
    protected static int s_nsize;
    protected static String s_sdescription;
    ArrayList<Enemy> commonEnemies = new ArrayList<>();
    ArrayList<Enemy> rareEnemies = new ArrayList<>();
    ArrayList<Enemy> epicEnemies = new ArrayList<>();
    commonEnemies.add(bauer);
    }
}

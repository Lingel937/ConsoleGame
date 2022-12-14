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
    protected int m_nMaxHealth;
    protected int m_nDamage;
    static Random rand = new Random();
    ArrayList<Item> commonlyDroppedItems = new ArrayList<>();
    ArrayList<Item> rarelyDroppedItems = new ArrayList<>();
    ArrayList<Item> epicDroppedItems = new ArrayList<>();


}

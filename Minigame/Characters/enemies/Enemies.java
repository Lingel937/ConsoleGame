package Characters.enemies;

import Items.Items;

public class Enemies {
    public static Enemy farmer;
    public static Enemy bandit;
    public static Enemy hunter;
    public static Enemy warrior;
    public static Enemy goblin;
    public static Enemy ork;
    public static Enemy troll;
    public static Enemy zombie;
    public static Enemy skeleton;
    public static Enemy guard;

    public static Enemy goat;
    public static Enemy wolf;

    public static void farmer(){
        farmer = new Enemy(1,15,"Farmer", 1, 15, 5);
        farmer.addRarelyDroppedItem(Items.wood);
        farmer.addCommonlyDroppedItem(Items.hay);
        farmer.addCommonlyDroppedItem(Items.Heugabel);

        
    }
    public static void bandit(){
        bandit = new Enemy(2,10, "Bandit", 3,14, 7);
        bandit.addRarelyDroppedItem(Items.wood);
        bandit.addCommonlyDroppedItem(Items.hay);
        bandit.addCommonlyDroppedItem(Items.Heugabel);
    }
    public static void hunter(){
        hunter = new Enemy(2,35, "Hunter",6,20,20);
        hunter.addRarelyDroppedItem(Items.wood);
        hunter.addCommonlyDroppedItem(Items.hay);
        hunter.addCommonlyDroppedItem(Items.Heugabel);
    }
    public static void warrior(){
        warrior = new Enemy(5,45, "Warrior",20,50,30);
        warrior.addRarelyDroppedItem(Items.wood);
        warrior.addCommonlyDroppedItem(Items.hay);
        warrior.addCommonlyDroppedItem(Items.Heugabel);
    }
    public static void goblin(){
        goblin = new Enemy(4,30, "Goblin",0,50,15);
        goblin.addRarelyDroppedItem(Items.wood);
        goblin.addCommonlyDroppedItem(Items.hay);
        goblin.addCommonlyDroppedItem(Items.Heugabel);
    }
    public static void ork(){
        ork = new Enemy(7,50, "Ork",0,10,20);
        ork.addRarelyDroppedItem(Items.wood);
        ork.addCommonlyDroppedItem(Items.hay);
        ork.addCommonlyDroppedItem(Items.Heugabel);
    }
    public static void troll(){
        troll = new Enemy(4, 56, "Troll",0,5,25);
        troll.addRarelyDroppedItem(Items.wood);
        troll.addCommonlyDroppedItem(Items.hay);
        troll.addCommonlyDroppedItem(Items.Heugabel);
    }
    public static void zombie(){
        zombie = new Enemy(8, 45, "Zombie",0,2,10);
        zombie.addRarelyDroppedItem(Items.wood);
        zombie.addCommonlyDroppedItem(Items.hay);
        zombie.addCommonlyDroppedItem(Items.Heugabel);
    }
    public static void skeleton(){
        skeleton = new Enemy(2, 32, "Skeleton",0,25,15);
        skeleton.addRarelyDroppedItem(Items.wood);
        skeleton.addCommonlyDroppedItem(Items.hay);
        skeleton.addCommonlyDroppedItem(Items.Heugabel);
    }
    public static void guard(){
        guard = new Enemy(20, 100, "Guard",25,60,50);
        guard.addRarelyDroppedItem(Items.wood);
        guard.addCommonlyDroppedItem(Items.hay);
        guard.addCommonlyDroppedItem(Items.Heugabel);
    }
    public static void goat(){
        goat = new Enemy(4, 1, "Goat",0,2,1);
        goat.addRarelyDroppedItem(Items.wood);
        goat.addCommonlyDroppedItem(Items.hay);
        goat.addCommonlyDroppedItem(Items.Heugabel);
    }
    public static void wolf(){
        wolf = new Enemy(5, 10, "Wolf",0,1,5);
        wolf.addRarelyDroppedItem(Items.wood);
        wolf.addCommonlyDroppedItem(Items.hay);
        wolf.addCommonlyDroppedItem(Items.Heugabel);
    }



}



package Location;
import Characters.enemies.Enemies;

public class Locations {
    static Location forest;
    static Location mountain;
    static Location desert;
    static Location swamp;
    static Location plains;
    static Location city;
    static Location Castle;
    public static void forest(){
        forest = new Location(1);
        forest.addCommonEnemy(Enemies.farmer);
        forest.addCommonEnemy(Enemies.bandit);
        forest.addCommonEnemy(Enemies.hunter);
        forest.addRareEnemy(Enemies.goblin);
        forest.addEpicEnemy(Enemies.warrior);
        forest.addCommonEnemy(Enemies.wolf);


    }
    public static void mountain(){
        mountain = new Location(2);
        mountain.addRareEnemy(Enemies.warrior);
        mountain.addCommonEnemy(Enemies.goat);
    }
    public static void desert(){
        desert = new Location(3);
    }
    public static void swamp(){
        swamp = new Location(4);
    }
    public static void plains(){
        plains = new Location(5);
    }
    public static void city(){
        city = new Location(6);

    }
    public static void castle(){
        Castle = new Location(7);
    }


}

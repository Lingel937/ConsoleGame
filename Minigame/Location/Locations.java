package Location;
import Characters.enemies.Enemy;
public class Locations {
    static Location forest;
    static Location mountain;
    static Location desert;
    static Location swamp;
    static Location plains;
    static Location city;
    static Location Castle;
    public static void forest(){
        forest = new Location(1, new Enemy(), new Enemy(), new Enemy());


    }
    public static void mountain(){
        mountain = new Location(2, new Enemy(), new Enemy(), new Enemy());
    }
    public static void desert(){
        desert = new Location(3, new Enemy(), new Enemy(), new Enemy());
    }
    public static void swamp(){
        swamp = new Location(4, new Enemy(), new Enemy(), new Enemy());
    }
    public static void plains(){
        plains = new Location(5, new Enemy(), new Enemy(), new Enemy());
    }
    public static void city(){
        city = new Location(6, new Enemy(), new Enemy(), new Enemy());
    }
    public static void castle(){
        Castle = new Location(7, new Enemy(), new Enemy(), new Enemy());
    }


}

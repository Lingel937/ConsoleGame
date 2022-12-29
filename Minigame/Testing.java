import Characters.enemies.Enemy;
import Location.Locations;

public class Testing {
    public static void main(String[] args) {


       Game.initialize();
       System.out.println("Game initialized");
       int raritylul = Basic.generateRarity();
       System.out.println(raritylul);
       Enemy myEnemy = Locations.forest.spawnEnemy(raritylul);
       System.out.println(myEnemy.getName());



    }
}

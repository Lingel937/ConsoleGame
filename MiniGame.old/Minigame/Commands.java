import java.util.Scanner;

import Enemies.Enemy;
import Items.Item;
import Location.Locations;

class Commands{


  public static void hunt(){
    //you will hunt a random monster and get loot, loose health and get coins. @Lingel
    int nRarity = Basic.generateRarity();
    Enemy currentEnemy;
    int SumProtectionValues = Game.playerCharacter.getCurrentHelmet().getProtectionValue() + Game.playerCharacter.getCurrentBodyArmor().getProtectionValue() + Game.playerCharacter.getCurrentPants().getProtectionValue() + Game.playerCharacter.getCurrentBoots().getProtectionValue();
    currentEnemy = Game.playerCharacter.getCurrentLocation().spawnEnemy(nRarity);
    System.out.println("You are hunting a " + currentEnemy.getName() + "!");
      int lostDamage  = currentEnemy.getDamage()*((100-SumProtectionValues)/100);
    Game.playerCharacter.changeHealth(currentEnemy.getDamage());
    int gainedMoney = currentEnemy.dropMoney();
    Game.playerCharacter.addMoney(gainedMoney);
    int gainedXp = currentEnemy.dropXP();
    Game.playerCharacter.addXP(gainedXp);
    if(Basic.yesNo3070()){
        Item droppedItem = currentEnemy.dropItem(Basic.generateRarity());
        Game.playerCharacter.inventory.addItem(droppedItem);
        System.out.println("Hunt finished. You lost "+ lostDamage+" Hp. You gained "+ gainedMoney + " Coins, " +gainedXp + " XP and the "+currentEnemy.getName()+" dropped a "+droppedItem.getName());
    }else{
        System.out.println("Hunt finished. You lost "+ lostDamage+" Hp. You gained "+ gainedMoney + " Coins, " +gainedXp + " XP and the "+currentEnemy.getName()+" dropped no Item. ");
    }
    System.out.println();
    Game.playerCharacter.inventory.sortInventory();

    
  }

  public static void help(){
    //prints out all commands @Lingel937
    System.out.println("Commands:");
    System.out.println("help: prints out all commands");
    System.out.println("hunt: you will hunt a random monster and get loot, loose health and get coins");
    System.out.println("inventory: shows your inventory");
    System.out.println("exit: exits the game");
    System.out.println("health: shows your current health");
    System.out.println("heal: heals you");
    System.out.println("profile: shows your profile");
    System.out.println("travel: travel to a new location\n");

  }
  
  public static void health(){
    //prints out your current health @Lingel937
    System.out.println("Your current health is: "+Game.playerCharacter.getHealth()+"\n");
  }
  public static void heal (){
    //@Lingel937
    Game.playerCharacter.changeHealth(-50);
    System.out.println("You healed yourself. You now have "+Game.playerCharacter.getHealth()+" HP\n");

  }
  public static void profile(){
      //prints out your profile @Lingel937
      System.out.println("Your Name: "+Game.playerCharacter.getName());
      System.out.println("Your Class: "+Game.playerCharacter.getCharacterType());
      System.out.println("Your Level: "+Game.playerCharacter.getLevel()+"\n");
    }

    public static void levelUp(){
        //increases your level by 1 @Lingel937
        Game.playerCharacter.changeLevel(1);
        System.out.println("You leveled up! You are now level "+Game.playerCharacter.getLevel());
    }
    
    public static void travel() {
      //travels to a location @Lingel937
      Scanner s = new Scanner(System.in);
      System.out.println("Where do you want to travel to?");
      System.out.println("1. Forest");
      if (Game.playerCharacter.getLevel() >= 2) {
          System.out.println("2. Mountains");
      }
      if (Game.playerCharacter.getLevel() >= 3) {
          System.out.println("3. Desert");
      }
      if (Game.playerCharacter.getLevel() >= 4) {
          System.out.println("4. Swamp");
      }
      if (Game.playerCharacter.getLevel() >= 5) {
          System.out.println("5. Plains");
      }
      if (Game.playerCharacter.getLevel() >= 6) {
          System.out.println("6. City");
      }
      if (Game.playerCharacter.getLevel() >= 7) {
          System.out.println("7. Castle");
      }
      if (Game.playerCharacter.getLevel() >= 8) {
          System.out.println("8. the Dungeon");
      }
      if (Game.playerCharacter.getLevel() >= 9) {
          System.out.println("9. the Volcano");
      }
      if (Game.playerCharacter.getLevel() >= 10) {
          System.out.println("10. the Ocean");
      }
      if (Game.playerCharacter.getLevel() >= 11) {
          System.out.println("11. Space");
      }
      if (Game.playerCharacter.getLevel() >= 12) {
          System.out.println("12. Hell");
      }
      if (Game.playerCharacter.getLevel() >= 13) {
          System.out.println("Heaven");
      }
      if (Game.playerCharacter.getLevel() >= 14) {
          System.out.println("Underworld");
      }
      if (Game.playerCharacter.getLevel() >= 15) {
          System.out.println("Nether");
      }
      if (Game.playerCharacter.getLevel() >= 16) {
          System.out.println("the End");
      }
      if (Game.playerCharacter.getLevel() >= 17) {
          System.out.println("the Void");
      }
      if (Game.playerCharacter.getLevel() >= 18) {
          System.out.println("the Abyss");
      }
      if (Game.playerCharacter.getLevel() >= 19) {
          System.out.println("The Final Stand");
      }
      if (Game.playerCharacter.getLevel() >= 20) {
          System.out.println("The end of the world");
      }
      if (Game.playerCharacter.getLevel() >= 21) {
          System.out.println("the beginning of the world");
      }
      if (Game.playerCharacter.getLevel() >= 22) {
          System.out.println("the End of Time");
      }
      if (Game.playerCharacter.getLevel() >= 23) {
          System.out.println("The Beginning of Time");
      }
      if (Game.playerCharacter.getLevel() >= 24) {
          System.out.println("The End of Space ");
      }
      if (Game.playerCharacter.getLevel() >= 25) {
          System.out.println("The Beginning of Space");
      }
      if (Game.playerCharacter.getLevel() >= 26) {
          System.out.println("The End of the Universe");
      }
      if (Game.playerCharacter.getLevel() >= 27) {
          System.out.println("The Beginning of the Universe");
      }
      if (Game.playerCharacter.getLevel() >= 28) {
          System.out.println("The End of Everything");
      }
      if (Game.playerCharacter.getLevel() >= 29) {
          System.out.println("The Beginning of Everything");
      }
      if (Game.playerCharacter.getLevel() >= 30) {
          System.out.println("The End of Nothing");
      }
      if (Game.playerCharacter.getLevel() >= 31) {
          System.out.println("The Beginning of Nothing");
      }

      if (s.hasNextInt()) {
          int travelTo = s.nextInt();
          if (travelTo > Game.playerCharacter.getLevel()) {
              System.out.println("You can't travel to that location yet\n");
          } else {
              switch (travelTo) {
                  case 1:
                      System.out.println("You traveled to the Forest");
                      Game.playerCharacter.setCurrentLocation(Locations.forest);
                      break;
                  case 2:
                      System.out.println("You traveled to the Mountains");
                      Game.playerCharacter.setCurrentLocation(Locations.mountain);
                      break;
                  case 3:
                      System.out.println("You traveled to the Desert");
                      Game.playerCharacter.setCurrentLocation(Locations.desert);
                      break;
                  case 4:
                      System.out.println("You traveled to the Swamp");
                      Game.playerCharacter.setCurrentLocation(Locations.swamp);
                      break;
                  case 5:
                      System.out.println("You traveled to the Plains");
                      Game.playerCharacter.setCurrentLocation(Locations.plains);
                      break;
                  case 6:
                      System.out.println("You traveled to the City");
                      Game.playerCharacter.setCurrentLocation(Locations.city);
                      break;
                  case 7:
                      System.out.println("You traveled to the Castle");
                      Game.playerCharacter.setCurrentLocation(Locations.Castle);
                      break;
                  case 8:
                      System.out.println("You traveled to the Dungeon");

                      break;
                  case 9:
                      System.out.println("You traveled to the Volcano");
                      break;
                  case 10:
                      System.out.println("You traveled to the Ocean");
                      break;
                  case 11:
                      System.out.println("You traveled to Space");
                      break;
                  case 12:
                      System.out.println("You traveled to Hell");
                      break;
                  case 13:
                      System.out.println("You traveled to Heaven");
                      break;
                  case 14:
                      System.out.println("You traveled to the Underworld");
                      break;
                  case 15:
                      System.out.println("You traveled to the Nether");
                      break;
                  case 16:
                      System.out.println("You traveled to the End");
                      break;
                  case 17:
                      System.out.println("You traveled to the Void");
                      break;
                  case 18:
                      System.out.println("You traveled to the Abyss");
                      break;
                  case 19:
                      System.out.println("You traveled to The Final Stand");
                      break;
                  case 20:
                      System.out.println("You traveled to The End of the World");
                      break;
                  case 21:
                      System.out.println("You traveled to The Beginning of the World");
                      break;
                  case 22:
                      System.out.println("You traveled to The End of Time");
                      break;
                  case 23:
                      System.out.println("You traveled to The Beginning of Time");
                      break;
                  case 24:
                      System.out.println("You traveled to The End of Space");
                      break;
                  case 25:
                      System.out.println("You traveled to The Beginning of Space");
                      break;
                  case 26:
                      System.out.println("You traveled to The End of the Universe");
                      break;
                  case 27:
                      System.out.println("You traveled to The Beginning of the Universe");
                      break;
                  case 28:
                      System.out.println("You traveled to The End of Everything");
                      break;
                  case 29:
                      System.out.println("You traveled to The Beginning of Everything");
                      break;
                  case 30:
                      System.out.println("You traveled to The End of Nothing");
                      break;
                  case 31:
                      System.out.println("You traveled to The Beginning of Nothing");
                      break;
                  default:
                        System.out.println("You didn't travel anywhere");
                        break;
                }
            }
        }else{
            System.out.println("You didn't travel anywhere, please enter the number of desired location");
        }
    
    }
    public static void showInventory(){
        Game.playerCharacter.inventory.sortInventory();
        Game.playerCharacter.inventory.showInventoryContent();
    }
}
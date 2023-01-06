import java.util.Scanner;

import Enemies.Enemy;
import Items.Item;
import Location.Locations;

class Commands{


  public static void hunt(){
    //you will hunt a random monster and get loot, loose health and get coins. @Lingel
    int nRarity = Basic.generateRarity();
    int nHealtChange;
    Enemy oCurrentEnemy;
    int SumProtectionValues = Game.s_mPlayerCharacter.getCurrentHelmet().getProtectionValue() + Game.s_mPlayerCharacter.getCurrentBodyArmor().getProtectionValue() + Game.s_mPlayerCharacter.getCurrentPants().getProtectionValue() + Game.s_mPlayerCharacter.getCurrentBoots().getProtectionValue();
    oCurrentEnemy = Game.s_mPlayerCharacter.getCurrentLocation().spawnEnemy(nRarity);
    System.out.println("You are hunting a " + oCurrentEnemy.getName() + "!");
      int nLostDamage  = oCurrentEnemy.getDamage()*((100-SumProtectionValues)/100);
    Game.s_mPlayerCharacter.changeHealth(oCurrentEnemy.getDamage());
    int nGainedMoney = oCurrentEnemy.dropMoney();
    Game.s_mPlayerCharacter.addMoney(nGainedMoney);
    int nGainedXP = oCurrentEnemy.dropXP();
    Game.s_mPlayerCharacter.addXP(nGainedXP);
    if(Basic.yesNo3070()){
        Item oDroppedItem = oCurrentEnemy.dropItem(Basic.generateRarity());
        Game.s_mPlayerCharacter.m_inventoryObject.addItem(oDroppedItem);
        System.out.println("Hunt finished. You lost "+ nLostDamage+" Hp. You gained "+ nGainedMoney + " Coins, " +nGainedXP + " XP and the "+oCurrentEnemy.getName()+" dropped a "+oDroppedItem.getName());
    }else{
        System.out.println("Hunt finished. You lost "+ nLostDamage+" Hp. You gained "+ nGainedMoney + " Coins, " +nGainedXP + " XP and the "+oCurrentEnemy.getName()+" dropped no Item. ");
    }
    System.out.println();

    
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
    System.out.println("Your current health is: "+Game.s_mPlayerCharacter.getHealth()+"\n");
  }
  public static void heal (){
    //@Lingel937
    Game.s_mPlayerCharacter.changeHealth(-50);
    System.out.println("You healed yourself. You now have "+Game.s_mPlayerCharacter.getHealth()+" HP\n");

  }
  public static void profile(){
      //prints out your profile @Lingel937
      System.out.println("Your Name: "+Game.s_mPlayerCharacter.getName());
      System.out.println("Your Class: "+Game.s_mPlayerCharacter.getCharacterType());
      System.out.println("Your Level: "+Game.s_mPlayerCharacter.getLevel()+"\n");
    }

    public static void levelUp(){
        //increases your level by 1 @Lingel937
        Game.s_mPlayerCharacter.changeLevel(1);
        System.out.println("You leveled up! You are now level "+Game.s_mPlayerCharacter.getLevel());
    }
    
    public static void travel() {
      //travels to a location @Lingel937
      Scanner s = new Scanner(System.in);
      System.out.println("Where do you want to travel to?");
      System.out.println("1. Forest");
      if (Game.s_mPlayerCharacter.getLevel() >= 2) {
          System.out.println("2. Mountains");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 3) {
          System.out.println("3. Desert");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 4) {
          System.out.println("4. Swamp");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 5) {
          System.out.println("5. Plains");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 6) {
          System.out.println("6. City");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 7) {
          System.out.println("7. Castle");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 8) {
          System.out.println("8. the Dungeon");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 9) {
          System.out.println("9. the Volcano");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 10) {
          System.out.println("10. the Ocean");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 11) {
          System.out.println("11. Space");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 12) {
          System.out.println("12. Hell");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 13) {
          System.out.println("Heaven");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 14) {
          System.out.println("Underworld");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 15) {
          System.out.println("Nether");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 16) {
          System.out.println("the End");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 17) {
          System.out.println("the Void");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 18) {
          System.out.println("the Abyss");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 19) {
          System.out.println("The Final Stand");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 20) {
          System.out.println("The end of the world");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 21) {
          System.out.println("the beginning of the world");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 22) {
          System.out.println("the End of Time");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 23) {
          System.out.println("The Beginning of Time");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 24) {
          System.out.println("The End of Space ");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 25) {
          System.out.println("The Beginning of Space");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 26) {
          System.out.println("The End of the Universe");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 27) {
          System.out.println("The Beginning of the Universe");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 28) {
          System.out.println("The End of Everything");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 29) {
          System.out.println("The Beginning of Everything");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 30) {
          System.out.println("The End of Nothing");
      }
      if (Game.s_mPlayerCharacter.getLevel() >= 31) {
          System.out.println("The Beginning of Nothing");
      }

      if (s.hasNextInt()) {
          int nTravelTo = s.nextInt();
          if (nTravelTo > Game.s_mPlayerCharacter.getLevel()) {
              System.out.println("You can't travel to that location yet\n");
          } else {
              switch (nTravelTo) {
                  case 1:
                      System.out.println("You traveled to the Forest");
                      Game.s_mPlayerCharacter.setCurrentLocation(Locations.forest);
                      break;
                  case 2:
                      System.out.println("You traveled to the Mountains");
                      Game.s_mPlayerCharacter.setCurrentLocation(Locations.mountain);
                      break;
                  case 3:
                      System.out.println("You traveled to the Desert");
                      Game.s_mPlayerCharacter.setCurrentLocation(Locations.desert);
                      break;
                  case 4:
                      System.out.println("You traveled to the Swamp");
                      Game.s_mPlayerCharacter.setCurrentLocation(Locations.swamp);
                      break;
                  case 5:
                      System.out.println("You traveled to the Plains");
                      Game.s_mPlayerCharacter.setCurrentLocation(Locations.plains);
                      break;
                  case 6:
                      System.out.println("You traveled to the City");
                      Game.s_mPlayerCharacter.setCurrentLocation(Locations.city);
                      break;
                  case 7:
                      System.out.println("You traveled to the Castle");
                      Game.s_mPlayerCharacter.setCurrentLocation(Locations.Castle);
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
        Game.s_mPlayerCharacter.m_inventoryObject.showInventoryContent();
    }
}
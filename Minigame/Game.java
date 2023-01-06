
/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1
*/
import java.util.Scanner;
import java.util.ArrayList;
import Characters.*;
import Enemies.Enemies;
import Items.*;
import Location.*;
import lib.*;

public class Game {

  private static String  s_sCharakterName;
  private static int     s_nCharakterType;
  public static PlayerCharacter s_mPlayerCharacter;
  public static ArrayList<Item> itemArr_listOfAllItems;
  public static Scanner scanner = new Scanner(System.in);

	public static PlayerCharacter   s_player;
	public static void createAllLocations(){
        //function to initialize all Locations @lingel937
        Locations.forest();
        Locations.mountain();
        Locations.castle();
        Locations.city();
        Locations.desert();
        Locations.plains();
    }

    public static void createAllItems(){
        Items.itemslol();
    }
    public static void createAllEnemies(){
        Enemies.farmer();
        Enemies.goblin();
        Enemies.warrior();
        Enemies.wolf();
        Enemies.bandit();
        Enemies.hunter();
        Enemies.goat();
        Enemies.ork();
        Enemies.guard();
        Enemies.skeleton();
        Enemies.zombie();
        Enemies.troll();
    }

    public static void createListOfAllitems(){
        //function to create an object arry of all items
        //to store all values of an item    @maulie5
        itemArr_listOfAllItems = new ArrayList<>();
		String[] strArr_propertiesOfItem;
        for(int k = 4; k<= ItemRead.getNumberOfLinesOfItemFile();k++){
            strArr_propertiesOfItem = ItemRead.getItemProperties(k);
            Item item_item = new Item(
                Lib.convertStrToInt(strArr_propertiesOfItem[0]),
                strArr_propertiesOfItem[1],
                strArr_propertiesOfItem[2],
                strArr_propertiesOfItem[3],
                Lib.convertStrToInt(strArr_propertiesOfItem[4]),
                Lib.convertStrToDoub(strArr_propertiesOfItem[5]),
                Lib.convertStrToDoub(strArr_propertiesOfItem[6]),
                Lib.convertStrToInt(strArr_propertiesOfItem[7]),
                Lib.convertStrToInt(strArr_propertiesOfItem[8]),
                Lib.convertStrToInt(strArr_propertiesOfItem[9])
                );
            itemArr_listOfAllItems.add(item_item);
        }
    }
	//function to create the character object 
    public static void  createNewCharacter() {

        scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String s_sCharakterName = scanner.nextLine();

        boolean bIsCharakterTypeValid = false;
        while(!bIsCharakterTypeValid){

            System.out.println("\nType in the number to choose your Class:\n1 - Elve\n2 - Human\n3 - Wizard\n4 - Dwarf\nInput:");


                String s_sCharakterType = scanner.nextLine();
                switch (s_sCharakterType){

                    case "1":
                        s_mPlayerCharacter = new PlayerCharacter(s_sCharakterName, 80, "Elve");
                        bIsCharakterTypeValid = true;

                        break;

                    case "2":
                        s_mPlayerCharacter = new PlayerCharacter(s_sCharakterName, 100, "Human");
                        bIsCharakterTypeValid = true;
                        break;

                    case "3":
                        s_mPlayerCharacter = new PlayerCharacter(s_sCharakterName, 90, "Wizard");
                        bIsCharakterTypeValid = true;
                        break;

                    case "4":
                        s_mPlayerCharacter = new PlayerCharacter(s_sCharakterName, 150, "Dwarf");
                        bIsCharakterTypeValid = true;
                        break;

                    case "42":
                        s_mPlayerCharacter = new PlayerCharacter(s_sCharakterName, 9999999, "Superuser");
                        bIsCharakterTypeValid = true;
                        break;

                    default:
                        System.out.println("Please enter a VALID integer!!!");
                        break;
                }


        }
        s_mPlayerCharacter.setCurrentLocation(Locations.forest);
        s_mPlayerCharacter.setCurrentHelmet(Items.NoHat);
        s_mPlayerCharacter.setCurrentBodyArmor(Items.NoBodyarmor);
        s_mPlayerCharacter.setCurrentPants(Items.NoPants);
        s_mPlayerCharacter.setCurrentBoots(Items.Barefoot);

    }
    public static void loadOrCreateCharacter(){
        boolean bIsInputValid = false;
        while(!bIsInputValid){
            try{
                System.out.println("Do you want to load a character or create a new one?\n1 - Create\n2 - Load\n3 - Exit the Game \nInput:");
                scanner = new Scanner(System.in);
                int nInput = scanner.nextInt();
                switch(nInput){
                    case 2:
                        boolean bIsCharacterInputValid = false;
                        while(!bIsCharacterInputValid){
                            try{
                                String[] strArr_listOfAllCharacters = Characters.PlayerCharacterFileIO.getPlayerCharacterNames();
                                System.out.println("Which character do you want to load?\nType in the name of the character:");
                                for(int k = 0 ; k < strArr_listOfAllCharacters.length; k++){
                                    System.out.println((k+1)+"-----"+strArr_listOfAllCharacters[k]+"\nInput:");
                                }
                                scanner = new Scanner(System.in);
                                String sInput = scanner.nextLine();
                                for (int i = 0; i < strArr_listOfAllCharacters.length; i++) {
                                    if(sInput.equals(strArr_listOfAllCharacters[i])){
                                        s_mPlayerCharacter = Characters.PlayerCharacterFileIO.loadPlayerCharacter(sInput);
                                        bIsInputValid = true;
                                        bIsCharacterInputValid = true;
                                    }    
                                }
                                if(bIsCharacterInputValid == false ){
                                    System.out.println("Please enter a valid character to load!!!");
                                }
                            }catch(Exception e){
                                System.out.println("Please enter a valid character to load!!!\n");
                                e.printStackTrace();
                            }
                        }
                        break;
                    case 1:
                        createNewCharacter();
                        bIsInputValid = true;
                        break;
                    case 3:
                        Game.end();
                        break;
                    default:
                        System.out.println("Please enter a valid integer!!!");
                        break;
                }
            }catch(Exception e){
                System.out.println("Please enter a valid integer!!!");
            }
        }
    } 

	
	//function which is called once on a gamestart to execute 
	//all necessary functions


	
    public static void initialize(){
        createAllItems();
        createListOfAllitems();
        createAllEnemies();
        createAllLocations();
        loadOrCreateCharacter();
        Game.s_mPlayerCharacter.m_inventoryObject.addItem(itemArr_listOfAllItems.get(0));
        Game.s_mPlayerCharacter.m_inventoryObject.addItem(itemArr_listOfAllItems.get(1));
        Game.s_mPlayerCharacter.m_inventoryObject.addItem(itemArr_listOfAllItems.get(1));

	}
	
	//function which is running the hole time 
	//and waits for player input                           
    public static void run(){

        boolean bIsGameRunning = true;

        while(bIsGameRunning) {
            boolean bGameCheck = Game.s_mPlayerCharacter.getHealth() > 0;


            if (!bGameCheck) {
                bIsGameRunning = false;
            }

            String input = scanner.nextLine();
            switch(input){
                case "hunt":
                    Commands.hunt();
                    break;
                case "help":
                    Commands.help();
                    break;
                case "inventory":
                    Commands.showInventory();
                    break;
                case "health":
                    Commands.health();
                    break;
                case "heal":
                    Commands.heal();
                    break;
                case "profile":
                    Commands.profile();
                    break;
                case "travel":
                    Commands.travel();
                    break;
                case "levelup":
                    Commands.levelUp();
                    break;
                case "exit":
                    Game.end();
                    break;
            }

            bGameCheck = Game.s_mPlayerCharacter.getHealth() > 0;


            if (!bGameCheck) {
                bIsGameRunning = false;
            }
            Game.s_mPlayerCharacter.checkLevelUp();
        }



    }

    public static void end(){
        try{
            PlayerCharacterFileIO.savePlayerCharacter(s_mPlayerCharacter);
            itemArr_listOfAllItems.clear();
            Game.s_mPlayerCharacter = null;
            scanner.close();
        }catch(Exception e){
        }
        System.out.println("Thanks for playing!");
        System.exit(0);
    }

}
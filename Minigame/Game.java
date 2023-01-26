
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

  public static PlayerCharacter playerCharacter;
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
    public static void createNewCharacter() {

        scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String s_sCharakterName = scanner.nextLine();

        boolean isCharakterTypeValid = false;
        while(!isCharakterTypeValid){

            System.out.println("\nType in the number to choose your Class:\n1 - Elve\n2 - Human\n3 - Wizard\n4 - Dwarf\nInput:");


                String charakterType = scanner.nextLine();
                switch (charakterType){

                    case "1":
                        playerCharacter = new PlayerCharacter(s_sCharakterName, 80, "Elve");
                        isCharakterTypeValid = true;

                        break;

                    case "2":
                        playerCharacter = new PlayerCharacter(s_sCharakterName, 100, "Human");
                        isCharakterTypeValid = true;
                        break;

                    case "3":
                        playerCharacter = new PlayerCharacter(s_sCharakterName, 90, "Wizard");
                        isCharakterTypeValid = true;
                        break;

                    case "4":
                        playerCharacter = new PlayerCharacter(s_sCharakterName, 150, "Dwarf");
                        isCharakterTypeValid = true;
                        break;

                    case "42":
                        playerCharacter = new PlayerCharacter(s_sCharakterName, 9999999, "Superuser");
                        isCharakterTypeValid = true;
                        break;

                    default:
                        System.out.println("Please enter a VALID integer!!!");
                        break;
                }


        }
        playerCharacter.setCurrentLocation(Locations.forest);
        playerCharacter.setCurrentHelmet(Items.nohat);
        playerCharacter.setCurrentBodyArmor(Items.nobodyarmor);
        playerCharacter.setCurrentPants(Items.nopants);
        playerCharacter.setCurrentBoots(Items.barefoot);

    }
    public static void loadOrCreateCharacter(){
        boolean bIsInputValid = false;
        while(!bIsInputValid){
            try{
                System.out.println("Do you want to load a character or create a new one?\n1 - Create\n2 - Load\n3 - Exit the Game \nInput:");
                scanner = new Scanner(System.in);
                int nInput = scanner.nextInt();
                System.out.println("\n");
                switch(nInput){
                    case 2:
                        boolean bIsCharacterInputValid = false;
                        while(!bIsCharacterInputValid){
                            try{
                                String[] strArr_listOfAllCharacters = Characters.PlayerCharacterFileIO.getPlayerCharacterNames();
                                System.out.println("Which character do you want to load?\nType in the name of the character:");
                                for(int k = 0 ; k < strArr_listOfAllCharacters.length; k++){
                                    System.out.println((k+1)+"-----"+strArr_listOfAllCharacters[k]);
                                }
                                System.out.println("Input:");
                                scanner = new Scanner(System.in);
                                String sInput = scanner.nextLine();
                                System.out.println("\n");
                                for (int i = 0; i < strArr_listOfAllCharacters.length; i++) {
                                    if(sInput.equals(strArr_listOfAllCharacters[i])){
                                        playerCharacter = Characters.PlayerCharacterFileIO.loadPlayerCharacter(sInput);
                                        bIsInputValid = true;
                                        bIsCharacterInputValid = true;
                                    }else if(Lib.convertStrToInt(sInput) == i){
                                        playerCharacter = Characters.PlayerCharacterFileIO.loadPlayerCharacter(strArr_listOfAllCharacters[i-1]);
                                        bIsInputValid = true;
                                        bIsCharacterInputValid = true;
                                    }    
                                }
                                if(bIsCharacterInputValid == false ){
                                    System.out.println("Please enter a valid character to load!!!\n");
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

    public static void createTestInventory(){
        Game.playerCharacter.getPlayerInventory().getInventory().add(Items.axe);
        Game.playerCharacter.getPlayerInventory().getInventory().add(Items.cargopants);
        Game.playerCharacter.getPlayerInventory().getInventory().add(Items.axe);
        Game.playerCharacter.getPlayerInventory().getInventory().add(Items.jamal);
        Game.playerCharacter.getPlayerInventory().getInventory().add(Items.humanskull);
        Game.playerCharacter.getPlayerInventory().getInventory().add(Items.axe);
        Game.playerCharacter.getPlayerInventory().getInventory().add(Items.leatherhelmet);
        Game.playerCharacter.getPlayerInventory().getInventory().add(itemArr_listOfAllItems.get(1));
        Game.playerCharacter.getPlayerInventory().getInventory().add(Items.sword);
        Game.playerCharacter.getPlayerInventory().getInventory().add(Items.hay);
        Game.playerCharacter.getPlayerInventory().getInventory().add(Items.humanleg);
        Game.playerCharacter.getPlayerInventory().getInventory().add(itemArr_listOfAllItems.get(0));
        Game.playerCharacter.getPlayerInventory().getInventory().add(Items.axe);
        System.out.println("Test items added to your inventory succesfully!!!");
    }
	
	//function which is called once on a gamestart to execute 
	//all necessary functions
    public static void initialize(){
        createAllItems();
        createListOfAllitems();
        createAllEnemies();
        createAllLocations();
        loadOrCreateCharacter();
	}
	
	//function which is running the hole time 
	//and waits for player input                           
    public static void run(){

        boolean isGameRunning = true;

        while(isGameRunning) {
            boolean gameCheck = Game.playerCharacter.getHealth() > 0;


            if (!gameCheck) {
                isGameRunning = false;
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
                case "test":
                    Game.createTestInventory();
                    break;
                case "exit":
                    Game.end();
                    break;
            }

            gameCheck = Game.playerCharacter.getHealth() > 0;


            if (!gameCheck) {
                isGameRunning = false;
            }
            Game.playerCharacter.checkLevelUp();
        }



    }

    public static void end(){
        try{
            Game.playerCharacter.inventory.sortInventory();
            PlayerCharacterFileIO.savePlayerCharacter(playerCharacter);
            itemArr_listOfAllItems.clear();
            Game.playerCharacter = null;
            scanner.close();
        }catch(Exception e){
        }
        System.out.println("Thanks for playing!");
        System.exit(0);
    }

}
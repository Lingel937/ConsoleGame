
/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1
*/

import java.util.Scanner;
import java.util.ArrayList;
import Characters.*;
import Items.*;
import lib.*;

public class Game {
    private static String  s_sCharakterName;
    private static int     s_nCharakterType;
    public static PlayerCharacter s_mPlayerCharacter;
    public static ArrayList<Item> itemArr_listOfAllItems;
    public static Scanner s;
	public static PlayerCharacter s_player;
	



	//function to create an object arry of all items 
	//to store all values of an item
    public static void createListOfAllitems(){
        itemArr_listOfAllItems = new ArrayList<>();
		String[] strArr_propertiesOfItem;
        for(int k = 4; k<= ItemRead.getNumberOfLinesOfItemFile();k++){
            strArr_propertiesOfItem = ItemRead.getItemProperties(k-1);
            Item item_item = new Item(
                Lib.convertStrToInt(strArr_propertiesOfItem[0]),
                strArr_propertiesOfItem[1],
                strArr_propertiesOfItem[2],
                strArr_propertiesOfItem[3],
                Lib.convertStrToInt(strArr_propertiesOfItem[4]),
                strArr_propertiesOfItem[5],
                Lib.convertStrToDoub(strArr_propertiesOfItem[6]),
                Lib.convertStrToDoub(strArr_propertiesOfItem[7]), 
                Lib.convertStrToDoub(strArr_propertiesOfItem[8]),
                Lib.convertStrToDoub(strArr_propertiesOfItem[9]), 
                Lib.convertStrToInt(strArr_propertiesOfItem[10]),
                Lib.convertStrToInt(strArr_propertiesOfItem[11])
                );
            itemArr_listOfAllItems.add(item_item);
        }
        
    }
	//function to create the character object 
    public static void  createNewCharacter() {


        s = new Scanner(System.in);

        System.out.println("Enter your Name:");
        String s_sCharakterName = s.nextLine();

        boolean bIsCharakterTypeValid = false;
        while(!bIsCharakterTypeValid){

            System.out.println("\nType in an valid integer to choose your Class:\n1 - Elve\n2 - Human\n3 - Wizard\n4 - Dwarf\nInput:");

            try{
                int s_nCharakterType = s.nextInt();           
                switch (s_nCharakterType){

                    case 1:
                        s_mPlayerCharacter = new PlayerCharacter(s_sCharakterName, 80, "Elve");
                        bIsCharakterTypeValid = true;
                        break;

                    case 2:
                        s_mPlayerCharacter = new PlayerCharacter(s_sCharakterName, 100, "Human");
                        bIsCharakterTypeValid = true;
                        break;

                    case 3:
                        s_mPlayerCharacter = new PlayerCharacter(s_sCharakterName, 90, "Wizard");
                        bIsCharakterTypeValid = true;
                        break;

                    case 4:
                        s_mPlayerCharacter = new PlayerCharacter(s_sCharakterName, 150, "Dwarf");
                        bIsCharakterTypeValid = true;
                        break;

                    case 42:
                        s_mPlayerCharacter = new PlayerCharacter(s_sCharakterName, 9999999, "Superuser");
                        bIsCharakterTypeValid = true;
                        break;

                    default:
                        System.out.println("Please enter a VALID integer!!!");
                        break;
                }
            }catch(Exception e){
                System.out.println("Please enter a valid integer!!!");
                s.nextLine();
            }
            
        }
    }
    public static void loadOrCreateCharacter(){
        System.out.println("Do you want to load a character or create a new one?\n1 - Load\n2 - Create\n3 - Exit the Game \nInput:");
        int nInput = s.nextInt();
        System.out.println("Which character do you want to load?\nType in the name of the character:");
        String sInput = s.nextLine();
        boolean bIsInputValid = false;
        while(!bIsInputValid){
            try{
                switch(nInput){
                    case 1:
                        s_mPlayerCharacter=Characters.PlayerCharacterFileIO.loadPlayerCharacter(sInput)
                        break;
                    case 2:
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
            Game.s_mPlayerCharacter.m_itemObjectArray_Inventory.add(itemArr_listOfAllItems.get(0));
        }
    } 

    public static void loadCharacter(){

    }
	
	//function which is called once on a gamestart to execute 
	//all necessary functions
<<<<<<< Updated upstream
	public static void start(){
		createListOfAllitems();
		createCharakter();
=======
	public static void initialize(){
		createAllLocations();
        createListOfAllitems();
		loadOrCreateCharacter();
        createAllEnemies();

>>>>>>> Stashed changes
	}
	
	//function which is running the hole time 
	//and waits for player input                           
    public static void go(){

        Scanner s = new Scanner(System.in);
        boolean bIsGameRunning = true;


        while(bIsGameRunning) {
            boolean bGameCheck = Game.s_mPlayerCharacter.getHealth() > 0;


            if (!bGameCheck) {
                bIsGameRunning = false;
            }

            String input = s.nextLine();
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
            PlayerCharacterFileIO.savePlayerCharacter(s_mPlayerCharacter);
            System.out.println("Thanks for playing!");
            itemArr_listOfAllItems.clear();
            s.close();
            System.exit(0);
    }

}
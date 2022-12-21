
/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1
*/
import java.util.Scanner;
import java.util.ArrayList;
import Characters.*;
import Characters.enemies.Enemies;
import Items.*;
import Location.*;
import lib.*;

public class Game {
    private static String           s_sCharakterName;
    private static int              s_nCharakterType;
    public static PlayerCharacter   s_mPlayerCharacter;
    public static ArrayList<Item>   itemArr_listOfAllItems;
    public static Scanner           s;
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
            strArr_propertiesOfItem = ItemRead.getItemProperties(k-1);
            Item item_item = new Item(
                Lib.convertStrToInt(strArr_propertiesOfItem[0]),
                strArr_propertiesOfItem[1],
                strArr_propertiesOfItem[2],
                strArr_propertiesOfItem[3],
                Lib.convertStrToInt(strArr_propertiesOfItem[4]),
             //   strArr_propertiesOfItem[5],
                Lib.convertStrToDoub(strArr_propertiesOfItem[6]),
                Lib.convertStrToDoub(strArr_propertiesOfItem[7]), 
               // Lib.convertStrToDoub(strArr_propertiesOfItem[8]),
                    // Lib.convertStrToDoub(strArr_propertiesOfItem[9]),
                Lib.convertStrToInt(strArr_propertiesOfItem[10]),
                Lib.convertStrToInt(strArr_propertiesOfItem[11])
                );
            itemArr_listOfAllItems.add(item_item);
        }
    }
	//function to create the character object 
    public static void  createCharakter() {


        s = new Scanner(System.in);

        System.out.println("Enter your Name:");
        String s_sCharakterName = s.nextLine();

        boolean bIsCharakterTypeValid = false;
        while(!bIsCharakterTypeValid){

            System.out.println("Choose your Class:");
            System.out.println("1 - Elve ");
            System.out.println("2 - Human");
            System.out.println("3 - Wizard");
            System.out.println("4 - Dwarf");
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
                    System.out.println("Choose valid charactertype!!!");
                    break;
            }
        }
   }
	
	//function which is called once on a gamestart to execute 
	//all necessary functions
	public static void initialize(){
		createAllLocations();
        createListOfAllitems();
		createCharakter();
        createAllEnemies();

	}
	
	//function which is running the hole time 
	//and waits for player input                           
    public static void run(){

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
            System.out.println("game has ended lol");
            itemArr_listOfAllItems.clear();
            s.close();
            System.exit(0);
    }

}
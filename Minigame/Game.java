
/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1
*/
import java.util.Scanner;
import java.util.ArrayList;
import Characters.*;
import Items.*;
import Lib.*;
import ItemRead;

public class Game {
    private static String  s_sCharakterName;
    private static int     s_nCharakterType;
    public static PlayerCharacter s_mPlayerCharacter;
	
	
	//function to create an object arry of all items 
	//to store all values of an item
    public static void createListOfAllitems(){
        ArrayList<Item> itemArr_listOfAllItems = new ArrayList<>();
		String[] strArr_propertiesOfItem;
        for(int k = 4; k<= ItemRead.getNumberOfLinesOfItemFile();k++){
            strArr_propertiesOfItem = ItemRead.getItemProperties(k)
            itemArr_listOfAllItems(new Item(k, s_sCharakterName, s_sCharakterName, s_sCharakterName, k, s_sCharakterName, k, k, k, k, k));
        }

    }
	//function to create the character object 
    public static void  createCharakter() {



        Scanner s = new Scanner(System.in);

        System.out.println("Enter your Name");
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
	public static void start(){
		createListOfAllitems();
		createCharakter();
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
                   // Commands.inventory();
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



    }

}
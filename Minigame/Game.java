
/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1
*/
import java.util.Scanner;

import Charakters.PlayerCharakter;

public class Game {
    private static String  s_sCharakterName;
    private static int     s_nCharakterType;
    public static PlayerCharakter       s_mPlayerCharakter;


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
                    s_mPlayerCharakter = new PlayerCharakter(s_sCharakterName, 80, "Elve");
                    bIsCharakterTypeValid = true;
                    break;

                case 2:
                    s_mPlayerCharakter  = new PlayerCharakter(s_sCharakterName, 100, "Human");
                    bIsCharakterTypeValid = true;
                    break;

                case 3:
                    s_mPlayerCharakter = new PlayerCharakter(s_sCharakterName, 90, "Wizard");
                    bIsCharakterTypeValid = true;
                    break;

                case 4:
                    s_mPlayerCharakter = new PlayerCharakter(s_sCharakterName, 150, "Dwarf");
                    bIsCharakterTypeValid = true;
                    break;

                case 42:
                    s_mPlayerCharakter = new PlayerCharakter(s_sCharakterName, 9999999, "Superuser");
                    bIsCharakterTypeValid = true;
                    break;

                default:
                    System.out.println("Choose valid charactertype!!!");
                    break;
            }
        }
    }

    public static void go(){

        Scanner scan = new Scanner(System.in);
        boolean bIsGameRunning = true;


        while(bIsGameRunning) {
            boolean bGameCheck = Game.s_mPlayerCharakter.getHealth() > 0;

            if (!bGameCheck) {
                bIsGameRunning = false;
            }

            String input = scan.nextLine();
            switch(input){
                case "Hunt":
                    Commands.hunt();
                    break;
                case "1":
                    //command
                    break;

            }



        }



    }

    public static void end(){
        System.out.println("game has ended lol");



    }

}
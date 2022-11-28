import java.util.Scanner;



class Commands{
  public static void hunt(){//@Lingel937
    Game.s_mPlayerCharakter.changeHealth(30);
    System.out.println("Hunt finished");

  }

  public static void heal(){//@Lingel937
    Game.s_mPlayerCharakter.changeHealth(-30);
    System.out.println("Heal finished " +  "Your current helth is: " + Game.s_mPlayerCharakter.getHealth());

  }

    public static void help(){//@Lingel937
        System.out.println("Commands: ");
        System.out.println("Hunt");
        System.out.println("Heal");
        System.out.println("Help");
        System.out.println("Exit");
    }

    public static void Profile(){//@Lingel937
        System.out.println("Your Name: " + Game.s_mPlayerCharakter.getName());
        System.out.println("Your Class: " + Game.s_mPlayerCharakter.getCharakterType());
        System.out.println("Your Health: " + Game.s_mPlayerCharakter.getHealth());
        System.out.println("Your Level: " + Game.s_mPlayerCharakter.getLevel());
    }

    public static void Travel(){
    System.out.println("where do you want to go?");
    System.out.println("1 - Forest");
    System.out.println("2 - Mountain");
    System.out.println("3 - Lake");
    System.out.println("4 - Desert");
    System.out.println("5 - City");
    System.out.println("6 - Village");
    System.out.println("7 - Cave");
    System.out.println("8 - River");
    System.out.println("9 - Swamp");
    int nTravelLocation = new Scanner(System.in).nextInt();
    switch(nTravelLocation){
        case 1:
            System.out.println("You are now in the Forest");
            break;
        case 2:
            System.out.println("You are now in the Mountain");
            break;
        case 3:
            System.out.println("You are now in the Lake");
            break;
        case 4:
            System.out.println("You are now in the Desert");
            break;
        case 5:
            System.out.println("You are now in the City");
            break;
        case 6:
            System.out.println("You are now in the Village");
            break;
        case 7:
            System.out.println("You are now in the Cave");
            break;
        case 8:
            System.out.println("You are now in the River");
            break;
        case 9:
            System.out.println("You are now in the Swamp");
            break;
        default:
            System.out.println("Choose a valid Location");
            break;
    }
}
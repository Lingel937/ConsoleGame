import java.util.Scanner;

public class Game {
    private static boolean s_bIsGameRunnig;


    public static void go(){
        Scanner scan = new Scanner(System.in);
        s_bIsGameRunnig = true;
        
        
        while(s_bIsGameRunnig) {
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
}

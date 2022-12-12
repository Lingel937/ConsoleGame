package lib;
import java.io.*;

public class Lib {

    public static int convertStrToInt(String input){
        int value = 0;
        try {
            value = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("");
        }
        return value;



    }

    public static double convertStrToDoub(String input){
        double value = 0.0;
        try {
            value = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("");
        }
        return value;
    }
}
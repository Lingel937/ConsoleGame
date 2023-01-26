package lib;


public class Lib {

    public static int convertStrToInt(String input){
        int value = 0;
        try {
            value = Integer.parseInt(input);
        } catch (NumberFormatException e) {
        }
        return value;



    }
    public static double convertStrToDoub(String input){
        double value = 0.0;
        try {
            value = Double.parseDouble(input);
        } catch (NumberFormatException e) {
        }
        return value;
    }
    public static String addCharToString(int operation, int iterations,String inputString1, String inputString2){
        String outPutString = null;
        if(iterations > 0){
            if(operation == 1){  
                for(int i = 0; i < iterations; i++){
                    inputString1 = inputString1 + inputString2;
                }
                outPutString = inputString1;
            }else if(operation == -1){
                for(int i = 0; i < iterations; i++){
                    inputString1 = inputString2 + inputString1;
                }
                outPutString = inputString1;
            }else{
                System.out.println("Char concatination failed!!!");
            }
        }else if(iterations == 0){
            outPutString = inputString1;
        }
        return outPutString;
    }
}
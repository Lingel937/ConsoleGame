package Characters;
import Items.*;
import Characters.PlayerCharacter;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class PlayerCharacterFileIO {
    public static void savePlayerCharacter(PlayerCharacter playerCharacter) {
        try {
            boolean bFileExists = false;
            File path = new File("./Minigame/Characters/Players/");
            String[] sFileNames = path.list();
            for (int i = 0; i < sFileNames.length; i++) {
                if (sFileNames[i].equals(playerCharacter.getName() + ".txt")) {
                    bFileExists = true;
                }
            }
            if(!bFileExists){
                File file = new File("./Minigame/Characters/Players/" + playerCharacter.getName() + ".txt");
                file.createNewFile();
            }else{
                File file = new File("./Minigame/Characters/Players/" + playerCharacter.getName() + ".txt");
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(playerCharacter.getName() + ";" + playerCharacter.getHealth() + ";" + playerCharacter. + ";" + playerCharacter.getDefense() + ";" + playerCharacter.getLevel() + ";" + playerCharacter.getExperience() + ";" + playerCharacter.getGold() + ";" + playerCharacter.getInventory().getInventorySize() + ";");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
    public static PlayerCharacter loadPlayerCharacter(String sCharacterName) {
        try {
            File file = new File("./Minigame/Characters/Players/" + sCharacterName + ".txt");

        } catch (Exception e) {
            
        }
        return 
    }
}

package Characters;
import Items.*;
import Characters.PlayerCharacter;
import Characters.Inventory;
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
                if (sFileNames[i].equals(playerCharacter.getName() + "/")) {
                    bFileExists = true;
                }
            }
            if(!bFileExists){
                File playerFolder = new File("./Minigame/Characters/Players/" + playerCharacter.getName() + "/");
                playerFolder.mkdir();
                File inventoryFile = new File("./Minigame/Characters/Players/" + playerCharacter.getName() + "/" +"inventory"+ ".txt");
                File characterFile = new File("./Minigame/Characters/Players/" + playerCharacter.getName() + "/" +"character"+ ".txt");
                inventoryFile.createNewFile();
                characterFile.createNewFile();

            }
            File characterFile = new File("./Minigame/Characters/Players/" + playerCharacter.getName() + "/character.txt");
            FileWriter characterFileWriter = new FileWriter(characterFile);
           
            characterFileWriter.write(
                playerCharacter.getName() + ";" + 
                playerCharacter.getCharacterType() + ";" + 
                playerCharacter.getLevel() + ";" + 
                playerCharacter.getHealth() + ";" + 
                playerCharacter.getMaxHealth() + ";" + 
                playerCharacter.getExperiencePoints() + ";" + 
                playerCharacter.getMoney() + ";" + 
                playerCharacter.getInventorySize()+
                playerCharacter.getMoney()+"\n"
                );
            characterFileWriter.close();
            File inventoryFile = new File("./Minigame/Characters/Players/" + playerCharacter.getName() + "/inventory.txt");
            FileWriter inventoryFileWriter = new FileWriter(inventoryFile);
            for (int i = 0; i < playerCharacter.getInventory().size(); i++) {
                    System.out.println("YAya"+i);
                    inventoryFileWriter.write(
                    playerCharacter.getPlayerInventory().getInventory().get(i).getID() + ";" +
                    playerCharacter.getPlayerInventory().getInventory().get(i).getName() + ";" +
                    playerCharacter.getPlayerInventory().getInventory().get(i).getType() + ";" +
                    playerCharacter.getPlayerInventory().getInventory().get(i).getCategory() + ";" +
                    playerCharacter.getPlayerInventory().getInventory().get(i).getLvl() + ";" +
                    playerCharacter.getPlayerInventory().getInventory().get(i).getDamage() + ";" +
                    playerCharacter.getPlayerInventory().getInventory().get(i).getDamageFactor() + ";" +
                    playerCharacter.getPlayerInventory().getInventory().get(i).getNutritonalValue() + ";" +
                    playerCharacter.getPlayerInventory().getInventory().get(i).getNumberOfItems() + ";" +"\n"
                    );
            }
            inventoryFileWriter.close();
            inventoryFile = null;
            
            
        } catch (Exception e) {
        }
        System.out.println("Everything saved!\n");
        
    }
    public static PlayerCharacter loadPlayerCharacter(String sCharacterName) {
        ArrayList<String> sInventoryData = new ArrayList<String>();
        String[] sCharacterData;
        Inventory inventory = new Inventory();
        PlayerCharacter player;
        try {
            
            File inventoryFile = new File("./Minigame/Characters/Players/" + sCharacterName + "/inventory.txt");
            Scanner inventoryFileScanner = new Scanner(inventoryFile);
            while(inventoryFileScanner.hasNextLine()){
                sInventoryData.add(inventoryFileScanner.nextLine());
            }
            if(inventory.getNumberOfItems() > 0){ 
                for (int i = 0; i < sInventoryData.size(); i++) {
                    String[] sItemData = sInventoryData.get(i).split(";");
                    for(int j = 0; j < sItemData.length; j++){
                        sItemData[j] = sItemData[j].replace(" ", "");
                    }
                    inventory.addItem(new Item(
                        Integer.valueOf(sItemData[0]),
                        sItemData[1],
                        sItemData[2],
                        sItemData[3],
                        Integer.valueOf(sItemData[4]),
                        Double.valueOf(sItemData[5]),
                        Double.valueOf(sItemData[6]),
                        Integer.valueOf(sItemData[7]),
                        Integer.valueOf(sItemData[8]),
                        Integer.valueOf(sItemData[9])
                    ));
                }
                sInventoryData.clear();
            }
            inventoryFileScanner.close();

            File characterFile = new File("./Minigame/Characters/Players/" + sCharacterName + "/character.txt");
            Scanner characterFileScanner = new Scanner(characterFile);
            sCharacterData = characterFileScanner.nextLine().split(";");
            characterFileScanner.close();
            for(int k = 0; k < sCharacterData.length; k++){
                sCharacterData[k] = sCharacterData[k].replace(" ", "");
            }
            player = new PlayerCharacter(
                sCharacterData[0],
                Integer.valueOf(sCharacterData[4]),
                Integer.valueOf(sCharacterData[7]),
                sCharacterData[1],
                Integer.valueOf(sCharacterData[2]),
                Integer.valueOf(sCharacterData[3]),
                Integer.valueOf(sCharacterData[5]),
                Integer.valueOf(sCharacterData[6]),
                inventory
                );
            return player;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static String[] getPlayerCharacterNames(){
        File path = new File("./Minigame/Characters/Players/");
        String[] sFileNames = path.list();
        path=null;
        return sFileNames;
    }
}

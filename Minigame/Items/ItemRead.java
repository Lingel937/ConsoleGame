package Items;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ItemRead {

	public static int getNumberOfLinesOfItemFile() {
		try {
			File itemReadFile = new File("./Minigame/Items/Itemz.txt");
			Scanner itemRead = new Scanner(itemReadFile);
			ArrayList<String> singleLine = new ArrayList<String>();

			while (itemRead.hasNextLine()) {
				singleLine.add(itemRead.nextLine());
			}

			int int_numberOfLines = singleLine.size();
			itemRead.close();
			singleLine.clear();
			return int_numberOfLines;
		} catch (FileNotFoundException e) {
			System.out.println("You need an 'Items' file.");
			e.printStackTrace();
			return 1;

		}
	}
	public static String[] getItemProperties(int int_line){
		try{
			String[] itemProperties;

			File itemReadFile = new File("./Minigame/Items/Itemz.txt");

			Scanner itemRead = new Scanner(itemReadFile);
			ArrayList<String> singleLine = new ArrayList<String>();
			
			while(itemRead.hasNextLine()){
				singleLine.add(itemRead.nextLine());
			}
			itemRead.close();
			itemProperties = singleLine.get(int_line-1).split(";");
			singleLine.clear();
			for (int i = 0; i < itemProperties.length; i++) {
				itemProperties[i]= itemProperties[i].replace(" ", "");
			}
			return itemProperties;
		}
		catch(FileNotFoundException e){
			String[] error = {"Error"};
			System.out.println("You need an 'Items' file.");
			e.printStackTrace();
			return error;
		}
	}
}

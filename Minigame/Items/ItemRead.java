package Items;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ItemRead {

<<<<<<< Updated upstream
	public static int getNumberOfLinesOfItemFile(){
		try{
		File itemReadFile = new File("/home/maulie5/Workspace/School/Informatic/ConsoleGame/Minigame/Items/Itemz.txt");
		Scanner itemRead = new Scanner(itemReadFile);
		ArrayList<String> singleLine = new ArrayList<String>();
		
		while(itemRead.hasNextLine()){
			singleLine.add(itemRead.nextLine());
=======
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

>>>>>>> Stashed changes
		}

		int int_numberOfLines = singleLine.size();
		itemRead.close();
		singleLine.clear();
		return int_numberOfLines;
	}
	catch(FileNotFoundException e){
		System.out.println("You need an 'Items' file.");
		e.printStackTrace();
		return 1;
	}

	}
	public static String[] getItemProperties(int int_line){
		try{
			String[] itemProperties;
<<<<<<< Updated upstream
			File itemReadFile = new File("/home/maulie5/Workspace/School/Informatic/ConsoleGame/Minigame/Items/Itemz.txt");
=======
			File itemReadFile = new File("./Minigame/Items/Itemz.txt");

>>>>>>> Stashed changes
			Scanner itemRead = new Scanner(itemReadFile);
			ArrayList<String> singleLine = new ArrayList<String>();
			
			while(itemRead.hasNextLine()){
				singleLine.add(itemRead.nextLine());
			}
			itemRead.close();
			itemProperties = singleLine.get(int_line).split(";");
			singleLine.clear();
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

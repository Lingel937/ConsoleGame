package Items;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ItemRead {

	public static int getNumberOfLinesOfItemFile(){
		try{
		File itemReadFile = new File("C:\\Users\\Valentin\\Documents\\Schule\\E phase\\Praktische Informatik\\Minigame\\Items\\Items.txt");
		Scanner itemRead = new Scanner(itemReadFile);
		ArrayList<String> singleLine = new ArrayList<String>();
		
		while(itemRead.hasNextLine()){
			singleLine.add(itemRead.nextLine());
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
			File itemReadFile = new File("\"C:\\Users\\Valentin\\Documents\\Schule\\E phase\\Praktische Informatik\\Minigame\\Minigame\\Items\\Itemz.txt\"");
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

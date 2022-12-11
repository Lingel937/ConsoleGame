import java.io.*;
import java.util.Scanner;
class ItemRead{
	public String itemRead(){

		String[] itemString;
			File itemRead = new File("ConsoleGame/Minigame/Items/Items.txt");
			BufferdReader buffer = new BufferdReader(new FileReader(itemRead));
			for(int i = 0;i < 4; ++i ){
				buffer.readLine();	
			}
			String line = buffer.readLine();
			System.out.println(line);
	} 
}

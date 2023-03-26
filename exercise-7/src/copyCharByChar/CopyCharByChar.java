package copyCharByChar;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyCharByChar {
	
	public static void main(String[] args) {
		
		try {
			File readFile = new File("./src/copyCharByChar/read.txt");
			FileReader fileReader = new FileReader(readFile);
		
			File writtenFile = new File("./src/copyCharByChar/write.txt");
			FileWriter fileWriter = new FileWriter(writtenFile);
			
			int character;
			
			while((character = fileReader.read()) != -1) {
				fileWriter.write(character);
			}
			System.out.println("success");
		
			
			fileReader.close();
			fileWriter.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

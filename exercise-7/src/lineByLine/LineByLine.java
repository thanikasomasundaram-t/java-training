package lineByLine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class LineByLine {
	
	public static void main(String[] args) {
		
		try {
			File readFile = new File("./src/lineByline/index.txt");
			FileReader fileReader = new FileReader(readFile);
			BufferedReader bfRead = new BufferedReader(fileReader);
		
			File writtenFile = new File("./src/lineByline/write.txt");
			FileWriter fileWriter = new FileWriter(writtenFile);
			BufferedWriter bfWrite = new BufferedWriter(fileWriter);
			
			String line;
			
			while((line = bfRead.readLine()) != null) {
				System.out.println(line);
				bfWrite.write(line);
				bfWrite.newLine();
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

package fileviewer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class fileViewer {
	public static void main(String[] args){
		
		try {
			File file = new File("/Users/thanikasomasundaram/eclipse-workspace/exercise-7/src/fileviewer/read");
			
			FileReader fileReader = new FileReader(file);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			int character;
			
			while((character = bufferedReader.read()) != -1) {
				System.out.print(character);
			}
			
			bufferedReader.close();
			fileReader.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

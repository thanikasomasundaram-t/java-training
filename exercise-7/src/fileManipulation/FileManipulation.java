package fileManipulation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileManipulation {
	public static void main(String[] args) throws IOException {
		try {
			System.out.println("yi");
			File file = new File("./src/fileManipulation/index");
			File fileToBeRenamed = new File("/Users/thanikasomasundaram/eclipse-workspace/exercise-7/src/fileManipulation/index");
			FileReader fileReader = new FileReader(file);
			int c;
			System.out.println("yi");
			System.out.println("file length: " + fileToBeRenamed.length());
			
			while((c = fileReader.read()) !=-1) {
				System.out.print((char)c);
			}
			System.out.println();
			
			if(file.exists() && file.renameTo(fileToBeRenamed)) {
				System.out.println("renamed");
			}
			
//			if(file.exists() && file.delete()) {
//				System.out.println(file + "deleted");	
//			}

			

			
			fileReader.close();
		}
		catch(Exception e) {
			
		}
	}
}

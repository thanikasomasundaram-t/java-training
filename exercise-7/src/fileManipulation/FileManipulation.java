package fileManipulation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileManipulation {
	public static void main(String[] args) throws IOException {
		try {
			File file = new File("./src/fileManipulation/index");
			File fileToBeRenamed = new File("./src/fileManipulation/index");
			FileReader fileReader = new FileReader(file);
			int character;
			
			System.out.println("file length: " + fileToBeRenamed.length());

			while ((character = fileReader.read()) != -1) {
				System.out.print((char) character);
			}
			System.out.println();

			if (file.exists() && file.renameTo(fileToBeRenamed)) {
				System.out.println("renamed");
			}

//			if(file.exists() && file.delete()) {
//				System.out.println(file + "deleted");	
//			}

			fileReader.close();
		} catch (Exception e) {

		}
	}
}

package objectReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectReadWrite {
	public static void main(String[] args) {
		Date date = new Date();
		
		try {
			File file = new File("./src/objectReadWrite/read.txt");
			FileOutputStream fileoutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileoutputStream);	
			objectOutput.writeObject(date);
			
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInput = new ObjectInputStream(fileInputStream);
			System.out.println((Date) objectInput.readObject());
			
			objectOutput.close();
			objectInput.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

		
		
	}
}

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
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);	
			objectOutputStream.writeObject(date);
			
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			System.out.println((Date) objectInputStream.readObject());
			
			objectOutputStream.close();
			objectInputStream.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

package imagecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopy {
	public class ImageToByteArray {	
	   public static void main(String args[]) throws Exception{   
		   File file = new File("./src/imagecopy/shiv.jpeg");
		   FileInputStream fileInputStream = new FileInputStream(file);
		   
		   file = new File("./src/imagecopy/copyshiv.jpeg");
		   FileOutputStream fileOutputStream = new FileOutputStream(file);
		   
		   int byteValue;
		   
		   while((byteValue = fileInputStream.read()) != -1) {
			   fileOutputStream.write(byteValue);
		   }
	      
		   fileInputStream.close();
		   fileOutputStream.close();
		   System.out.println("success");
	   }
	}
}

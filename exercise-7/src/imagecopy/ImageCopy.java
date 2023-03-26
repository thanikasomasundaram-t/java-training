package imagecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopy {

	public class ImageToByteArray {
		
	   public static void main(String args[]) throws Exception{
		   
		   File readImg = new File("./src/imagecopy/shiv.jpeg");
		   FileInputStream fileInputStream = new FileInputStream(readImg);
		   
		   File outImg = new File("./src/imagecopy/copyshiv.jpeg");
		   FileOutputStream fileoutputStream = new FileOutputStream(outImg);
		   
		   int readByte;
		   
		   while((readByte = fileInputStream.read()) != -1) {
			   fileoutputStream.write(readByte);
		   }
	      
		   fileInputStream.close();
		   fileoutputStream.close();
		   System.out.println("success");
	   }
	}
}

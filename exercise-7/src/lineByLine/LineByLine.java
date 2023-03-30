package lineByLine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class LineByLine {
	public static void main(String[] args) {
		try {
			File file = new File("./src/lineByline/index.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			file = new File("./src/lineByline/write.txt");
			FileWriter fileWriter = new FileWriter(file);

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				fileWriter.write(line+"\n");
			}
			System.out.println("success");

			fileReader.close();
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

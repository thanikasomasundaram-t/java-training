package listfiles;

import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		String path = "/Users/thanikasomasundaram/Downloads";
		File file = new File(path);

		if (file.exists() && file.isDirectory()) {
			File files[] = file.listFiles();
			System.out.println("Total files " + files.length + "\n\n");
			int index = 0;

			while (index < files.length && files[index].exists()) {
				if (files[index].isFile()) {
					System.out.println(index + " File - " + files[index].getName());
				}
				else {
					System.out.println(index + " Directory > " + files[index].getName());
				}
				index++;
			}
		}
	}
}

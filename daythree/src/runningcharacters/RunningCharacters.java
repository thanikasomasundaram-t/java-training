package runningcharacters;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunningCharacters {

	public static void main(String[] args) {
		RunningCharacters rc = new RunningCharacters();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			try {
				int inputRead = bufferedReader.read();
				rc.display(inputRead);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public void display(int character) throws NonAlphabeticException {
		if(!Character.isAlphabetic(character) && character != 10)
			throw new NonAlphabeticException();
		else {
			System.out.println((char)character);
		}
	}
}

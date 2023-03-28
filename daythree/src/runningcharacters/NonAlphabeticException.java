package runningcharacters;

public class NonAlphabeticException extends Exception {


	public String toString() {
		return "Exception:  You entered a non-alphabetic character";
	}
}

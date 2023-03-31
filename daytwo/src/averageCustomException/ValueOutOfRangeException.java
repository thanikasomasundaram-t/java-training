package averageCustomException;

public class ValueOutOfRangeException extends Exception {
	ValueOutOfRangeException() {
		
	}
	
	public String toString() {
		return "ValueOutOfRange => Just enter value between range [0, 100]";
	}
}

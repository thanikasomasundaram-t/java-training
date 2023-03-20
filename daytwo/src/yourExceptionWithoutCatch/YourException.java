package yourExceptionWithoutCatch;

public class YourException {

	public static void main(String[] args) throws NotRedmiException {
		Sample s = new Sample();
		try {
			s.method("redmi");
		}
		finally {
			System.out.println("finally");
		}

	}

}

class NotRedmiException extends Exception {
	
	NotRedmiException() {
		
	}
}

class Sample {
	
	public void method(String mobile) throws NotRedmiException {

		if(mobile != "redmi") {
			throw new NotRedmiException();
		}
	}
}
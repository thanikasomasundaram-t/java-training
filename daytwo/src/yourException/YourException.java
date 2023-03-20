package yourException;

public class YourException {

	public static void main(String[] args) {
		try {
			
			String mobile = "redmi";
			if(mobile != "redmi") {
				throw new NotRedmiException();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

class NotRedmiException extends Exception {
	
	NotRedmiException() {
		
	}
}

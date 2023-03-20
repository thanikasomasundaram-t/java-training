package derivedClass;

public class DerivedClassException {

	public static void main(String[] args) {
		new Derived();

	}

}


class Base {
	int a;
	
	Base() {
		a = 10/0;
	}
	
}

class Derived extends Base {

	Derived() {
		System.out.println("in derived");
		try {
			
		}
		catch(Exception e) {
			
		}
	}
}
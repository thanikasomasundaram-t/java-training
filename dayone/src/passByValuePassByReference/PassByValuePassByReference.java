package passByValuePassByReference;


class ObjectClass {
	int intVariable = 10;
}

public class PassByValuePassByReference {
	public static void main(String[] args) {
		int intVariable = 5;
		float floatVariable = 5f;
		char charVariable = '0';
		byte byteVariable = 5;
		short shortVariable = 5;
		long longVariable = 5l;
		double doubleVariable = 5d;
		boolean booleanVariable = true;

		System.out.println("Before calling PassByValue");
		Print(intVariable, floatVariable, charVariable, byteVariable, shortVariable, longVariable, doubleVariable, booleanVariable);

		PassByValue(intVariable, floatVariable, charVariable, byteVariable, shortVariable, longVariable, doubleVariable, booleanVariable);

		System.out.println("After calling PassByValue");
		Print(intVariable, floatVariable, charVariable, byteVariable, shortVariable, longVariable, doubleVariable, booleanVariable);


		int[] array = {1, 2, 3, 4, 5};
		ObjectClass obj = new ObjectClass();

		System.out.println("Before calling PassByReference");
		for(int element: array) {
			System.out.println(element);
		}
		System.out.println("object " + obj.intVariable);

		PassByReference(array, obj);

		System.out.println("After calling PassByReference");
		for(int element: array) {
			System.out.println(element);
		}
		System.out.println("object " + obj.intVariable);
 

	}

	public static void Print(int intVariable, float floatVariable, char charVariable, byte byteVariable, short shortVariable, long longVariable, double doubleVariable, boolean booleanVariable) {
		
		System.out.println(intVariable);
		System.out.println(floatVariable);
		System.out.println(charVariable);
		System.out.println(byteVariable);
		System.out.println(shortVariable);
		System.out.println(longVariable);
		System.out.println(doubleVariable);
		System.out.println(booleanVariable);
	}

	public static void PassByValue(int intVariable, float floatVariable, char charVariable, byte byteVariable, short shortVariable, long longVariable, double doubleVariable, boolean booleanVariable) {
		intVariable = 10;
		floatVariable =10f;
		charVariable = '1';
		byteVariable = 10;
		shortVariable = 10;
		longVariable = 10l;
		doubleVariable = 10d;
		booleanVariable = false;

		System.out.println("in function PassByValue");
		Print(intVariable, floatVariable, charVariable, byteVariable, shortVariable, longVariable, doubleVariable, booleanVariable);
	}

	public static void PassByReference(int[] array, ObjectClass obj) {
		for(int index = 0; index < array.length; index++) {
			array[index] += 10;
		}

		obj.intVariable = 50;

		System.out.println("In PassByReference");
		for(int element: array) {
			System.out.println(element);
		}
		System.out.println("object " + obj.intVariable);
	}

}

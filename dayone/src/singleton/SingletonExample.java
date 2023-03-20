package singleton;

class Singleton {
	static Singleton s = null;

	public static Singleton getSingleton() {
		if(s == null) {
			s = new Singleton();
			System.out.println("Singleton object created");
		}
		return s;
	}
}

public class SingletonExample {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		
		System.out.println();
		System.out.println();

		System.out.println(s1 + "\t" + s2);

	}

}

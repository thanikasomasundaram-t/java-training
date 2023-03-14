package constructor;

public class Constructor {

	public static void main(String[] args) {
		new C();
	}

}

class A {
	A() {
		System.out.println("A Constructor is called");
	}
}

class B {
	B() {
		System.out.println("B constructor is called");
	}
}

class C extends A{
	B b = new B();
}



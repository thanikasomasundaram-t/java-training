package areaAndVolume;

public class AreaAndVolume {

	public static void main(String[] args) {

		System.out.println("\n\n\nCircle =>\n\n\n");
		
		Circle circleObj = new Circle(10);
		circleObj.calcArea();
		circleObj.perimeter();

		System.out.println("\n\n\nSquare =>\n\n\n");
		
		Square squareObj = new Square(10);
		squareObj.calcArea();
		squareObj.perimeter();

		System.out.println("\n\n\nTraingle =>\n\n\n");
		
		Triangle triangleObj = new Triangle(10 ,10, 10);
		triangleObj.calcArea();
		triangleObj.perimeter();

		System.out.println("\n\n\nSphere =>\n\n\n");
		
		Sphere sphereObj = new Sphere(15);
		sphereObj.calcArea();
		sphereObj.perimeter();
		sphereObj.calcVolume();
		sphereObj.surfaceArea();

		System.out.println("\n\n\nCuboid =>\n\n\n\n");
		
		Cuboid cuboidObj = new Cuboid(15);
		cuboidObj.calcArea();
		cuboidObj.perimeter();
		cuboidObj.calcVolume();
		cuboidObj.surfaceArea();

	}

}


interface CalcArea {
	void calcArea();
}

interface CalcVolume {
	void calcVolume();
}

class Circle implements CalcArea {

	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void calcArea() {
		System.out.println("Area = " + Math.PI * radius * radius);
	}

	void perimeter() {
		System.out.println("Perimeter = " + 2 * Math.PI * radius);
	}
}

class Square implements CalcArea {

	int side;

	Square(int side) {
		this.side = side;
	}
	
	@Override
	public void calcArea() {
		System.out.println("Area = " + side * side);
	}

	void perimeter() {
		System.out.println("Perimeter" + 4 * side);
	}
}

class Triangle implements CalcArea {
	int height, length, breadth;

	Triangle(int height, int length, int breadth) {
		this.height = height;
		this.breadth = breadth;
		this.length = length;
	}

	@Override
	public void calcArea() {
		double s = (height + length + breadth)/2;
		double area = Math.sqrt(s * ((s - height)*(s - breadth)*(s - length)));

		System.out.println("Area = " + area);
	}

	void perimeter() {
		System.out.println("Perimeter" + (height + breadth + length));
	}
}

class Sphere extends Circle implements CalcVolume {

	Sphere(int radius) {
		super(radius);
	}

	@Override
	public void calcVolume() {
		System.out.println("Volume = " + ((4/3) * Math.PI  * radius * radius * radius));
	}

	void surfaceArea() {
		System.out.println("Surface Area = " + (4 * Math.PI  * radius * radius));
	}
	
}

class Cuboid extends Square implements CalcVolume {
	
	Cuboid(int side) {
		super(side);
	}

	@Override
	public void calcVolume() {
		System.out.println("Volume = " + (side * side * side));
	}

	void surfaceArea() {
		System.out.println("Surface Area = " + (6 * side * side));
	}	
}

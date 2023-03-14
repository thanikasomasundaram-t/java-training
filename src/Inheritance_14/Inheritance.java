package Inheritance_14;

public class Inheritance {

	public static void main(String[] args) {
		
		Result obj = new Result("john", 11, 500, 300, 100);
		obj.CalculateTotalMarks();
	}

}

class Student {
	String name = "aa";
	int rollNo;
}

class Exam extends Student {
	int math = 500;
	int science = 200;
	int language;
}

class Result extends Exam {
	int totalMarks;
	Result(String name, int rollNo, int math, int science, int language) {
		this.name = name;
		this.rollNo = rollNo;
		this.math = math;
		this.science = science;
		this.language = language;
	}
	
	public void CalculateTotalMarks() {
		totalMarks = math + science + language;
		System.out.println("Total Marks: " + totalMarks);
	}
}

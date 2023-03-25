package bridge;

public class BridgePattern {
	public static void main(String[] args) {
		TrainingRoom englishTrainingRoom = new JavaTraining(new EnglishMediumInstructor());
		englishTrainingRoom.teacher();
		
		TrainingRoom tamilTrainingRoom = new UiTraining(new TamilMediumInstructor());
		tamilTrainingRoom.teacher();
	}
}

abstract class Instructor {

	abstract void teach();
}

class TamilMediumInstructor extends Instructor {

	@Override
	void teach() {
		System.out.println("I teach in Tamil Language");
	}
}

class EnglishMediumInstructor extends Instructor {
	
	@Override
	void teach() {
		System.out.println("I teach in English Language");
	}
}

abstract class TrainingRoom {
	Instructor instructor;
	
	TrainingRoom(Instructor instructor) {
		this.instructor = instructor;
	}
	
	abstract public void teacher();
}

class JavaTraining extends TrainingRoom {
	
	JavaTraining(Instructor instructor) {
		super(instructor);
		System.out.println("Welcome to Java training");
	}

	@Override
	public void teacher() {
		instructor.teach();
	}
	
}

class UiTraining extends TrainingRoom {
	
	UiTraining(Instructor instructor) {
		super(instructor);
		System.out.println("Welcome to UI training");
	}

	@Override
	public void teacher() {
		instructor.teach();
	}
	
}

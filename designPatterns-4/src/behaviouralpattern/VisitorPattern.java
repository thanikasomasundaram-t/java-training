package behaviouralpattern;

public class VisitorPattern {
	public static void main(String[] args) {
		Client client = new Client();
		TourPlace tourPlace = new Japan();
		client.chooseDestination(tourPlace);
	}
}

class Client {
	Client() {
		System.out.println("i am client");
	}

	public void chooseDestination(TourPlace tourPlace) {
		Visit visit = new Details();
		tourPlace.acceptDestination(visit);
	}
}

abstract class TourPlace {
	public abstract void acceptDestination(Visit visit);

}

class SwitzerLand extends TourPlace {

	@Override
	public void acceptDestination(Visit visit) {
		System.out.println("You are opted for Switzerland");
		visit.visit(this);
		
	}

}

class Paris extends TourPlace {

	@Override
	public void acceptDestination(Visit visit) {
		System.out.println("You are opted for Paris");
		visit.visit(this);

	}

}

class Japan extends TourPlace {

	@Override
	public void acceptDestination(Visit visit) {
		System.out.println("You are opted for Japan");
		visit.visit(this);

	}

}

interface Visit {
	public void visit(SwitzerLand switzerland);
	public void visit(Paris paris);
	public void visit(Japan japan);
}

class Details implements Visit {

	@Override
	public void visit(SwitzerLand switzerland) {
		System.out.println("It is famous for its mountains, valleys and amazing scenic views");
		
	}

	@Override
	public void visit(Paris paris) {
		System.out.println("It is called the city of love");
		
	}

	@Override
	public void visit(Japan japan) {
		System.out.println("It is famous for its futuristic technology and manga");
		
	}
	
}





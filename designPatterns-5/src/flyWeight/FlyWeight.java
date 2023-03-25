package flyWeight;

import java.util.HashMap;

public class FlyWeight {
	public static void main(String[] args) {
		for(int noOfPeople = 0; noOfPeople <= 50; noOfPeople++) {
			People people= new PeopleFactory().getRandomPeople(noOfPeople%2 == 0? "Indian" : "American");
			people.setPreferedFood(noOfPeople%3 == 0? "Rice" : "Corn");
			
			System.out.println("-----------------------");
			people.details();
			System.out.println("-----------------------");
		}
	}
}

abstract class People {
	abstract public void setPreferedFood(String food);
	abstract public void details();
}

class American extends People {
	final String language;
	String preferedFood = "defaultFood";

	American() {
		language = "English";
	}

	@Override
	public void setPreferedFood(String food) {
		preferedFood = food;
		
	}

	@Override
	public void details() {
		System.out.println("Hi I am an American NPC\nI speak " + language + " and my prefered Food is " + preferedFood);
	}
	
}

class Indian extends People {
	final String language;
	String preferedFood = "defaultfood";
	
	Indian() {
		language = "Tamil";
	}

	@Override
	public void setPreferedFood(String food) {
		preferedFood = food;		
	}

	@Override
	public void details() {
		System.out.println("Hi I am an Indian NPC\nI speak " + language + " and my prefered Food is " + preferedFood);
	}
}

class PeopleFactory {
	
	HashMap<String, People> peopleList = new HashMap<>();
	
	public People getRandomPeople(String type) {
		
		People people = null;
		
		if(peopleList.containsKey(type)) {
			people = peopleList.get(type);
			return people;
		}
		switch(type) {
		case "American":
			people = new American();
			break;
		case "Indian":
			people = new Indian();
			break;
		default: System.out.println("Type not available");
		}
		
		peopleList.put(type, people);
		
		return people;
	}
}



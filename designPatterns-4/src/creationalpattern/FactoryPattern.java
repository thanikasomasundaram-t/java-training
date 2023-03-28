package creationalpattern;

import java.util.Scanner;

public class FactoryPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("choose you shop\nchicken\nmutton");
        String choice = sc.nextLine();
        //input validation
        try {
        	if(choice != "mutton" || choice != "chicken") {
        		throw new WrongInputException();
        	}
            BiriyaniFactory biriyaniFactoryRR = new RRBiriyani();
            //choose required food to manufacture from factory pattern
            biriyaniFactoryRR.chooseBiriyani(choice);
            biriyaniFactoryRR.placeOrder();
            
            BiriyaniFactory biriyaniFactorySS = new SSBiriyani();
            
            //choose required food to manufacture from factory pattern
            biriyaniFactorySS.chooseBiriyani(choice);
            biriyaniFactorySS.placeOrder();
        }
        catch(WrongInputException e) {
        	System.out.println("Enter valid input");
        }
        finally {
        	sc.close();
        }
    }
}

abstract class BiriyaniFactory {
    Biriyani biriyani;

    abstract public void chooseBiriyani(String type);

    public void placeOrder() {
        biriyani.getBiriyani();
    }
}

class SSBiriyani extends BiriyaniFactory {

    SSBiriyani() {
        System.out.println("Thank you for choosing SS Biriyani");
    }
    // SS biriyani can create only ss style chicken and mutton biriyani from factory
    @Override
    public void chooseBiriyani(String type) {
        if(type.equals("chicken")) {
            this.biriyani = new SSChickenBiriyani();
        }
        else if(type.equals("mutton")) {
            this.biriyani = new SSMuttonBiriyani();
        }
    }
}

class RRBiriyani extends BiriyaniFactory {

    RRBiriyani() {
        System.out.println("Thank you for choosing RR Biriyani");
    }
    // RR biriyani can create only RR style chicken and mutton biriyani from factory
    
    @Override
    public void chooseBiriyani(String type) {
        if(type.equals("chicken")) {
            biriyani = new RRChickenBiriyani();
        }
        else if(type.equals("mutton")) {
            biriyani = new RRMuttonBiriyani();
        }
    }
}

abstract class Biriyani {
    abstract public void getBiriyani();
}

class SSChickenBiriyani extends Biriyani {
	//objects are created from here...
    @Override
    public void getBiriyani() {
        System.out.println("SS Biriyani's special chicken biriyani is ready to serve");
    }

}

class SSMuttonBiriyani extends Biriyani {
	// objects are created from here...
    @Override
    public void getBiriyani() {
        System.out.println("SS Biriyani's special mutton biriyani is ready to serve");

    }

}

class RRChickenBiriyani extends Biriyani {
	//objects are created from here...
    @Override
    public void getBiriyani() {
        System.out.println("RR Biriyani's special chicken biriyani is ready to serve");
    }

}

class RRMuttonBiriyani extends Biriyani {
	//objects are created from here...
    @Override
    public void getBiriyani() {
        System.out.println("RR Biriyani's special mutton biriyani is ready to serve");
    }
    
}





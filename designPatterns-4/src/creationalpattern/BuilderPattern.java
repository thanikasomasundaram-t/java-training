package creationalpattern;

public class BuilderPattern {
    public static void main(String[] args) {
        new Burger.BuildBurger()
            .makeBun(new Bun())
            .makeOnion(new Onion())
            .makeTomato(new Tomato())
            .makeChicken(new Chicken())
            .makeOnion(new Onion())
            .makeTomato(new Tomato())
            .makeBun(new Bun())
            .build();
    }    
}

class Burger {
    Bun bun;
    Tomato tomato;
    Onion onion;
    Chicken chicken;
    Potato potato;
    //defining burger instances given from buildBurger
    Burger(Bun bun, Tomato tomato, Onion onion,  Chicken chicken, Potato potato) {
        this.bun = bun;
        this.onion = onion;
        this.chicken = chicken;
        this.potato = potato;
        System.out.println("Your Burger is ready");
    }

    // defining all burger instance
    static class BuildBurger {
        Bun bun;
        Tomato tomato;
        Onion onion;
        Chicken chicken;
        Potato potato;
        //defining bun instance 
        public BuildBurger makeBun(Bun bun) {
            this.bun = bun;
            return this;
        }
        //defining tomato instance 
        public BuildBurger makeTomato(Tomato tomato) {
            this.tomato = tomato;
            return this;
        }
        //defining onion instance 
        public BuildBurger makeOnion(Onion onion) {
            this.onion = onion;
            return this;
        }
        //defining chicken instance 
        public BuildBurger makeChicken(Chicken chicken) {
            this.chicken = chicken;
            return this;
        }
        //defining potato instance variable
        public BuildBurger makePotato(Potato potato) {
            this.potato = potato;
            return this;
        }

//        calling super constructor to define the instance variable
        public Burger build() {
            return new Burger(bun, tomato, onion, chicken, potato);
        }
    }
}

class Bun {
    Bun() {
        System.out.println("Bun is stacked");
    }
}

class Tomato {
    Tomato() {
        System.out.println("Tomato is staked");
    }
}

class Onion {
    Onion() {
        System.out.println("Onion is stacked");
    }
}

class Chicken {
    Chicken() {
        System.out.println("Chicken is stacked");
    }
}

class Potato {
    Potato() {
        System.out.println("Potato is stacked");
    }
}





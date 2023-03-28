package behaviouralpattern;

public class StrategyPattern {
    public static void main(String[] args) {
    	//Ramnan using weather report to get various weather from algorithms
        Ramanan ramanan = new Ramanan();
        ramanan.getTypeOfWeather();
        ramanan.setTypeOfWeather(new Rainy());
        ramanan.getTypeOfWeather();
        ramanan.setTypeOfWeather(new Snowy());
        ramanan.getTypeOfWeather();
    }
}
//
class Ramanan extends WeatherReport {
    Ramanan() {
        typeOfWeather = new Sunny();
    }
}

abstract class WeatherReport {
    TypeOfWeather typeOfWeather;

    public void setTypeOfWeather(TypeOfWeather typeOfWeather) {
        this.typeOfWeather = typeOfWeather;
    }
    //get required weather from algorithm
    public void getTypeOfWeather() {
        typeOfWeather.weather();
    }
}

interface TypeOfWeather {
    public void weather();
}
//algorithm to get Sunny weather
class Sunny implements TypeOfWeather {
    @Override
    public void weather() {
        System.out.println("Weather is sunny");
    }
}
//algorithm to get rainy weather
class Rainy implements TypeOfWeather {
    @Override
    public void weather() {
        System.out.println("Weather is rainy");
    }
}

//algorithm to get snowy weather
class Snowy implements TypeOfWeather {
    @Override
    public void weather() {
        System.out.println("Weather is snowy");
    }
}

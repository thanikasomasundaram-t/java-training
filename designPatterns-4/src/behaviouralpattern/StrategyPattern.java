package behaviouralpattern;

public class StrategyPattern {
    public static void main(String[] args) {
        Ramanan ramanan = new Ramanan();
        ramanan.getTypeOfWeather();
        ramanan.setTypeOfWeather(new Rainy());
        ramanan.getTypeOfWeather();
        ramanan.setTypeOfWeather(new Snowy());
        ramanan.getTypeOfWeather();
    }
}

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

    public void getTypeOfWeather() {
        typeOfWeather.weather();
    }
}

interface TypeOfWeather {
    public void weather();
}

class Sunny implements TypeOfWeather {
    @Override
    public void weather() {
        System.out.println("Weather is sunny");
    }
}

class Rainy implements TypeOfWeather {
    @Override
    public void weather() {
        System.out.println("Weather is rainy");
    }
}

class Snowy implements TypeOfWeather {
    @Override
    public void weather() {
        System.out.println("Weather is snowy");
    }
}

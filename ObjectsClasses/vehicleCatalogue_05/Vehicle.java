package vehicleCatalogue_05;

public class Vehicle {

    private final String type;
    private final String model;
    private final String color;
    private final int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {

        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;

    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

}


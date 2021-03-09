package ro.developmentfactory.creational.builder;

public class Engine {
    private int displacement;
    private Fuel fuel;
    private int cylindersNumber;

    public Engine(int displacement, Fuel fuel, int cylindersNumber) {
        this.displacement = displacement;
        this.fuel = fuel;
        this.cylindersNumber = cylindersNumber;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public int getCylindersNumber() {
        return cylindersNumber;
    }

    public void setCylindersNumber(int cylindersNumber) {
        this.cylindersNumber = cylindersNumber;
    }
}

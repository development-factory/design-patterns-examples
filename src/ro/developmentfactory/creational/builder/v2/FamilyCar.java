package ro.developmentfactory.creational.builder.v2;

import ro.developmentfactory.creational.builder.CarType;
import ro.developmentfactory.creational.builder.Engine;
import ro.developmentfactory.creational.builder.Transmission;

public class FamilyCar {
    private int doorsNumber;
    private CarType type;
    private Transmission transmission;
    private Engine engine;

    public FamilyCar(int doorsNumber, CarType type, Transmission transmission, Engine engine) {
        this.doorsNumber = doorsNumber;
        this.type = type;
        this.transmission = transmission;
        this.engine = engine;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void print(){
        System.out.println("Car type: " + type);
        System.out.println("Doors number: " + doorsNumber);
        System.out.println("Engine:");
        System.out.println("\tDisplacement: " + engine.getDisplacement());
        System.out.println("\tNumber of cylinders: " + engine.getCylindersNumber());
        System.out.println("\tFuel: " + engine.getFuel());
        System.out.println("Transmission:");
        System.out.println("\tType: " + transmission.getTransmissionType());
        System.out.println("\tGears number: " + transmission.getGearNumber());
    }
}

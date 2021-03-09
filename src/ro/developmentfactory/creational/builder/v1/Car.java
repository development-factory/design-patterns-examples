package ro.developmentfactory.creational.builder.v1;

import ro.developmentfactory.creational.builder.CarType;
import ro.developmentfactory.creational.builder.Engine;
import ro.developmentfactory.creational.builder.Transmission;

public class Car {
    private int doorsNumber;
    private CarType type;
    private Engine engine;
    private Transmission transmission;

    private Car(int doorsNumber, CarType type, Engine engine, Transmission transmission) {
        this.doorsNumber = doorsNumber;
        this.type = type;
        this.engine = engine;
        this.transmission = transmission;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public CarType getType() {
        return type;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
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

    public static class CarBuilder{
        private int doorsNumber;
        private CarType type;
        private Engine engine;
        private Transmission transmission;

        public Car build(){
            return new Car(this.doorsNumber, this.type, this.engine, this.transmission);
        }

        public CarBuilder doorsNumber(int doorsNumber){
            this.doorsNumber = doorsNumber;
            return this;
        }

        public CarBuilder type(CarType type){
            this.type = type;
            return this;
        }

        public CarBuilder engine(Engine engine){
            this.engine = engine;
            return this;
        }

        public CarBuilder transmission(Transmission transmission){
            this.transmission = transmission;
            return this;
        }
    }
}

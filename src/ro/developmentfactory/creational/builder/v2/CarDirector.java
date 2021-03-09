package ro.developmentfactory.creational.builder.v2;

import ro.developmentfactory.creational.builder.*;

public class CarDirector {
    public void buildSportsCar(ICarBuilder builder){
        builder.setCarType(CarType.HATCH);
        builder.setDoorsNumber(2);
        builder.setEngine(new Engine(2000, Fuel.GASOLINE, 4));
        builder.setTransmission(new Transmission(6, TransmissionType.MANUAL));
    }

    public void buildFamilyCar(ICarBuilder builder){
        builder.setCarType(CarType.FAMILY);
        builder.setDoorsNumber(5);
        builder.setEngine(new Engine(1600, Fuel.DIESEL, 4));
        builder.setTransmission(new Transmission(8, TransmissionType.AUTOMATIC));
    }
}

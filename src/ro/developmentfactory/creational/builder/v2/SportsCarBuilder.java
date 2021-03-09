package ro.developmentfactory.creational.builder.v2;

import ro.developmentfactory.creational.builder.CarType;
import ro.developmentfactory.creational.builder.Engine;
import ro.developmentfactory.creational.builder.Transmission;

public class SportsCarBuilder implements ICarBuilder {
    private int doorsNumber;
    private Engine engine;
    private Transmission transmission;
    private CarType type;

    @Override
    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    public SportsCar build(){
        return new SportsCar(this.doorsNumber, this.type, this.transmission, this.engine);
    }
}

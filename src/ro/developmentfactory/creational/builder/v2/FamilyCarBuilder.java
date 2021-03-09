package ro.developmentfactory.creational.builder.v2;

import ro.developmentfactory.creational.builder.CarType;
import ro.developmentfactory.creational.builder.Engine;
import ro.developmentfactory.creational.builder.Transmission;

public class FamilyCarBuilder implements ICarBuilder{
    private int doorsNumber;
    private CarType carType;
    private Transmission transmission;
    private Engine engine;

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
        this.carType = type;
    }

    public FamilyCar build(){
        return new FamilyCar(this.doorsNumber, this.carType, this.transmission, this.engine);
    }
}

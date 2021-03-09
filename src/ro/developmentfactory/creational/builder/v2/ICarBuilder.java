package ro.developmentfactory.creational.builder.v2;

import ro.developmentfactory.creational.builder.CarType;
import ro.developmentfactory.creational.builder.Engine;
import ro.developmentfactory.creational.builder.Transmission;

public interface ICarBuilder {
    void setDoorsNumber(int doorsNumber);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setCarType(CarType type);
}

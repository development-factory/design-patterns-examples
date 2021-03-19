package ro.developmentfactory.creational.builder;

import ro.developmentfactory.creational.builder.v1.Car;
import ro.developmentfactory.creational.builder.v2.*;

public class Main {
    public static void main(String[] args) {
        // simpler version
        Car car = new Car.CarBuilder()
                .doorsNumber(2)
                .type(CarType.HATCH)
                .engine(new Engine(1000, Fuel.GASOLINE, 3))
                .transmission(new Transmission(5, TransmissionType.MANUAL))
                .build();
        //car.print();

        // complex version
        CarDirector director = new CarDirector();

        // building sports car
        SportsCarBuilder sportsCarBuilder = new SportsCarBuilder();
        director.buildSportsCar(sportsCarBuilder);
        SportsCar sportsCar = sportsCarBuilder.build();

        // building family car
        FamilyCarBuilder familyCarBuilder = new FamilyCarBuilder();
        director.buildFamilyCar(familyCarBuilder);
        FamilyCar familyCar = familyCarBuilder.build();

        // printing details about the cars
        sportsCar.print();
        System.out.println("===================================");
        familyCar.print();
    }
}

package ro.developmentfactory.creational.builder;

public class Transmission {
    private int gearNumber;
    private TransmissionType transmissionType;

    public Transmission(int gearNumber, TransmissionType transmissionType) {
        this.gearNumber = gearNumber;
        this.transmissionType = transmissionType;
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public void setGearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }
}

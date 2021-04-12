package ro.developmentfactory.structural.adapter;

public class RoundHole {
    private double diameter;

    public RoundHole(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public boolean doesItFit(Cylinder cylinder){
        return cylinder.getDiameter() <= diameter;
    }
}

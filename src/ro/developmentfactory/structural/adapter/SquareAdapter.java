package ro.developmentfactory.structural.adapter;

public class SquareAdapter extends Cylinder{
    private Square square;

    private SquareAdapter(){}

    public SquareAdapter(Square square) {
        this.square = square;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    @Override
    public double getDiameter(){
        // Calculating diameter using math formula: side length * sqrt of 2
        return square.getLength() * Math.sqrt(2);
    }
}

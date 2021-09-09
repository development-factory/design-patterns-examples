package ro.developmentfactory.structural.flyweight;

public class Cell {
    private final Data data;
    private final Position position;

    public Cell(Data data, Position position) {
        this.data = data;
        this.position = position;
    }

    public void render(){
        System.out.printf("Color: %s, value: %s, position[row, column]: %s, %s", data.getColor(), data.getValue(), position.getRow(), position.getColumn());
        System.out.println();
    }
}

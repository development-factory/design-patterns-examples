package ro.developmentfactory.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Sheet {
    private final List<Cell> cells = new ArrayList<>();

    public void createCell(int row, int column, String color, String value){
        Data data = CellDataFactory.get(color, value);
        Cell cell = new Cell(data, new Position(row, column));
        cells.add(cell);
    }

    public void renderCells(){
        for(Cell cell : cells){
            cell.render();
        }
    }

    public void displayNumberOfCellObjects(){
        System.out.printf("Total number of Cell objects created: %s", CellDataFactory.getNumberOfCells());
    }
}

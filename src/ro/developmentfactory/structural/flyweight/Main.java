package ro.developmentfactory.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        Sheet sheet = new Sheet();

        sheet.createCell(1, 1, "blue", "some text");
        sheet.createCell(1, 2, "blue", "some text");
        sheet.createCell(1, 3, "blue", "some text");
        sheet.createCell(1, 4, "blue", "some text");
        sheet.createCell(1, 5, "blue", "some text");

        sheet.createCell(2, 1, "red", "some other text");

        sheet.renderCells();

        sheet.displayNumberOfCellObjects();
    }
}

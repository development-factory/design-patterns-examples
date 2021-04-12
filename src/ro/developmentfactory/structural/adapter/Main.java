package ro.developmentfactory.structural.adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(20);
        Cylinder cylinder = new Cylinder(20);

        // Instantiate square by declaring side length
        Square square = new Square(10);

        // Pass square to adapter
        SquareAdapter squareAdapter = new SquareAdapter(square);

        System.out.printf("Does cylinder with diameter %s fit in hole with %s diameter?%n", cylinder.getDiameter(), hole.getDiameter());
        System.out.println("Result: " + hole.doesItFit(cylinder));

        // User adapter instead of square itself to compute its diameter and compute result
        System.out.printf("Does square with diameter %s fit in hole with %s diameter?%n", squareAdapter.getDiameter(), hole.getDiameter());
        System.out.println("Result: " + hole.doesItFit(squareAdapter));

    }
}

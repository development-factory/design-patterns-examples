package ro.developmentfactory.structural.composite;

public class Button implements GraphicComponent{
    private double width;
    private double height;
    private String color;
    private String label;
    private GraphicComponent parent;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public GraphicComponent getParent() {
        return parent;
    }

    public void setParent(GraphicComponent parent) {
        this.parent = parent;
    }

    @Override
    public void render() {
        System.out.printf("Component %s rendered as child component for %s: width = %s, height = %s, color = %s, label = %s\n", this, parent, width, height, color, label);
    }
}

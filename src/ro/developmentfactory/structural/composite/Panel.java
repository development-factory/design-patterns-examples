package ro.developmentfactory.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Panel implements GraphicComponent{
    private double width;
    private double height;
    private GraphicComponent parent;
    private final List<GraphicComponent> children = new ArrayList<>();

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

    public void add(GraphicComponent child){
        children.add(child);
    }

    public void remove(GraphicComponent child){
        children.remove(child);
    }

    public GraphicComponent getParent() {
        return parent;
    }

    public void setParent(GraphicComponent parent) {
        this.parent = parent;
    }

    @Override
    public void render() {
        System.out.printf("Component %s rendered as child component of %s: width = %s, height = %s\n", this, parent, width, height);
        for(GraphicComponent child : children){
            child.render();
        }
    }
}

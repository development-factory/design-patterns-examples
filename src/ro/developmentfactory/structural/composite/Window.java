package ro.developmentfactory.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Window implements GraphicComponent{
    private double width;
    private double height;
    private boolean fullScreen;
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

    public boolean isFullScreen() {
        return fullScreen;
    }

    public void setFullScreen(boolean fullScreen) {
        this.fullScreen = fullScreen;
    }

    public void add(GraphicComponent child){
        children.add(child);
    }

    public void remove(GraphicComponent child){
        children.remove(child);
    }

    @Override
    public void render() {
        System.out.printf("Component %s rendered: width = %s, height = %s, fullScreen = %s\n", this, width, height, fullScreen);
        for(GraphicComponent child : children){
            child.render();
        }
    }
}

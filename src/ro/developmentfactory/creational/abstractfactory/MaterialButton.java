package ro.developmentfactory.creational.abstractfactory;

public class MaterialButton implements IButton{
    @Override
    public void render() {
        System.out.println("Rendered a material Button");
    }
}

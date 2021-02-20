package ro.developmentfactory.creational.abstractfactory;

public class IOSButton implements IButton{
    @Override
    public void render() {
        System.out.println("Rendered an IOS button");
    }
}

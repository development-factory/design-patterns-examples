package ro.developmentfactory.creational.abstractfactory;

public class IOSCheckbox implements ICheckbox{
    @Override
    public void render() {
        System.out.println("Rendered an IOS checkbox");
    }
}

package ro.developmentfactory.creational.abstractfactory;

public class IOSFactory implements UIFactory{
    @Override
    public IButton createButton() {
        return new IOSButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new IOSCheckbox();
    }
}

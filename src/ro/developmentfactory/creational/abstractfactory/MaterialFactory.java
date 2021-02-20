package ro.developmentfactory.creational.abstractfactory;

public class MaterialFactory implements UIFactory{
    @Override
    public IButton createButton() {
        return new MaterialButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MaterialCheckbox();
    }
}

package ro.developmentfactory.creational.abstractfactory;

public interface UIFactory {
    IButton createButton();
    ICheckbox createCheckbox();
}

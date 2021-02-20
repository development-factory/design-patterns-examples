package ro.developmentfactory.creational.abstractfactory;

public class MobileApplication {
    private UIFactory factory;

    public MobileApplication(UIFactory factory) {
        this.factory = factory;
    }

    public void render(){
        factory.createCheckbox().render();
        factory.createButton().render();
    }
}

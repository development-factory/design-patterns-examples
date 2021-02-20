package ro.developmentfactory.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        OS currentOs = OS.Android;
        UIFactory factory = null;

        switch (currentOs){
            case IOS:
                factory = new IOSFactory();
                break;
            case Android:
                factory = new MaterialFactory();
                break;
        }

        MobileApplication mobileApp = new MobileApplication(factory);
        mobileApp.render();
    }
}

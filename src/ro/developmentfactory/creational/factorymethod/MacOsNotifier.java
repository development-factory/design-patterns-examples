package ro.developmentfactory.creational.factorymethod;

public class MacOsNotifier extends Notifier {
    @Override
    public Notifiable createNotification() {
        return new MacOsNotification();
    }
}

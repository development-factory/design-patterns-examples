package ro.developmentfactory.creational.factorymethod;

public class WindowsNotifier extends Notifier{
    @Override
    public Notifiable createNotification() {
        return new WindowsNotification();
    }
}

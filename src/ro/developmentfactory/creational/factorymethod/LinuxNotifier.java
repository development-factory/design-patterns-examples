package ro.developmentfactory.creational.factorymethod;

public class LinuxNotifier extends Notifier {
    @Override
    public Notifiable createNotification() {
        return new LinuxNotification();
    }
}

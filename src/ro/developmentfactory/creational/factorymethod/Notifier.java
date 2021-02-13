package ro.developmentfactory.creational.factorymethod;

public abstract class Notifier {
    public void sendNotification(){
        Notifiable notification = createNotification();
        notification.display();
    }
    public abstract Notifiable createNotification();
}

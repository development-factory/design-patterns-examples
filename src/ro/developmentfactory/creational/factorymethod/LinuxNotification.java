package ro.developmentfactory.creational.factorymethod;

public class LinuxNotification implements Notifiable {
    @Override
    public void display() {
        System.out.println("Linux notification.");
    }
}

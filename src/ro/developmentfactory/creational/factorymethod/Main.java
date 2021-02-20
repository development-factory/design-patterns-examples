package ro.developmentfactory.creational.factorymethod;

public class Main {
    private static Notifier notifier;
    public static void main(String[] args) {
        // Setting configuration based on operating system.
        String osName = System.getProperty("os.name");
        if(osName.equals("Mac OS X")){
            notifier = new MacOsNotifier();
        }else if(osName.equals("Windows 10")){
            notifier = new WindowsNotifier();
        }else if(osName.equals("Ubuntu")){
            notifier = new LinuxNotifier();
        }

        // Sending notification
        notifier.sendNotification();
    }
}

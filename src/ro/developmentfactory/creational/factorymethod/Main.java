package ro.developmentfactory.creational.factorymethod;

public class Main {
    private static Notifier notifier;
    public static void main(String[] args) {
        // Setting configuration based on operating system.
        String osName = System.getProperty("os.name");
        switch (osName) {
            case "Mac OS X":
                notifier = new MacOsNotifier();
                break;
            case "Windows 10":
                notifier = new WindowsNotifier();
                break;
            case "Ubuntu":
                notifier = new LinuxNotifier();
                break;
        }

        // Sending notification
        notifier.sendNotification();
    }
}

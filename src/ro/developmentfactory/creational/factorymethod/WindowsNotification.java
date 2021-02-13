package ro.developmentfactory.creational.factorymethod;

import java.awt.*;

public class WindowsNotification implements Notifiable{
    @Override
    public void display() {
        if(SystemTray.isSupported()){
            SystemTray tray = SystemTray.getSystemTray();

            // Set an icon/image to be displayed in the tray menu.
            Image image = Toolkit.getDefaultToolkit().getImage("");

            // Configuring tray icon.
            TrayIcon trayIcon = new TrayIcon(image, "Windows Notifier");
            trayIcon.setImageAutoSize(true);
            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
                System.err.println("An error occurred while adding icon to tray. Please check if tray is available.");
            }
            trayIcon.displayMessage("Hello", "This is your java project sending a notification", TrayIcon.MessageType.INFO);
        }else{
            System.err.println("Tray not supported!");
        }
    }
}

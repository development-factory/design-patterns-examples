package ro.developmentfactory.structural.bridge;

public class Main {
    public static void main(String[] args) {
        UIEngine engine = new UIEngine(OS.Windows);

        engine.renderWindow();
        engine.makeFullScreen();
        engine.closeWindow();
    }
}

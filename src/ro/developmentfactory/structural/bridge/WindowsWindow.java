package ro.developmentfactory.structural.bridge;

public class WindowsWindow implements Window{
    private boolean isFullScreen = false;

    @Override
    public void render() {
        System.out.println("Rendered Windows window");
    }

    @Override
    public void close() {
        System.out.println("Windows window has been destroyed");
    }

    @Override
    public void makeFullScreen() {
        isFullScreen = true;
        System.out.println("Window is now full screen");
    }

}

package ro.developmentfactory.structural.bridge;

public class LinuxWindow implements Window {
    private boolean isFullScreen = false;

    @Override
    public void render() {
        System.out.println("Rendered Linux window.");
    }

    @Override
    public void close() {
        System.out.println("Linux window has been destroyed.");
    }

    @Override
    public void makeFullScreen() {
        isFullScreen = true;
        System.out.println("Linux window is now full screen.");
    }
}

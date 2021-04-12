package ro.developmentfactory.structural.bridge;

public class MacOsWindow implements Window{
    private boolean isFullScreen = false;

    @Override
    public void render() {
        System.out.println("Rendered MacOS window.");
    }

    @Override
    public void close() {
        System.out.println("MacOS window has been destroyed.");
    }

    @Override
    public void makeFullScreen() {
        isFullScreen = true;
        System.out.println("MacOS window is now full screen.");
    }
}

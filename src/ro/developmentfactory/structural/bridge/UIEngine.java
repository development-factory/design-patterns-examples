package ro.developmentfactory.structural.bridge;

public class UIEngine {
    private Window window = null;

    public UIEngine(OS runningOs) {
        switch (runningOs){
            case Windows:
                this.window = new WindowsWindow();
                break;
            case Linux:
                this.window = new LinuxWindow();
                break;
            case MacOS:
                this.window = new MacOsWindow();
                break;
        }
    }

    public void renderWindow(){
        this.window.render();
    }

    public void closeWindow(){
        this.window.close();
    }

    public void makeFullScreen(){
        this.window.makeFullScreen();
    }
}

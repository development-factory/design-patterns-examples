package ro.developmentfactory.structural.composite;


public class Main {
    public static void main(String[] args) {
        // Create a few button components
        Button buttonOk = new Button();
        buttonOk.setHeight(120);
        buttonOk.setWidth(70);
        buttonOk.setColor("Green");
        buttonOk.setLabel("Ok");

        Button buttonCancel = new Button();
        buttonCancel.setHeight(120);
        buttonCancel.setWidth(70);
        buttonCancel.setColor("Red");
        buttonCancel.setLabel("Cancel");


        // Create panel (panel = zone or group of components inside another component)
        // Adding button components as components of the panel (or children)
        Panel panel = new Panel();
        panel.setHeight(800);
        panel.setWidth(600);

        // Add buttons as child components
        panel.add(buttonCancel);
        panel.add(buttonOk);

        // Setting the parent component
        buttonOk.setParent(panel);
        buttonCancel.setParent(panel);

        // Create Window component
        Window window = new Window();
        window.setHeight(1280);
        window.setHeight(720);
        window.add(panel);
        panel.setParent(window);

        // Create Button as component of the window
        Button closeWindowButton = new Button();
        closeWindowButton.setWidth(100);
        closeWindowButton.setHeight(50);
        closeWindowButton.setLabel("Close Window");
        closeWindowButton.setColor("Grey");

        window.add(closeWindowButton);
        closeWindowButton.setParent(window);


        // Call render once to display all the components.
        window.render();
    }
}

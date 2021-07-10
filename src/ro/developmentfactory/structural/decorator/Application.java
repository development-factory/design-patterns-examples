package ro.developmentfactory.structural.decorator;

/**
 * Client code for our data storage interface.
 */
public class Application {
    private final IStorage storage;

    public Application(IStorage storage) {
        this.storage = storage;
    }

    public void storeData(String data){
        storage.write("Data to be stored");
    }

    public void readData(){
        System.out.printf("Stored data: %s", storage.read());
    }

}

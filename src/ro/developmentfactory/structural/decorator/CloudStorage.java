package ro.developmentfactory.structural.decorator;

/**
 * Storage wrapper to add extra functionality that we might need
 * without changing the interface. Client code won't see any difference at runtime.
 */
public class CloudStorage implements IStorage{
    private final LocalStorage localStorage;

    public CloudStorage(LocalStorage localStorage) {
        this.localStorage = localStorage;
    }

    @Override
    public void write(String data) {
        localStorage.write(data);
        syncInCloud();
    }

    @Override
    public String read() {
        return localStorage.read();
    }

    private void syncInCloud(){
        System.out.printf("%s is sent to cloud storage.", localStorage.read());
    }
}

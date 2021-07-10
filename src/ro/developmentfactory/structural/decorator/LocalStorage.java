package ro.developmentfactory.structural.decorator;

public class LocalStorage implements IStorage {
    private String store;
    @Override
    public void write(String data) {
        store += data;
        System.out.printf("%s stored locally.", data);
    }

    @Override
    public String read(){
        return store;
    }
}

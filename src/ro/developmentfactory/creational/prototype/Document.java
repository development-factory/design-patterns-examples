package ro.developmentfactory.creational.prototype;

public abstract class Document implements Cloneable{
    private int id;
    private String client;
    private double value;

    public Document() {}

    public Document(Document source) {
        if(source != null){
            this.id = source.id;
            this.client = source.client;
            this.value = source.value;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public abstract Document clone();
}

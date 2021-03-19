package ro.developmentfactory.creational.prototype;

public class Invoice extends Document{

    public Invoice (){}

    public Invoice(Invoice source) {
        super(source);
    }

    @Override
    public Document clone() {
        return new Invoice(this);
    }

    public void print(){
        System.out.println("Printing invoice...");
        System.out.println("Id: " + getId());
        System.out.println("Value: " + getValue());
        System.out.println("Client: " + getClient());
    }
}

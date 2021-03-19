package ro.developmentfactory.creational.prototype;

import java.util.Date;

public class Bill extends Document{
    private Date dueDate;

    public Bill(){}

    public Bill(Bill source){
        super(source);
        this.dueDate = source.dueDate;
    }

    @Override
    public Document clone() {
        return new Bill(this);
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void print(){
        System.out.println("Printing bill...");
        System.out.println("Id: " + getId());
        System.out.println("Value: " + getValue());
        System.out.println("Client: " + getClient());
        System.out.println("Due date: " + getDueDate());
    }
}

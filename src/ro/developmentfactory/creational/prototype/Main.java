package ro.developmentfactory.creational.prototype;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // prototype invoice
        Invoice invoice = new Invoice();
        invoice.setId(1);
        invoice.setValue(120);
        invoice.setClient("A fancy company");

        // prototype bill
        Bill bill = new Bill();
        bill.setId(1);
        bill.setValue(90);
        bill.setClient("Another fancy company");
        bill.setDueDate(new Date());

        System.out.println("Original objects:");
        invoice.print();
        bill.print();

        System.out.println("==============================");
        System.out.println("Cloned objects");
        // cloning documents
        Invoice clonedInvoice = (Invoice) invoice.clone();
        Bill clonedBill = (Bill) bill.clone();

        // printing documents
        clonedInvoice.print();
        clonedBill.print();
    }
}

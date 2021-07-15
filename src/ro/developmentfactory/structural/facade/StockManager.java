package ro.developmentfactory.structural.facade;

import java.util.Arrays;
import java.util.List;

public class StockManager {
    private final List<Product> products = Arrays.asList(
            new Product("123", "Shoes", 150, 100),
            new Product("456", "T-Shirt", 300, 49),
            new Product("789", "Jeans", 420, 150),
            new Product("910", "Hat", 800, 35),
            new Product("321", "Gloves", 2300, 20),
            new Product("654", "Sun Glasses", 3200, 99)
    );

    public boolean hasStock(String barcode, int necessaryQuantity){
        return products.stream().anyMatch(p ->
                p.getBarcode().equals(barcode) &&
                p.getQuantity() <= necessaryQuantity);
    }

    public void increaseStock(String barcode, int receivedQuantity){
        Product product = findProduct(barcode);
        product.setQuantity(product.getQuantity() + receivedQuantity);
    }

    public void decreaseStock(String barcode, int quantity){
        Product product = findProduct(barcode);
        if(!hasStock(barcode, quantity)){
            product.setQuantity(product.getQuantity());
            System.out.printf("Warning! Product %s has less stock than ordered quantity", product.getName());
        }
    }

    private Product findProduct(String barcode){
        return products.stream().filter(p ->
                p.getBarcode().equals(barcode))
                .findFirst()
                .orElseThrow();
    }
}

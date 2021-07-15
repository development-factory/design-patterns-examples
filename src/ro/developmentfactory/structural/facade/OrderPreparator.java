package ro.developmentfactory.structural.facade;

public class OrderPreparator {
    private final StockManager stockManager;
    private Order order;

    public OrderPreparator(StockManager stockManager) {
        this.stockManager = stockManager;
    }

    public void prepare(Order order){
        System.out.println("Order in preparation");
        for(Product p : order.getProducts()){
            stockManager.decreaseStock(p.getBarcode(), p.getQuantity());
        }
        order.setState(OrderState.Ready);
    }
}

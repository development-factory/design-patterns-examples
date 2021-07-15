package ro.developmentfactory.structural.facade;

public class OrderOrchestrator {
    // Use DI container here, creating instances for simplification.
    private OrderProcessor processor = new OrderProcessor();
    private OrderPreparator preparator = new OrderPreparator(new StockManager());
    private Transporter transporter = new Transporter();

    public void handleOrder(Order order){
        try {
            processor.process(order);
        } catch (Exception e) {
            System.out.println("Order is invalid: " + e.getMessage());
        }
        preparator.prepare(order);
        transporter.load(order);
        transporter.finish();
    }
}

package ro.developmentfactory.structural.facade;

public class OrderOrchestrator {
    // Use DI container here, creating instances for simplification.
    private final OrderProcessor processor;
    private final OrderPreparator preparator;
    private final Transporter transporter;

    public OrderOrchestrator(OrderProcessor processor, OrderPreparator preparator, Transporter transporter) {
        this.processor = processor;
        this.preparator = preparator;
        this.transporter = transporter;
    }

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

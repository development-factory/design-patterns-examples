package ro.developmentfactory.structural.facade;

public class OrderProcessor {
    private Order order;

    public void process(Order order) throws Exception{
        this.order = order;
        if(order.getState() == OrderState.Pending){
            if(hasCustomerName() && hasDeliveryAddress()){
                order.setState(OrderState.Processed);
            }else{
                throw new IllegalArgumentException("Order data incomplete.");
            }
        }
        throw new IllegalArgumentException("Order is in invalid state.");
    }

    private boolean hasCustomerName(){
        String customerFullName = String.format("%s %s", order.getCustomerFirstName(), order.getCustomerLastName());
        return !customerFullName.isEmpty() || !customerFullName.isBlank();
    }

    private boolean hasDeliveryAddress(){
        return !order.getDeliveryAddress().isEmpty() || order.getDeliveryAddress().isBlank();
    }
}

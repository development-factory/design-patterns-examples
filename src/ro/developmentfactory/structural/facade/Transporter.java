package ro.developmentfactory.structural.facade;

public class Transporter {
    private Order order;

    public void load(Order order){
        System.out.println("Order loaded");
        order.setState(OrderState.InTransit);
    }

    public void finish(){
        if(order.isPaid()){
            System.out.printf("Order has been delivered to %s", order.getDeliveryAddress());
            order.setState(OrderState.Delivered);
        }
    }
}

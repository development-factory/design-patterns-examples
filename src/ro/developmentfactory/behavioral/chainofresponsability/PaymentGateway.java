package ro.developmentfactory.behavioral.chainofresponsability;

public class PaymentGateway {
    private final Handler handler;

    public PaymentGateway(Handler handler) {
        this.handler = handler;
    }

    public void makePayment(String cardNumber){
        if(handler.check(cardNumber)){
            System.out.println("Payment successful");
        }else{
            System.out.println("Payment failed");
        }
    }
}

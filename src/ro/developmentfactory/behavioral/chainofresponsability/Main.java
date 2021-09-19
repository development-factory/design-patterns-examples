package ro.developmentfactory.behavioral.chainofresponsability;

public class Main {
    public static void main(String[] args) {
        CardValidationHandler cardValidationHandler = new CardValidationHandler();
        cardValidationHandler
                .link(new AmountValidationHandler())
                .link(new PaymentValidationHandler());

        PaymentGateway gateway = new PaymentGateway(cardValidationHandler);
        gateway.makePayment("1234567890123456");
    }
}

package ro.developmentfactory.behavioral.chainofresponsability;

public class PaymentValidationHandler extends Handler{

    @Override
    public boolean check(String cardNumber) {
        if(paymentSuccessful(cardNumber))
            return checkNext(cardNumber);
        return false;
    }

    private boolean paymentSuccessful(String cardNumber){
        System.out.printf("Payment finished successfully for: %s\n", cardNumber);
        return true;
    }
}

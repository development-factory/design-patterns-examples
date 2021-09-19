package ro.developmentfactory.behavioral.chainofresponsability;

public class AmountValidationHandler extends Handler{

    @Override
    public boolean check(String cardNumber) {
        if(hasAmount(cardNumber))
            return checkNext(cardNumber);
        return false;
    }

    private boolean hasAmount(String cardNumber){
        System.out.println("Customer has the necessary amount");
        return true;
    }
}

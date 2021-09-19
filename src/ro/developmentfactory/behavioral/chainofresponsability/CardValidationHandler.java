package ro.developmentfactory.behavioral.chainofresponsability;

public class CardValidationHandler extends Handler {
    private static final int CARD_NUMBER_LENGTH = 16;

    @Override
    public boolean check(String cardNumber) {
        if(hasTheRightLength(cardNumber)){
            System.out.println("Card validation successful");
            return checkNext(cardNumber);
        }
        return false;
    }

    private boolean hasTheRightLength(String cardNumber){
        return cardNumber.length() == CARD_NUMBER_LENGTH;
    }
}

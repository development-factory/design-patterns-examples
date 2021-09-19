package ro.developmentfactory.behavioral.chainofresponsability;

public abstract class Handler {
    private Handler next;

    public Handler link(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String cardNumber);

    public boolean checkNext(String cardNumber){
        if (next == null)
            return true;
        return next.check(cardNumber);
    }
}

package ro.developmentfactory.singleton;

public final class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}

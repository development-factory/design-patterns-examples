package ro.developmentfactory.creational.singleton;

public final class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        synchronized (Singleton.class){
            if(instance == null){
                    instance = new Singleton();
            }
        }
        return instance;
    }
}

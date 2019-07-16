package creationpatterns.singleton;

public class EagerInitialization extends Singleton {
    // thread safe but not eco
    // if the singleton never get used, it's a waste of memory
    // class loader will initial the singleton and make sure it is singleton
    private static final Singleton singleton = new EagerInitialization("Eager Initialization");

    private EagerInitialization(String initializer){
        super(initializer);
    }

    public static Singleton getEagerInitialization() {
        return singleton;
    }
}

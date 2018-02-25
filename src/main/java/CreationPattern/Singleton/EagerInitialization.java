package CreationPattern.Singleton;

public class EagerInitialization extends Singleton {
    private static final Singleton singleton = new EagerInitialization("Eager Initialization");

    private EagerInitialization(String initializer){
        super(initializer);
    }

    public static Singleton getEagerInitialization() {
        return singleton;
    }
}

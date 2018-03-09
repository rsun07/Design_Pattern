package CreationPatterns.Singleton;

public class LazyInitialization extends Singleton {
    private static Singleton singleton;

    private LazyInitialization(String initializer) {
        super(initializer);
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new LazyInitialization("Lazy Initialization");
        }
        return singleton;
    }
}

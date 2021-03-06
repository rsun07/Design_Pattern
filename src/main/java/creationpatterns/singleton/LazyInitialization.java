package creationpatterns.singleton;

public class LazyInitialization extends Singleton {
    private static Singleton singleton;

    private LazyInitialization(String initializer) {
        super(initializer);
    }

    // Not thread safe
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new LazyInitialization("Lazy Initialization");
        }
        return singleton;
    }
}

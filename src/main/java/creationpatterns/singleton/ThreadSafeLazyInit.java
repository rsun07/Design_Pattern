package creationpatterns.singleton;

public class ThreadSafeLazyInit extends Singleton {
    private static Singleton singleton;

    private ThreadSafeLazyInit(String initializer) {
        super(initializer);
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new ThreadSafeLazyInit("Thread safe Initialization");
        }
        return singleton;
    }
}

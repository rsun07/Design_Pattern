package creationpatterns.singleton;

public class LazyInitialThreadSafe extends Singleton {
    private static Singleton singleton;

    private LazyInitialThreadSafe(String initializer) {
        super(initializer);
    }

    // thread safe but low efficiency
    // we only need to lock the singleton initialize part code
    // see DoubleCheckedLockingInit for better way
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new LazyInitialThreadSafe("Thread safe Initialization");
        }
        return singleton;
    }
}

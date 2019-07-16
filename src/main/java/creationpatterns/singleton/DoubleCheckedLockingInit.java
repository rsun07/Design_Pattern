package creationpatterns.singleton;

// Recommended
public class DoubleCheckedLockingInit extends Singleton {
    private static Singleton singleton;

    private DoubleCheckedLockingInit(String initializer) {
        super(initializer);
    }

    // DON'T use it!!!
    // Not thread safe
    private static Singleton getInstanceThreadUnsafe() {
        if (singleton == null) {
            // if thread 1 and 2 get here at the same time,
            // then it lock thread 2, allow thread 1 to create a new instance
            // then it unlock thread 2, create another new instance
            synchronized (DoubleCheckedLockingInit.class) {
                singleton = new DoubleCheckedLockingInit("DoubleCheckedLocking Thread Unsafe Initialization");
            }
        }
        return singleton;
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckedLockingInit.class) {
                // double check
                if (singleton == null) {
                    singleton = new DoubleCheckedLockingInit("Double Checked Locking Initialization");
                }
            }
        }
        return singleton;
    }
}

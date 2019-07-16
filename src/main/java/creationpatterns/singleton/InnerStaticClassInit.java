package creationpatterns.singleton;

// Recommended
public class InnerStaticClassInit extends Singleton {

    private InnerStaticClassInit(String initializer) {
        super(initializer);
    }

    // thread safe because using class loader to initialize the class
    // lazy load because inner class won't be load before called
    private static class Initializer {
        private static final Singleton SINGLETON = new InnerStaticClassInit("Inner Helper Class Initialization");
    }

    // won't initialize until this method get called first time
    // use break point debug mode to check
    public static Singleton getInstance() {
        return Initializer.SINGLETON;
    }
}

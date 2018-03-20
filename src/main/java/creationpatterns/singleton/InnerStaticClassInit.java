package creationpatterns.singleton;

public class InnerStaticClassInit extends Singleton {

    private InnerStaticClassInit(String initializer) {
        super(initializer);
    }

    private static class Initializer {
        private static final Singleton SINGLETON = new InnerStaticClassInit("Inner Helper Class Initialization");
    }

    // won't initialize until this method get called first time
    // use break point debug mode the check
    public static Singleton getInstance() {
        return Initializer.SINGLETON;
    }
}

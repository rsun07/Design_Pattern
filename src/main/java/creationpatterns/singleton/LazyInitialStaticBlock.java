package creationpatterns.singleton;

public class LazyInitialStaticBlock extends Singleton {
    private static Singleton singleton;

    // thread safe but not eco
    static {
        try {
            singleton = new LazyInitialStaticBlock("Static Block Initialization");
        } catch (Exception e) {
            throw new RuntimeException("Fail to initialize singleton");
        }
    }

    private LazyInitialStaticBlock(String initializer){
        super(initializer);
    }

    public static Singleton getStaticBlockInitialization() {
        return singleton;
    }
}

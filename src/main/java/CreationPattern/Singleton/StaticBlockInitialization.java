package CreationPattern.Singleton;

public class StaticBlockInitialization extends Singleton {
    private static Singleton singleton;

    static {
        try {
            singleton = new StaticBlockInitialization("Static Block Initialization");
        } catch (Exception e) {
            throw new RuntimeException("Fail to initialize singleton");
        }
    }

    private StaticBlockInitialization(String initializer){
        super(initializer);
    }

    public static Singleton getStaticBlockInitialization() {
        return singleton;
    }
}

package creationpatterns.singleton;

public class EagerInitSafeConstructor {
    private static final EagerInitSafeConstructor singleton = new EagerInitSafeConstructor("Eager Initialization Check duplication in constructor");
    private String initializer;

    private EagerInitSafeConstructor(String initializer){
        if (singleton != null) {
            throw new InstantiationError("singleton duplicate!");
        }
        this.initializer = initializer;
    }

    public static EagerInitSafeConstructor getEagerInitialization() {
        return singleton;
    }

    @Override
    public int hashCode() {
        int timePart = (int) (System.nanoTime() % 1000);
        return timePart;
    }
}

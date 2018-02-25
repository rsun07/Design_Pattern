package CreationPattern.Singleton;

public enum EnumSingleton {

    INSTANCE("Initialize in Enum constructor");

    private String initializer;

    EnumSingleton(String initializer) {
        this.initializer = initializer;
    }

    public static void doSth() {

    }
}

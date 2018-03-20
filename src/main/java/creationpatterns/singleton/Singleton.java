package creationpatterns.singleton;

public abstract class Singleton {
    private String initializer;

    Singleton(String initializer) {
        this.initializer = initializer;
        System.out.println("Initialize singleton by " + initializer);
    }

    @Override
    public int hashCode() {
        int timePart = (int) (System.nanoTime() % 1000);
        return initializer.hashCode() + timePart;
    }
}

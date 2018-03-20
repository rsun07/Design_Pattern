package structuralpattern.adapterpattern;

// prefer Composition over inheritance
public class CompositeAdapter {
    private ElectricCurrent electricCurrent;

    public CompositeAdapter(ElectricCurrent electricCurrent) {
        this.electricCurrent = electricCurrent;
    }

    public void eCurrent() {
        electricCurrent.eCurrent();
        System.out.println("Composite Adapter transfers the current to 18V for Macbook");
    }
}

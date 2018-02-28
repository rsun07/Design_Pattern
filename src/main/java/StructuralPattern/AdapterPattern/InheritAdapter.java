package StructuralPattern.AdapterPattern;

public class InheritAdapter extends ElectricCurrent {
    @Override
    public void eCurrent() {
        super.eCurrent();
        System.out.println("Inherit Adapter transfers the current to 18V for Macbook");
    }
}

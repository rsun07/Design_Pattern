package structuralpattern.facadepattern;

public class Stock implements Investment {
    @Override
    public void trade() {
        System.out.println("Invest Stock");
    }
}

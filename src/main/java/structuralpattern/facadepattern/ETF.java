package structuralpattern.facadepattern;

public class ETF implements Investment {
    @Override
    public void trade() {
        System.out.println("Invest ETF");
    }
}

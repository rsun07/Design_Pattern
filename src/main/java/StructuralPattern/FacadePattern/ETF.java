package StructuralPattern.FacadePattern;

public class ETF implements Investment {
    @Override
    public void trade() {
        System.out.println("Invest ETF");
    }
}

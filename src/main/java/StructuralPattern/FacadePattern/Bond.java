package StructuralPattern.FacadePattern;

public class Bond implements Investment {
    @Override
    public void trade() {
        System.out.println("Invest Bond");
    }
}

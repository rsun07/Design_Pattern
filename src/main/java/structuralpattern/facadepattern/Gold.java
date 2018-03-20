package structuralpattern.facadepattern;

public class Gold implements Investment {
    @Override
    public void trade() {
        System.out.println("Invest Gold");
    }
}

package structuralpattern.adapterpattern.problem_to_solve;

public class SoftwareDeveloper implements Developer {
    @Override
    public String developing() {
        return "Developing Software";
    }
}

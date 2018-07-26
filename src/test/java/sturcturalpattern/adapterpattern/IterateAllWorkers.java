package sturcturalpattern.adapterpattern;

import org.junit.Test;
import structuralpattern.adapterpattern.problem_to_solve.ChemicalEngineer;
import structuralpattern.adapterpattern.problem_to_solve.Developer;
import structuralpattern.adapterpattern.problem_to_solve.Engineer;
import structuralpattern.adapterpattern.problem_to_solve.JavaDeveloper;
import structuralpattern.adapterpattern.problem_to_solve.SoftwareDeveloper;

public class IterateAllWorkers {
    private static Object[] workers = {
            new ChemicalEngineer(),
            new JavaDeveloper(),
            new SoftwareDeveloper()
    };

    @Test
    public void noAdaptor() {
        for (Object worker : workers) {
            if (worker instanceof Engineer) {
                System.out.println(((Engineer) worker).engineering());
            } else if (worker instanceof Developer) {
                System.out.println(((Developer) worker).developing());
            } else {
                throw new RuntimeException("Unknown worker type");
            }
        }
    }
}

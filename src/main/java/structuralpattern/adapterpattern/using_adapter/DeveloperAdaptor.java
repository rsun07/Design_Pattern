package structuralpattern.adapterpattern.using_adapter;

import structuralpattern.adapterpattern.problem_to_solve.Developer;

public class DeveloperAdaptor implements WorkerAdapter {
    @Override
    public String work(Object worker) {
        return ((Developer) worker).developing();
    }

    @Override
    public boolean supports(Object worker) {
        return worker instanceof Developer;
    }
}

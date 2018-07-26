package structuralpattern.adapterpattern.using_adapter;

import structuralpattern.adapterpattern.problem_to_solve.Engineer;

public class EngineerAdaptor implements WorkerAdapter {
    @Override
    public String work(Object worker) {
        return ((Engineer) worker).engineering();
    }

    @Override
    public boolean supports(Object worker) {
        return worker instanceof Engineer;
    }
}

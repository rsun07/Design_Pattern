package structuralpattern.adapterpattern.using_adapter;

public interface WorkerAdapter {
    String work(Object worker);

    boolean supports(Object worker);
}

package structuralpattern.adapterpattern.using_adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterRegistrator {
    private static List<WorkerAdapter> adapters;

    static {
        regAllAdapters();
    }

    private static void regAllAdapters() {
        adapters = new ArrayList<>();
        adapters.add(new DeveloperAdaptor());
        adapters.add(new EngineerAdaptor());
    }

    public static WorkerAdapter getAdapter(Object worker) {
        for (WorkerAdapter adapter : adapters) {
            if (adapter.supports(worker)) {
                return adapter;
            }
        }
        return null;
    }

}

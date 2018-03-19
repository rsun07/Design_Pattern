package behavioralpattern.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters;

    public FilterChain() {
        this.filters = new ArrayList<>();
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void doFilter(Request request) {
        for (Filter filter : filters) {
            filter.doFilter(request);
        }
    }
}

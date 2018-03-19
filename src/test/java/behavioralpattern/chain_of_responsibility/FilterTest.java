package behavioralpattern.chain_of_responsibility;

import org.junit.Test;

public class FilterTest {
    @Test
    public void test() {
        Request request = new Request();
        request.setRequest("<tag>Please review 12349</tag>");

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter());
        filterChain.addFilter(new SecurityFilter());

        filterChain.doFilter(request);
    }
}

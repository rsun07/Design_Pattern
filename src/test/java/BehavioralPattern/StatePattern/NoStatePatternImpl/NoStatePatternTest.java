package BehavioralPattern.StatePattern.NoStatePatternImpl;

import org.junit.Test;

public class NoStatePatternTest {
    @Test
    public void test() {
        Clock clock = new Clock(7);
        clock.display();

        clock.setHour(10);
        clock.display();

        clock.setHour(17);
        clock.display();

        clock.setHour(22);
        clock.display();
    }
}

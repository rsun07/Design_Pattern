package BehavioralPattern.StatePattern.StatePatternImpl;

import org.junit.Test;

public class StatePatternTest {

    @Test
    public void testGetup() {
        Clock clock = new Clock(7);
        clock.display();
    }

    @Test
    public void testSleeping() {
        Clock clock = new Clock(22);
        clock.display();
    }

    @Test
    public void testAlert() {
        Clock clock = new Clock(10);
        clock.display();
    }

    @Test
    public void testDisplayCurrentTime() {
        Clock clock = new Clock(8);
        clock.display();
    }
}

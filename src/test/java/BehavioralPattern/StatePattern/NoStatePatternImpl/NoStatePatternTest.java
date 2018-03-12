package BehavioralPattern.StatePattern.NoStatePatternImpl;

import org.junit.Test;

public class NoStatePatternTest {

    @Test
    public void test() {
        Mp3Player mp3Player = new Mp3Player(State.POWER_OFF);
        mp3Player.play(State.POWER_OFF);
        mp3Player.play(State.POWER_ON);
        mp3Player.play(State.POWER_ON);
        mp3Player.play(State.PLAY);
        mp3Player.play(State.POWER_OFF);

    }
}

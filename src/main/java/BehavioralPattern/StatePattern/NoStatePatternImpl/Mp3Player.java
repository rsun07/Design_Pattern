package BehavioralPattern.StatePattern.NoStatePatternImpl;


public class Mp3Player {
    private State state;

    Mp3Player(State state) {
        this.state = state;
    }

    public void play(State nextState) {
        if (nextState.equals(this.state)) {
            this.state.alreadyInState();
        } else {
            nextState.play();
            state = nextState;
        }
    }
}

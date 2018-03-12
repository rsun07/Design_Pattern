package BehavioralPattern.StatePattern.NoStatePatternImpl;

public enum State {
    POWER_ON("PowerOn"),
    POWER_OFF("PowerOff"),
    PLAY("Play");

    State(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void play() {
        System.out.println(name);
    }

    public void alreadyInState() {
        System.out.println("Already in state: " + name);
    }
}

package BehavioralPattern.StatePattern.StatePatternImpl;

class Clock {
    private int hour;
    private Display display;

    Clock(int hour) {
        this.hour = hour;
        this.display = new GetUp();
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void display() {
        this.display.display(this);
    }
}

package behavioralpattern.statepattern.statepatternimpl;

class Alert implements Display {
    public void display(Clock clock) {
        if (clock.getHour() == 10) {
            System.out.println("Alert!!");
        } else {
            clock.setDisplay(new Sleeping());
            clock.display();
        }
    }
}

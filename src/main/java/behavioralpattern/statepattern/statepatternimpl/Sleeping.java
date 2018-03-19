package behavioralpattern.statepattern.statepatternimpl;

class Sleeping implements Display {
    public void display(Clock clock) {
        if (clock.getHour() == 22) {
            System.out.println("Sleeping!");
        } else {
            clock.setDisplay(new DisplayCurrentTime());
            clock.display();
        }
    }
}

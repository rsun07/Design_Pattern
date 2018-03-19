package behavioralpattern.statepattern.statepatternimpl;

class GetUp implements Display {
    public void display(Clock clock) {
        if (clock.getHour() == 7) {
            System.out.println("Get Up!");
        } else {
            clock.setDisplay(new Alert());
            clock.display();
        }
    }
}

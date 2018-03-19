package behavioralpattern.statepattern.statepatternimpl;

import java.util.Date;

class DisplayCurrentTime implements Display {
    public void display(Clock clock) {
        System.out.println(new Date(System.currentTimeMillis()));
    }
}

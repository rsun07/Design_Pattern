package behavioralpattern.statepattern.nostatepatternimpl;

import java.util.Date;

class Clock {
    private int hour;

    Clock(int hour) {
        this.hour = hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void display() {
        switch (this.hour) {
            case 7 :
                System.out.println("Get up!");
                break;
            case 10 :
                System.out.println("Alert!");
                break;
            case 22 :
                System.out.println("Sleeping Time!");
                break;
            default :
                System.out.println(new Date(System.currentTimeMillis()));
                break;
        }
    }
}

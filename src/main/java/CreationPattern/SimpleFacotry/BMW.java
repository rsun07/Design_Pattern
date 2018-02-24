package CreationPattern.SimpleFacotry;

import CreationPattern.SimpleFacotry.CarElements.Engine;
import CreationPattern.SimpleFacotry.CarElements.Seat;
import CreationPattern.SimpleFacotry.CarElements.Wheel;
import CreationPattern.SimpleFacotry.CarElements.Window;

class BMW implements Car {
    // why use factory?
    // Demeter Principle, let the client know as less as they can, how the car is built

    private Wheel wheel;
    private Engine engine;
    private Window window;
    private Seat seat;

    // Don't make owner final because there is second hand car
    private String owner;


    BMW(String buyer) {
        this.wheel = new Wheel();
        this.engine = new Engine();
        this.window = new Window();
        this.seat = new Seat();

        this.owner = buyer;

        System.out.println("New BMW for " + this.owner + " is created");
    }

    @Override
    public void run() {
        System.out.println(this.owner + "'s BMW is running");
    }
}

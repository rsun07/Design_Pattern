package CreationPatterns.SimpleFacotry;

import CreationPatterns.SimpleFacotry.CarElements.Engine;
import CreationPatterns.SimpleFacotry.CarElements.Seat;
import CreationPatterns.SimpleFacotry.CarElements.Wheel;
import CreationPatterns.SimpleFacotry.CarElements.Window;

public class BMW implements Car {
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

    public static Car buildBMW(String buyer) {
        return new BMW(buyer);
    }
}

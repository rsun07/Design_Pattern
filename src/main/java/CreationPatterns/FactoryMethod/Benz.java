package CreationPatterns.FactoryMethod;

import CreationPatterns.SimpleFacotry.Car;

public class Benz implements Car {

    private String owner;

    private Benz(String buyer) {
        this.owner = buyer;
        System.out.println("New Benz for " + this.owner + " is created");
    }

    public static Car buildNewBenz(String buyer) {
        return new Benz(buyer);
    }

    @Override
    public void run() {
        System.out.println(this.owner + "'s Benz is running");
    }
}

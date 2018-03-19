package behavioralpattern.commandpattern;

// Receiver
public class Restaurant {
    void orderPickup() {
        System.out.println("Order Pick up");
    }

    void orderDeliver() {
        System.out.println("Order Deliver");
    }
}

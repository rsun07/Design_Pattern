package BehavioralPattern.CommandPattern;

public class OrderPickup extends Command {


    public OrderPickup(Restaurant restaurant) {
        super(restaurant);
    }

    @Override
    public void execute() {
        this.restaurant.orderPickup();
    }
}

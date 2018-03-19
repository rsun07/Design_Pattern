package behavioralpattern.commandpattern;

public class OrderDeliver extends Command {

    OrderDeliver(Restaurant restaurant) {
        super(restaurant);
    }

    @Override
    void execute() {
        this.restaurant.orderDeliver();
    }
}

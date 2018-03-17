package BehavioralPattern.CommandPattern;

import org.junit.Test;

public class OrderTest {
    @Test
    public void test() {
        Restaurant restaurant = new Restaurant();
        Command orderDeliver = new OrderDeliver(restaurant);
        Command orderPickup = new OrderPickup(restaurant);

        Waiter waiter = new Waiter(orderPickup);
        waiter.order();

        waiter.setCommand(orderDeliver);
        waiter.order();
    }
}

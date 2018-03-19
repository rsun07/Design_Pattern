package behavioralpattern.strategypattern;

public class BlackFridayStrategy implements DiscountStrategy {
    @Override
    public double cost(double cost) {
        return cost * 0.8;
    }

    @Override
    public String description() {
        return "Black Friday Discount";
    }
}

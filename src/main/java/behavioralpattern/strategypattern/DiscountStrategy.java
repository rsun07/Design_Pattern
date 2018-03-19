package behavioralpattern.strategypattern;

public interface DiscountStrategy {
    default double cost(double cost) {
        return cost;
    };

    String description();
}

package StructuralPattern.StrategyPattern;

public interface DiscountStrategy {
    default double cost(double cost) {
        return cost;
    };

    String description();
}

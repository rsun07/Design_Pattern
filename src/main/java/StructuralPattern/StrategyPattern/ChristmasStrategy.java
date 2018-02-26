package StructuralPattern.StrategyPattern;

public class ChristmasStrategy implements DiscountStrategy {

    @Override
    public double cost(double cost) {
        if (cost > 1000) {
            return cost - 200;
        } else if (cost > 800) {
            return cost - 150;
        } else if (cost > 600) {
            return cost - 100;
        } else if (cost > 400) {
            return cost - 50;
        } else if (cost > 200) {
            return cost - 20;
        } else {
            return cost;
        }
    }

    @Override
    public String description() {
        return "Christmas Discount";
    }
}

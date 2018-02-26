package StructuralPattern.StrategyPattern;

public class Shop {
    private DiscountStrategy discountDiscountStrategy;

    public Shop(DiscountStrategy discountStrategy) {
        this.discountDiscountStrategy = discountStrategy;
    }

    public double total(double price) {
        return discountDiscountStrategy.cost(price);
    }

    public String getDiscountDiscountStrategy() {
        return discountDiscountStrategy.description();
    }
}

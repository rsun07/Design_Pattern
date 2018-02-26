package SturcturalPattern.StrategyPattern;

import StructuralPattern.StrategyPattern.BlackFridayStrategy;
import StructuralPattern.StrategyPattern.ChristmasStrategy;
import StructuralPattern.StrategyPattern.MonthlySalesStrategy;
import StructuralPattern.StrategyPattern.Shop;
import org.junit.Test;

public class ShopTest {
    @Test
    public void testBlackFridayStrategy() {
        Shop shop = new Shop(new BlackFridayStrategy());
        print(shop, 100);
    }

    @Test
    public void testMonthlySalesDiscount() {
        Shop shop = new Shop(new MonthlySalesStrategy());
        print(shop, 100);
    }

    @Test
    public void testChristmasDiscount() {
        Shop shop = new Shop(new ChristmasStrategy());
        print(shop, 1200);
        print(shop, 900);
        print(shop, 600);
        print(shop, 700);
        print(shop, 120);
    }

    private void print(Shop shop, double price) {
        System.out.printf(
                "Original Price is : %.2f\n" +
                "Currently under %s,\n" +
                "Current price is: %.2f\n\n",
                price,
                shop.getDiscountDiscountStrategy(),
                shop.total(price));
    }

    @Test
    public void testWithFactoryPattern() {

    }
}

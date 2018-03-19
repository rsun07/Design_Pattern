package behavioralpattern.strategypattern;

import java.util.Calendar;

public class DiscontStrategySimpleFactory {
    public DiscountStrategy getStrategy(Calendar date) {
        if (date.before(Calendar.DECEMBER) && date.after(Calendar.DECEMBER - 7)) {
            return new BlackFridayStrategy();
        } else if (date.before(Calendar.JANUARY) && date.after(Calendar.JANUARY - 7)) {
            return new ChristmasStrategy();
        } else {
            return new MonthlySalesStrategy();
        }
    }
}

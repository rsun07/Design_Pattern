package StructuralPattern.StrategyPattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MonthlySalesStrategy implements DiscountStrategy {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("MMM-yyyy");

    @Override
    public double cost(double cost) {
        return cost*0.9;
    }

    @Override
    public String description() {
        return DATE_FORMAT.format(Calendar.getInstance().getTime()) + " Sales Discount";
    }
}

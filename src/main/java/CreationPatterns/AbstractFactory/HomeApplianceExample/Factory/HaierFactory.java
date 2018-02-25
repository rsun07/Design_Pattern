package CreationPatterns.AbstractFactory.HomeApplianceExample.Factory;

import CreationPatterns.AbstractFactory.HomeApplianceExample.AirConditioner.AirConditioner;
import CreationPatterns.AbstractFactory.HomeApplianceExample.AirConditioner.HaierAirConditioner;
import CreationPatterns.AbstractFactory.HomeApplianceExample.Refrigerator.HaierRefrigerator;
import CreationPatterns.AbstractFactory.HomeApplianceExample.Refrigerator.Refrigerator;
import CreationPatterns.AbstractFactory.HomeApplianceExample.TV.HaierTV;
import CreationPatterns.AbstractFactory.HomeApplianceExample.TV.TV;

public class HaierFactory implements HomeApplianceFactory {
    // Singleton Pattern
    // Eager initialization
    private static HomeApplianceFactory HAIER_FACTORY;

    public static synchronized HomeApplianceFactory getHaierFactory() {
        if (HAIER_FACTORY == null) {
            HAIER_FACTORY = new HaierFactory();
        }
        return HAIER_FACTORY;
    }


    @Override
    public TV buyTV() {
        return HaierTV.getHaierTV();
    }

    @Override
    public Refrigerator buyRefregirator() {
        return HaierRefrigerator.getHaierRefrigerator();
    }

    @Override
    public AirConditioner buyAirConditioner() {
        return HaierAirConditioner.getHaierAirConditioner();
    }
}

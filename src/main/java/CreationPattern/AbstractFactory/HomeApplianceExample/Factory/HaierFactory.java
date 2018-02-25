package CreationPattern.AbstractFactory.HomeApplianceExample.Factory;

import CreationPattern.AbstractFactory.HomeApplianceExample.AirConditioner.AirConditioner;
import CreationPattern.AbstractFactory.HomeApplianceExample.AirConditioner.HaierAirConditioner;
import CreationPattern.AbstractFactory.HomeApplianceExample.Refrigerator.HaierRefrigerator;
import CreationPattern.AbstractFactory.HomeApplianceExample.Refrigerator.Refrigerator;
import CreationPattern.AbstractFactory.HomeApplianceExample.TV.HaierTV;
import CreationPattern.AbstractFactory.HomeApplianceExample.TV.TV;

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

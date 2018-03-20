package creationpatterns.abstractfactory.HomeApplianceExample.Factory;

import creationpatterns.abstractfactory.HomeApplianceExample.AirConditioner.AirConditioner;
import creationpatterns.abstractfactory.HomeApplianceExample.AirConditioner.HaierAirConditioner;
import creationpatterns.abstractfactory.HomeApplianceExample.Refrigerator.HaierRefrigerator;
import creationpatterns.abstractfactory.HomeApplianceExample.Refrigerator.Refrigerator;
import creationpatterns.abstractfactory.HomeApplianceExample.TV.HaierTV;
import creationpatterns.abstractfactory.HomeApplianceExample.TV.TV;

public class HaierFactory implements HomeApplianceFactory {
    // singleton Pattern
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

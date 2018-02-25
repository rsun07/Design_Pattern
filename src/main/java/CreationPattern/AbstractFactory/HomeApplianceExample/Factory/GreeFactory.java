package CreationPattern.AbstractFactory.HomeApplianceExample.Factory;

import CreationPattern.AbstractFactory.HomeApplianceExample.AirConditioner.AirConditioner;
import CreationPattern.AbstractFactory.HomeApplianceExample.AirConditioner.GreeAirConditioner;
import CreationPattern.AbstractFactory.HomeApplianceExample.Refrigerator.GreeRefrigerator;
import CreationPattern.AbstractFactory.HomeApplianceExample.Refrigerator.Refrigerator;
import CreationPattern.AbstractFactory.HomeApplianceExample.TV.GreeTV;
import CreationPattern.AbstractFactory.HomeApplianceExample.TV.TV;

public class GreeFactory implements HomeApplianceFactory {

    // Singleton Pattern
    // Eager initialization
    private static final HomeApplianceFactory GREE_FACTORY = new GreeFactory();

    public static HomeApplianceFactory getGreeFactory() {
        return GREE_FACTORY;
    }


    @Override
    public TV buyTV() {
        return GreeTV.getGreeTV();
    }

    @Override
    public Refrigerator buyRefregirator() {
        return GreeRefrigerator.getGreeRefrigerator();
    }

    @Override
    public AirConditioner buyAirConditioner() {
        return GreeAirConditioner.getGreeAirConditioner();
    }
}

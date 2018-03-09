package CreationPatterns.AbstractFactory.HomeApplianceExample.Factory;

import CreationPatterns.AbstractFactory.HomeApplianceExample.AirConditioner.AirConditioner;
import CreationPatterns.AbstractFactory.HomeApplianceExample.AirConditioner.GreeAirConditioner;
import CreationPatterns.AbstractFactory.HomeApplianceExample.Refrigerator.GreeRefrigerator;
import CreationPatterns.AbstractFactory.HomeApplianceExample.Refrigerator.Refrigerator;
import CreationPatterns.AbstractFactory.HomeApplianceExample.TV.GreeTV;
import CreationPatterns.AbstractFactory.HomeApplianceExample.TV.TV;

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

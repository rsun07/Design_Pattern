package creationpatterns.abstractfactory.HomeApplianceExample.Factory;

import creationpatterns.abstractfactory.HomeApplianceExample.AirConditioner.AirConditioner;
import creationpatterns.abstractfactory.HomeApplianceExample.AirConditioner.GreeAirConditioner;
import creationpatterns.abstractfactory.HomeApplianceExample.Refrigerator.GreeRefrigerator;
import creationpatterns.abstractfactory.HomeApplianceExample.Refrigerator.Refrigerator;
import creationpatterns.abstractfactory.HomeApplianceExample.TV.GreeTV;
import creationpatterns.abstractfactory.HomeApplianceExample.TV.TV;

public class GreeFactory implements HomeApplianceFactory {

    // singleton Pattern
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

package creationpatterns.abstractfactory.HomeApplianceExample.Factory;

import creationpatterns.abstractfactory.HomeApplianceExample.AirConditioner.AirConditioner;
import creationpatterns.abstractfactory.HomeApplianceExample.AirConditioner.HisenseAirConditioner;
import creationpatterns.abstractfactory.HomeApplianceExample.Refrigerator.HisenseRefrigerator;
import creationpatterns.abstractfactory.HomeApplianceExample.Refrigerator.Refrigerator;
import creationpatterns.abstractfactory.HomeApplianceExample.TV.HisenseTV;
import creationpatterns.abstractfactory.HomeApplianceExample.TV.TV;

public class HisenseFactory implements HomeApplianceFactory {

    private static HomeApplianceFactory HISENSE_FACTORY;

    public static HomeApplianceFactory getHisenseFactory() {
        if (HISENSE_FACTORY == null) {
            synchronized (HisenseFactory.class) {
                if (HISENSE_FACTORY == null) {
                    HISENSE_FACTORY = new HaierFactory();
                }
            }
        }
        return HISENSE_FACTORY;
    }

    @Override
    public TV buyTV() {
        return HisenseTV.getHisenseTV();
    }

    @Override
    public Refrigerator buyRefregirator() {
        return HisenseRefrigerator.getHisenseRefrigerator();
    }

    @Override
    public AirConditioner buyAirConditioner() {
        return HisenseAirConditioner.getHisenseAirConditioner();
    }
}

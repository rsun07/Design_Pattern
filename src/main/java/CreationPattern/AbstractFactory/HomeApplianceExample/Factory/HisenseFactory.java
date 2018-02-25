package CreationPattern.AbstractFactory.HomeApplianceExample.Factory;

import CreationPattern.AbstractFactory.HomeApplianceExample.AirConditioner.AirConditioner;
import CreationPattern.AbstractFactory.HomeApplianceExample.AirConditioner.HisenseAirConditioner;
import CreationPattern.AbstractFactory.HomeApplianceExample.Refrigerator.HisenseRefrigerator;
import CreationPattern.AbstractFactory.HomeApplianceExample.Refrigerator.Refrigerator;
import CreationPattern.AbstractFactory.HomeApplianceExample.TV.HisenseTV;
import CreationPattern.AbstractFactory.HomeApplianceExample.TV.TV;

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

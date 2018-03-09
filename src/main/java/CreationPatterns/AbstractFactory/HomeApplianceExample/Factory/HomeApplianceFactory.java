package CreationPatterns.AbstractFactory.HomeApplianceExample.Factory;

import CreationPatterns.AbstractFactory.HomeApplianceExample.AirConditioner.AirConditioner;
import CreationPatterns.AbstractFactory.HomeApplianceExample.Refrigerator.Refrigerator;
import CreationPatterns.AbstractFactory.HomeApplianceExample.TV.TV;

public interface HomeApplianceFactory {
    TV buyTV();

    Refrigerator buyRefregirator();

    AirConditioner buyAirConditioner();
}

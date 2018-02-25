package CreationPattern.AbstractFactory.HomeApplianceExample.Factory;

import CreationPattern.AbstractFactory.HomeApplianceExample.AirConditioner.AirConditioner;
import CreationPattern.AbstractFactory.HomeApplianceExample.Refrigerator.Refrigerator;
import CreationPattern.AbstractFactory.HomeApplianceExample.TV.TV;

public interface HomeApplianceFactory {
    TV buyTV();

    Refrigerator buyRefregirator();

    AirConditioner buyAirConditioner();
}

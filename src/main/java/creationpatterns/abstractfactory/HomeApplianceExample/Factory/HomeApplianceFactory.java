package creationpatterns.abstractfactory.HomeApplianceExample.Factory;

import creationpatterns.abstractfactory.HomeApplianceExample.AirConditioner.AirConditioner;
import creationpatterns.abstractfactory.HomeApplianceExample.Refrigerator.Refrigerator;
import creationpatterns.abstractfactory.HomeApplianceExample.TV.TV;

public interface HomeApplianceFactory {
    TV buyTV();

    Refrigerator buyRefregirator();

    AirConditioner buyAirConditioner();
}

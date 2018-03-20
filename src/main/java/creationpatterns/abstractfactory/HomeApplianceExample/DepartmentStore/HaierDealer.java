package creationpatterns.abstractfactory.HomeApplianceExample.DepartmentStore;

import creationpatterns.abstractfactory.HomeApplianceExample.Factory.HaierFactory;
import creationpatterns.abstractfactory.HomeApplianceExample.Factory.HomeApplianceFactory;

public class HaierDealer implements DepartmentStore {
    private static final HomeApplianceFactory HAIER_FACTORY = HaierFactory.getHaierFactory();

    public static HomeApplianceFactory getHaierDealerMenu() {
        return HAIER_FACTORY;
    }
}

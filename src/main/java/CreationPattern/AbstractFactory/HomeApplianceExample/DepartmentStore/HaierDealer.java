package CreationPattern.AbstractFactory.HomeApplianceExample.DepartmentStore;

import CreationPattern.AbstractFactory.HomeApplianceExample.Factory.HaierFactory;
import CreationPattern.AbstractFactory.HomeApplianceExample.Factory.HomeApplianceFactory;

public class HaierDealer implements DepartmentStore {
    private static final HomeApplianceFactory HAIER_FACTORY = HaierFactory.getHaierFactory();

    public static HomeApplianceFactory getHaierDealerMenu() {
        return HAIER_FACTORY;
    }

    public static void main(String[] args) {
        HaierDealer.getHaierDealerMenu().buyRefregirator();
        HaierDealer.getHaierDealerMenu().buyAirConditioner();

    }
}

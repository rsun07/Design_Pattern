package creationpatterns.abstractfactory.HomeApplianceExample.DepartmentStore;

import creationpatterns.abstractfactory.HomeApplianceExample.Factory.GreeFactory;
import creationpatterns.abstractfactory.HomeApplianceExample.Factory.HaierFactory;
import creationpatterns.abstractfactory.HomeApplianceExample.Factory.HisenseFactory;
import creationpatterns.abstractfactory.HomeApplianceExample.Factory.HomeApplianceFactory;
import creationpatterns.abstractfactory.HomeApplianceExample.TV.TV;

public class ShoppingMall implements DepartmentStore {

    private final HomeApplianceFactory haierFactory;
    private final HomeApplianceFactory hisenseFactory;
    private final HomeApplianceFactory greeFactory;


    private ShoppingMall() {
        this.haierFactory = HaierFactory.getHaierFactory();
        this.greeFactory = GreeFactory.getGreeFactory();
        this.hisenseFactory = HisenseFactory.getHisenseFactory();
    }

    public TV purchaseTV(String factory) throws ClassNotFoundException {
        switch (factory.toLowerCase()) {
            case "haier" :
                return haierFactory.buyTV();
            case "hisense" :
                return hisenseFactory.buyTV();
            case "gree":
                return greeFactory.buyTV();
            default:
                throw new ClassNotFoundException("Factory not support");
        }
    }

    public static ShoppingMall initShoppingMall() {
        return new ShoppingMall();
    }
}

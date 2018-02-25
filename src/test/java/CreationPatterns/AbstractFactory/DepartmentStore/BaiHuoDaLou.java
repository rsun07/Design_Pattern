package CreationPatterns.AbstractFactory.DepartmentStore;

import CreationPatterns.AbstractFactory.HomeApplianceExample.Factory.GreeFactory;
import CreationPatterns.AbstractFactory.HomeApplianceExample.Factory.HaierFactory;
import CreationPatterns.AbstractFactory.HomeApplianceExample.Factory.HisenseFactory;
import CreationPatterns.AbstractFactory.HomeApplianceExample.Factory.HomeApplianceFactory;

public class BaiHuoDaLou implements DepartmentStore {

    private final HomeApplianceFactory haierFactory;
    private final HomeApplianceFactory hisenseFactory;
    private final HomeApplianceFactory greeFactory;


    private BaiHuoDaLou() {
        this.haierFactory = HaierFactory.getHaierFactory();
        this.greeFactory = GreeFactory.getGreeFactory();
        this.hisenseFactory = HisenseFactory.getHisenseFactory();
    }

    void todaysDeals() {
        haierFactory.buyAirConditioner();
        haierFactory.buyAirConditioner();
        haierFactory.buyRefregirator();
        hisenseFactory.buyTV();
        greeFactory.buyAirConditioner();
        greeFactory.buyAirConditioner();
        greeFactory.buyAirConditioner();
        haierFactory.buyTV();
        greeFactory.buyRefregirator();
        hisenseFactory.buyRefregirator();
    }


    public static void main(String[] args) {

        final BaiHuoDaLou BEST_BUY_90025 = new BaiHuoDaLou();

        BEST_BUY_90025.todaysDeals();
    }
}

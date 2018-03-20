package creationpatterns.abstractfactory.HomeApplianceExample.Refrigerator;

public class HisenseRefrigerator implements Refrigerator {
    private HisenseRefrigerator() {
        System.out.println("HisenseRefrigerator!");
    }

    public static Refrigerator getHisenseRefrigerator() {
        return new HisenseRefrigerator();
    }
}

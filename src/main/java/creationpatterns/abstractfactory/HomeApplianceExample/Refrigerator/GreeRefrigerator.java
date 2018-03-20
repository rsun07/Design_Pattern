package creationpatterns.abstractfactory.HomeApplianceExample.Refrigerator;

public class GreeRefrigerator implements Refrigerator {
    private GreeRefrigerator() {
        System.out.println("GreeRefrigerator!");
    }

    public static Refrigerator getGreeRefrigerator() {
        return new GreeRefrigerator();
    }
}

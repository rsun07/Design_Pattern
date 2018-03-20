package creationpatterns.abstractfactory.HomeApplianceExample.Refrigerator;

public class HaierRefrigerator implements Refrigerator {
    private HaierRefrigerator() {
        System.out.println("HaierRefrigerator!");
    }

    public static Refrigerator getHaierRefrigerator() {
        return new HaierRefrigerator();
    }
}

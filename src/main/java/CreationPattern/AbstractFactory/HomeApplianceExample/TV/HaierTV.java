package CreationPattern.AbstractFactory.HomeApplianceExample.TV;

public class HaierTV implements TV {
    private HaierTV() {
        System.out.println("HaierTV!");
    }

    public static TV getHaierTV() {
        return new HaierTV();
    }
}

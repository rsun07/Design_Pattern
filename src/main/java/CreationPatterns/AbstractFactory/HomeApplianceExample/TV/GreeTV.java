package CreationPatterns.AbstractFactory.HomeApplianceExample.TV;

public class GreeTV implements TV {
    private GreeTV() {
        System.out.println("GreeTV!");
    }

    public static TV getGreeTV() {
        return new GreeTV();
    }
}

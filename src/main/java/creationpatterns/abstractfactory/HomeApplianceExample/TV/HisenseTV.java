package creationpatterns.abstractfactory.HomeApplianceExample.TV;

public class HisenseTV implements TV {
    private HisenseTV() {
        System.out.println("HisenseTV!");
    }

    public static TV getHisenseTV() {
        return new HisenseTV();
    }
}

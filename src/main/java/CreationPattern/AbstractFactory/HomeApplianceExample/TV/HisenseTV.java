package CreationPattern.AbstractFactory.HomeApplianceExample.TV;

import CreationPattern.AbstractFactory.HomeApplianceExample.Refrigerator.Refrigerator;

public class HisenseTV implements TV {
    private HisenseTV() {
        System.out.println("HisenseTV!");
    }

    public static TV getHisenseTV() {
        return new HisenseTV();
    }
}

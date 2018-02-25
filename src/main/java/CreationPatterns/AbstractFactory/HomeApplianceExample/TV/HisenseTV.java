package CreationPatterns.AbstractFactory.HomeApplianceExample.TV;

import CreationPatterns.AbstractFactory.HomeApplianceExample.Refrigerator.Refrigerator;

public class HisenseTV implements TV {
    private HisenseTV() {
        System.out.println("HisenseTV!");
    }

    public static TV getHisenseTV() {
        return new HisenseTV();
    }
}

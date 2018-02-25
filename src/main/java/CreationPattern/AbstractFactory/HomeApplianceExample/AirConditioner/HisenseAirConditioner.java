package CreationPattern.AbstractFactory.HomeApplianceExample.AirConditioner;

public class HisenseAirConditioner implements AirConditioner {
    private HisenseAirConditioner() {
        System.out.println("Hisense Air Conditioner!");
    }

    public static AirConditioner getHisenseAirConditioner() {
        return new HisenseAirConditioner();
    }
}

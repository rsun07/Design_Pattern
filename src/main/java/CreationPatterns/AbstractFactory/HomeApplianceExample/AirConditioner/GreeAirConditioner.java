package CreationPatterns.AbstractFactory.HomeApplianceExample.AirConditioner;

public class GreeAirConditioner implements AirConditioner {
    private GreeAirConditioner() {
        System.out.println("Gree Air Conditioner!");
    }

    public static AirConditioner getGreeAirConditioner() {
        return new GreeAirConditioner();
    }
}

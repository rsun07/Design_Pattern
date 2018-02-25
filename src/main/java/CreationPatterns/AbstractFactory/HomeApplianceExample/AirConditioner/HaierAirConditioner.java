package CreationPatterns.AbstractFactory.HomeApplianceExample.AirConditioner;

public class HaierAirConditioner implements AirConditioner {
    private HaierAirConditioner() {
        System.out.println("Haier Air Conditioner!");
    }

    public static AirConditioner getHaierAirConditioner() {
        return new HaierAirConditioner();
    }
}

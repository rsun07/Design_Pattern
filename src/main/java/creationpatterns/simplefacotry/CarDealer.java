package creationpatterns.simplefacotry;

public class CarDealer {
    public static void main(String[] args) throws ClassNotFoundException {
        // A customer what to buy a BMW
        Car JohnsBMW = CarFactory.getNewCar("BMW", "John");
        JohnsBMW.run();

        Car RyansToyota = CarFactory.getNewCarReflection("Toyota", "Ryan");
        RyansToyota.run();
    }
}

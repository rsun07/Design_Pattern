package creationpatterns.factorymethod;

import creationpatterns.simplefacotry.Car;

public class CarDealer {
    private CarFactory BMWFactory = new BMWFactory();
    private CarFactory benzFactory = new BenzFactory();
    private CarFactory toyotaFactory = new ToyotaFactory();

    public static void main(String[] args) {
        CarDealer dealerWu = new CarDealer();
        dealerWu.todaysDeal();
    }

    private void todaysDeal() {
        Car johnsBenz = benzFactory.buildCar("John");
        johnsBenz.run();

        Car RyansToyora = toyotaFactory.buildCar("Ryan");
        RyansToyora.run();

        Car TheasBMW = BMWFactory.buildCar("Thea");
        TheasBMW.run();

        Car Jinstoyora = toyotaFactory.buildCar("jin");
        Jinstoyora.run();
    }

}

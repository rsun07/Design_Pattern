package creationpatterns.factorymethod;

import creationpatterns.simplefacotry.Car;

public class BenzFactory implements CarFactory {
    @Override
    public Car buildCar(String buyer) {
        return Benz.buildNewBenz(buyer);
    }
}

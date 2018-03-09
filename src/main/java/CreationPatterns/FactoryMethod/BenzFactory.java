package CreationPatterns.FactoryMethod;

import CreationPatterns.SimpleFacotry.Car;

public class BenzFactory implements CarFactory {
    @Override
    public Car buildCar(String buyer) {
        return Benz.buildNewBenz(buyer);
    }
}

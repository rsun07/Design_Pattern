package CreationPatterns.FactoryMethod;

import CreationPatterns.SimpleFacotry.Car;
import CreationPatterns.SimpleFacotry.Toyota;

public class ToyotaFactory implements CarFactory {

    @Override
    public Car buildCar(String buyer) {
        return Toyota.buildToyota(buyer);
    }
}

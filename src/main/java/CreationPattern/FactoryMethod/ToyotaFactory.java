package CreationPattern.FactoryMethod;

import CreationPattern.SimpleFacotry.Car;
import CreationPattern.SimpleFacotry.Toyota;

public class ToyotaFactory implements CarFactory {

    @Override
    public Car buildCar(String buyer) {
        return Toyota.buildToyota(buyer);
    }
}

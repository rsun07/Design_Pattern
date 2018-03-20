package creationpatterns.factorymethod;

import creationpatterns.simplefacotry.Car;
import creationpatterns.simplefacotry.Toyota;

public class ToyotaFactory implements CarFactory {

    @Override
    public Car buildCar(String buyer) {
        return Toyota.buildToyota(buyer);
    }
}

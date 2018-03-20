package creationpatterns.factorymethod;

import creationpatterns.simplefacotry.BMW;
import creationpatterns.simplefacotry.Car;

public class BMWFactory implements CarFactory {

    @Override
    public Car buildCar(String buyer) {
        return BMW.buildBMW(buyer);
    }
}

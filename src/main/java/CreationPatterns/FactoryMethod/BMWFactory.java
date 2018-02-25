package CreationPatterns.FactoryMethod;

import CreationPatterns.SimpleFacotry.BMW;
import CreationPatterns.SimpleFacotry.Car;

public class BMWFactory implements CarFactory {

    @Override
    public Car buildCar(String buyer) {
        return BMW.buildBMW(buyer);
    }
}

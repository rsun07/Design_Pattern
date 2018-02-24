package CreationPattern.FactoryMethod;

import CreationPattern.SimpleFacotry.BMW;
import CreationPattern.SimpleFacotry.Car;

public class BMWFactory implements CarFactory {

    @Override
    public Car buildCar(String buyer) {
        return BMW.buildBMW(buyer);
    }
}

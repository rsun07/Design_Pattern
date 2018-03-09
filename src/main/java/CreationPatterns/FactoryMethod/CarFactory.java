package CreationPatterns.FactoryMethod;

import CreationPatterns.SimpleFacotry.Car;

public interface CarFactory {
    Car buildCar(String buyer);
}

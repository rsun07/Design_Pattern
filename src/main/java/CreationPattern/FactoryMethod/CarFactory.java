package CreationPattern.FactoryMethod;

import CreationPattern.SimpleFacotry.Car;

public interface CarFactory {
    Car buildCar(String buyer);
}

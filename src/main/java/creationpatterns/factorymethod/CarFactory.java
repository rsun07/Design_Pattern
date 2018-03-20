package creationpatterns.factorymethod;

import creationpatterns.simplefacotry.Car;

public interface CarFactory {
    Car buildCar(String buyer);
}

package structuralpattern.decoratorpattern.AddOn;

import structuralpattern.decoratorpattern.BasicCar.Car;

public abstract class CarAddOn extends Car {
    public boolean isAddedOn() {
        return true;
    }
}
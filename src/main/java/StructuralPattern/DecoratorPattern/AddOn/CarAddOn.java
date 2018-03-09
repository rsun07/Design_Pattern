package StructuralPattern.DecoratorPattern.AddOn;

import StructuralPattern.DecoratorPattern.BasicCar.Car;

public abstract class CarAddOn extends Car {
    public boolean isAddedOn() {
        return true;
    }
}
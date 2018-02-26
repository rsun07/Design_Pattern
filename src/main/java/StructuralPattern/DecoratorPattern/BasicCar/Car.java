package StructuralPattern.DecoratorPattern.BasicCar;

public abstract class Car {
    String description;

    public abstract int price();

    public String getDescription() {
        return "This is a car";
    };

}

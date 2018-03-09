package StructuralPattern.DecoratorPattern.BasicCar;

public class Nissan extends Car {

    private String description;

    public Nissan() {
        description = "This is a basic Nissan Car ";
    }

    @Override
    public int price() {
        return 20000;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

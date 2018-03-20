package structuralpattern.decoratorpattern.AddOn;

import structuralpattern.decoratorpattern.BasicCar.Car;

public class Turbo extends CarAddOn {
    private Car car;

    public Turbo(Car car) {
        this.car = car;
    }

    @Override
    public int price() {
        return car.price() + 10000;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", with addon Turbo!";
    }
}

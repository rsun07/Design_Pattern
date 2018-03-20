package structuralpattern.decoratorpattern.AddOn;

import structuralpattern.decoratorpattern.BasicCar.Car;

public class NOS extends CarAddOn {
    private Car car;

    public NOS(Car car) {
        this.car = car;
    }

    @Override
    public int price() {
        return car.price() + 20000;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", with addon NOS!";
    }
}

package structuralpattern.decoratorpattern.AddOn;

import structuralpattern.decoratorpattern.BasicCar.Car;

public class SelfDriving extends CarAddOn {
    private Car car;

    public SelfDriving(Car car) {
        this.car = car;
    }

    @Override
    public int price() {
        return car.price() + 18000;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", with addon Self Driving!";
    }
}

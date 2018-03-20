package sturcturalpattern.decoratorpattern;

import structuralpattern.decoratorpattern.AddOn.NOS;
import structuralpattern.decoratorpattern.AddOn.SelfDriving;
import structuralpattern.decoratorpattern.AddOn.Turbo;
import structuralpattern.decoratorpattern.BasicCar.Car;
import structuralpattern.decoratorpattern.BasicCar.Nissan;
import structuralpattern.decoratorpattern.BasicCar.Tesla;
import org.junit.Test;

public class CarDecoratorTest {

    @Test
    public void testNissan() {
        Car car = new Nissan();
        print(car);

        car = new NOS(car);
        print(car);

        car = new Turbo(car);
        print(car);
    }

    @Test
    public void testTesla() {
        Car car = new Tesla();
        print(car);

        car = new SelfDriving(car);
        print(car);
    }

    private void print(Car car) {
        System.out.println(car.getDescription() + "\nPrice is :" +  car.price() + "\n");
    }
}

package SturcturalPattern.DecoratorPattern;

import StructuralPattern.DecoratorPattern.AddOn.NOS;
import StructuralPattern.DecoratorPattern.AddOn.SelfDriving;
import StructuralPattern.DecoratorPattern.AddOn.Turbo;
import StructuralPattern.DecoratorPattern.BasicCar.Car;
import StructuralPattern.DecoratorPattern.BasicCar.Nissan;
import StructuralPattern.DecoratorPattern.BasicCar.Tesla;
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

package structuralpattern.decoratorpattern.BasicCar;

public class Tesla extends Car {

    private String description;

    public Tesla() {
        description = "This is a Basic Tesla Car";
    }

    @Override
    public int price() {
        return 30000;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

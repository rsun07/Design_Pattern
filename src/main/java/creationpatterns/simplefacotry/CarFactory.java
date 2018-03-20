package creationpatterns.simplefacotry;

import java.lang.reflect.InvocationTargetException;

public class CarFactory {

    // traditional switch strategy
    // we use static here for simple factory
    public static Car getNewCar(String type, String buyer) throws ClassNotFoundException {
        // Java Switch only allow bit, char, int, short
        // cannot switch String
        // In Java 7 SE, it is allowed to switch String
        switch(type) {
            case "BMW" :
                return new BMW(buyer);
                // or use BMW.class.newInstance();
            case "Toyota":
                return new Toyota(buyer);
            default:
                throw new ClassNotFoundException("Car type not found!");
        }
    }


    // reflection is less flexible than the switch
    // And switch could re-write with if-else
    // For example, we can call BMW "BMW", "bmw", "Bmw", "B" or even give client an number mapping
    // the benefit reflection bring in to us is extendable.
    // It's easy to extend new Car type with reflection

    private final static String CLASS_PATH = "creationpatterns.simplefacotry.";

    public static Car getNewCarReflection(String type, String buyer) throws ClassNotFoundException {
        try {
            Class carClass = Class.forName(CLASS_PATH+type);

            // for parameters
            Class[] classArgs = new Class[1];
            classArgs[0] = String.class;

            return (Car) carClass.getDeclaredConstructor(classArgs).newInstance(buyer);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException
                | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException("Car type not found!");
    }
}

package CreationPatterns.Singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class ReflectionDestorySingletonTest {
    @Test
    public void test() {

        Singleton singleton1 = EagerInitialization.getEagerInitialization();
        Singleton singleton2 = null;
        Singleton singleton3 = null;

        try {
            Constructor<?>[] constructors = EagerInitialization.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                singleton2 = (EagerInitialization) constructor.newInstance("Reflection Initialization Destroy Singleton");
                singleton3 = (EagerInitialization) constructor.newInstance("Reflection Initialization Destroy Singleton");
            }
        } catch (IllegalAccessException | InstantiationException |  InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.printf(
                "1 : HashCode for singleton 1 : %d \n" +
                "2 : HashCode for singleton 2 : %d \n" +
                "3 : HashCode for singleton 3 : %d \n",
                singleton1.hashCode(),
                Objects.requireNonNull(singleton2).hashCode(),
                Objects.requireNonNull(singleton3).hashCode()

        );
    }

    @Test(expected = InvocationTargetException.class)
    public void testSafeConstructor() throws Exception {
        EagerInitSafeConstructor singleton1 = EagerInitSafeConstructor.getEagerInitialization();
        EagerInitSafeConstructor singleton2 = null;

        try {
            Constructor<?>[] constructors = EagerInitSafeConstructor.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                singleton2 = (EagerInitSafeConstructor) constructor.newInstance("Reflection Initialization Destroy Singleton");
            }
        }catch (IllegalAccessException | InstantiationException |  InvocationTargetException e) {
            e.printStackTrace();
            throw e;
        }

        System.out.printf(
                "1 : HashCode for singleton 1 : %d \n" +
                "2 : HashCode for singleton 2 : %d \n" +
                singleton1.hashCode(),
                Objects.requireNonNull(singleton2).hashCode()

        );
    }
}

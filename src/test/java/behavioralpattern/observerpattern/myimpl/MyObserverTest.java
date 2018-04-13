package behavioralpattern.observerpattern.myimpl;

import org.junit.Ignore;
import org.junit.Test;

public class MyObserverTest {
    @Test
    @Ignore("Demo test")
    public void test() {
        MyObservable observable = new MyObservableImpl();

        MyObserver observer1 = new MyObserverImpl("observer1");
        MyObserver observer2 = new MyObserverImpl("observer2");

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.notifyObservers();
    }
}

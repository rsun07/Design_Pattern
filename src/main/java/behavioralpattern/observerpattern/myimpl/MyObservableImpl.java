package behavioralpattern.observerpattern.myimpl;

import java.util.ArrayList;
import java.util.List;

public class MyObservableImpl implements MyObservable {
    private List<MyObserver> observers;

    public MyObservableImpl() {
        observers = new ArrayList<>();
    }

    public MyObservableImpl(List<MyObserver> observers) {
        this.observers = observers;
    }

    @Override
    public void addObserver(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (MyObserver observer : observers) {
            observer.handle();
        }
    }
}

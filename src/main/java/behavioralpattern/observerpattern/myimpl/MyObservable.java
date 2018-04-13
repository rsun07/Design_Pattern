package behavioralpattern.observerpattern.myimpl;

interface MyObservable {
    void addObserver(MyObserver observer);

    void removeObserver(MyObserver observer);

    void notifyObservers();
}

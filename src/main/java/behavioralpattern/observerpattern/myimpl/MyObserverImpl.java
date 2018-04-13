package behavioralpattern.observerpattern.myimpl;

public class MyObserverImpl implements MyObserver {
    private String name;

    public MyObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void handle() {
        System.out.println("Observer " + this.name + " notified");
    }
}

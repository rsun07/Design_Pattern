package behavioralpattern.observerpattern.myimpl;

public class MyObserverImpl implements MyObserver {
    private String name;

    @Override
    public void handle() {
        System.out.println("Observer " + this.name + " notified");
    }
}

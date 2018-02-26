package StructuralPattern.ObserverPattern.Observer.Observer;

import StructuralPattern.ObserverPattern.Observable.Blog;
import StructuralPattern.ObserverPattern.Observer.Notification.BillingNotification;
import StructuralPattern.ObserverPattern.Observer.Notification.NewArticleUpdate;
import StructuralPattern.ObserverPattern.Observer.Notification.ShutdownNotification;

import java.util.*;

public class BlogSubscriber {

    private String name;

    private Map<String, List<Observer>> subscribes;

    public BlogSubscriber(String name) {
        this.name = name;
        subscribes = new HashMap<>();
    }

    public void subscribe(Observable o) {
        if (!(o instanceof Blog)) {
            throw new IllegalArgumentException("Only subscribe Blog");
        }

        Blog blog = (Blog) o;
        subscribes.put(blog.getName(),
                Arrays.asList(
                        new NewArticleUpdate(o),
                        new BillingNotification(o),
                        new ShutdownNotification(o)
                ));
        System.out.println(name + " Subscribes " + blog.getName());
    }

    public boolean unSubscribe(Observable o) {
        if (!(o instanceof Blog)) {
            throw new IllegalArgumentException("Only unsubscribe Blog");
        }

        Blog blog = (Blog) o;
        List<Observer> notifications = subscribes.get(blog.getName());
        for (Observer notification : notifications) {
            o.deleteObserver(notification);
        }
        subscribes.remove(blog.getName());

        System.out.println(name + " unsubscribes " + blog.getName());
        return true;
    }
}

package BehavioralPattern.ObserverPattern;

import BehavioralPattern.ObserverPattern.Observable.Article;
import BehavioralPattern.ObserverPattern.Observable.Blog;
import BehavioralPattern.ObserverPattern.Observer.Notification.BillingNotification;
import BehavioralPattern.ObserverPattern.Observer.Notification.NewArticleUpdate;
import BehavioralPattern.ObserverPattern.Observer.Notification.ShutdownNotification;
import org.junit.Test;

import java.util.Observer;

public class SingleNotificationTest {
    @Test
    public void testNewArticleUpdate() {
        Blog blog = new Blog("Fun Blog");
        Observer newArticleUpdate = new NewArticleUpdate(blog);

        blog.publish(new Article("test", "test"));
    }

    @Test
    public void testBillingNotification() {
        Blog blog = new Blog("Fun Blog");
        Observer billingNotification = new BillingNotification(blog);

        blog.billingNotification();
    }

    @Test
    public void testShutdown() {
        Blog blog = new Blog("Fun Blog");
        Observer shutdownNotification = new ShutdownNotification(blog);

        blog.billingNotification();
    }
}

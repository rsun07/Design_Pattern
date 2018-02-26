package SturcturalPattern.ObserverPattern;

import StructuralPattern.ObserverPattern.Observable.Article;
import StructuralPattern.ObserverPattern.Observable.Blog;
import StructuralPattern.ObserverPattern.Observer.Notification.BillingNotification;
import StructuralPattern.ObserverPattern.Observer.Notification.NewArticleUpdate;
import StructuralPattern.ObserverPattern.Observer.Notification.ShutdownNotification;
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

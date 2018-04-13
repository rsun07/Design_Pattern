package behavioralpattern.observerpattern.blog_sub;

import behavioralpattern.observerpattern.blog_sub.observable.Article;
import behavioralpattern.observerpattern.blog_sub.observable.Blog;
import behavioralpattern.observerpattern.blog_sub.observer.Notification.BillingNotification;
import behavioralpattern.observerpattern.blog_sub.observer.Notification.NewArticleUpdate;
import behavioralpattern.observerpattern.blog_sub.observer.Notification.ShutdownNotification;
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

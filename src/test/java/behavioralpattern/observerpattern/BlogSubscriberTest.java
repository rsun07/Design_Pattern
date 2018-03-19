package behavioralpattern.observerpattern;

import behavioralpattern.observerpattern.observable.Article;
import behavioralpattern.observerpattern.observable.Blog;
import behavioralpattern.observerpattern.observer.Observer.BlogSubscriber;
import org.junit.Test;

public class BlogSubscriberTest {
    @Test
    public void testSingleBlog() throws InterruptedException {
        Blog johnBlog = new Blog("John Tech");
        BlogSubscriber blogSubscriber = new BlogSubscriber("Marry");
        blogSubscriber.subscribe(johnBlog);

        johnBlog.publish(new Article("Test Article", "content"));
        johnBlog.billingNotification();

        Thread.sleep(100);
        johnBlog.shutdown();
    }

    @Test
    public void testMultiBlog() {
        Blog johnBlog = new Blog("John Tech");
        Blog mikeBlog = new Blog("Mike");

        BlogSubscriber blogSubscriber = new BlogSubscriber("Marry");
        blogSubscriber.subscribe(johnBlog);
        blogSubscriber.subscribe(mikeBlog);

        johnBlog.publish(new Article("Test Article", "content"));
        johnBlog.billingNotification();

        mikeBlog.billingNotification();
    }

    @Test
    public void testMultiBlogSubscriber() {
        Blog johnBlog = new Blog("John Tech");

        BlogSubscriber blogSubMarry = new BlogSubscriber("Marry");
        BlogSubscriber blogSubJane = new BlogSubscriber("Jane");

        blogSubMarry.subscribe(johnBlog);
        blogSubJane.subscribe(johnBlog);

        johnBlog.publish(new Article("Test Article", "content"));
        johnBlog.billingNotification();
    }

    @Test
    public void testUnsubscribe() {
        Blog johnBlog = new Blog("John Tech");

        BlogSubscriber blogSubMarry = new BlogSubscriber("Marry");
        BlogSubscriber blogSubJane = new BlogSubscriber("Jane");

        blogSubMarry.subscribe(johnBlog);
        blogSubJane.subscribe(johnBlog);

        johnBlog.publish(new Article("Test Article", "content"));

        blogSubJane.unSubscribe(johnBlog);

        johnBlog.billingNotification();
    }
}

package behavioralpattern.observerpattern.blog_sub.observable;

import behavioralpattern.observerpattern.blog_sub.observer.Notification.NotificationType;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Blog extends Observable implements AutoCloseable {
    @Getter
    private String name;

    @Getter
    private List<Article> articles;

    public Blog(String name) {
        this.name = name;
        this.articles = new ArrayList<>();
    }

    public void publish(Article article) {
        this.articles.add(article);
        this.setChanged();
        this.notifyObservers(NotificationType.ARTICLE_UPDATE);
    }

    public void billingNotification() {
        this.setChanged();
        this.notifyObservers(NotificationType.BILLING_NOTIFICATION);
    }

    public void shutdown() {
        this.setChanged();
        this.notifyObservers(NotificationType.SHUTDOWN_NOTIFICATION);
        this.close();
    }


    @Override
    public void close() {
        this.name = null;
        this.articles = null;
    }
}

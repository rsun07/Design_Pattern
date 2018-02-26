package StructuralPattern.ObserverPattern.Observer.Notification;

import StructuralPattern.ObserverPattern.Observable.Blog;

import java.util.Observable;
import java.util.Observer;

public class NewArticleUpdate implements Observer {

    private static final String NOTIFICATION_MESSAGE =
            "New Article, from Blog <%s> is published at %s\n\n";

    public NewArticleUpdate(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println();

        if (o instanceof Blog) {
            if (arg instanceof NotificationType && arg.equals(NotificationType.ARTICLE_UPDATE)) {
                System.out.printf(NOTIFICATION_MESSAGE,
                                ((Blog) o).getName(),
                                DateProvider.today()
                );
            }
        }
    }
}

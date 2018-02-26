package StructuralPattern.ObserverPattern.Observer.Notification;

import StructuralPattern.ObserverPattern.Observable.Blog;

import java.util.Observable;
import java.util.Observer;

public class ShutdownNotification implements Observer {

    private static final String NOTIFICATION_MESSAGE =
            "The Blog <%s>, is going to shutdown at %s\n\n";

    public ShutdownNotification(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Blog) {
            if (arg instanceof NotificationType && arg.equals(NotificationType.SHUTDOWN_NOTIFICATION)) {
                System.out.printf(NOTIFICATION_MESSAGE,
                        ((Blog) o).getName(),
                        DateProvider.today()
                );
            }
        }
    }
}

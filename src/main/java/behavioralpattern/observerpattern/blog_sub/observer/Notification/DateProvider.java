package behavioralpattern.observerpattern.blog_sub.observer.Notification;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateProvider {
    static final DateFormat DATE_FORMAT = new SimpleDateFormat("MMM-dd-yyy");

    public static String today() {
        return DATE_FORMAT.format(Calendar.getInstance().getTime());
    }
}

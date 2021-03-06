package behavioralpattern.observerpattern.blog_sub.observable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {
    private String title;
    private String content;
}

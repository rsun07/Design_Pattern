package structuralpattern.proxypattern.staticproxy;

import structuralpattern.proxypattern.BookProvider;

public class PublishingHouse implements BookProvider {
    @Override
    public void provideBook() {
        System.out.println("Book provided by Publishing House");
    }
}

package structuralpattern.proxypattern.dynamicproxy;

import structuralpattern.proxypattern.BookProvider;

public class AbroadPublishingHouse implements BookProvider {
    @Override
    public void provideBook() {
        System.out.println("Book provided by Abroad Publishing House");
    }
}

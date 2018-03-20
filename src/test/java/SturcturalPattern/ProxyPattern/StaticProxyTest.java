package SturcturalPattern.ProxyPattern;

import structuralpattern.proxypattern.BookProvider;
import structuralpattern.proxypattern.staticproxy.BookShop;
import structuralpattern.proxypattern.staticproxy.PublishingHouse;
import org.junit.Test;

public class StaticProxyTest {

    @Test
    public void test() {
        BookProvider publishingHouse = new PublishingHouse();
        BookProvider bookShop = new BookShop(publishingHouse);
        bookShop.provideBook();
    }
}

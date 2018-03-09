package SturcturalPattern.ProxyPattern;

import StructuralPattern.ProxyPattern.BookProvider;
import StructuralPattern.ProxyPattern.StaticProxy.BookShop;
import StructuralPattern.ProxyPattern.StaticProxy.PublishingHouse;
import org.junit.Test;

public class StaticProxyTest {

    @Test
    public void test() {
        BookProvider publishingHouse = new PublishingHouse();
        BookProvider bookShop = new BookShop(publishingHouse);
        bookShop.provideBook();
    }
}

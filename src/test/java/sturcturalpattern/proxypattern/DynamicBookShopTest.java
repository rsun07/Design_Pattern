package sturcturalpattern.proxypattern;

import structuralpattern.proxypattern.BookProvider;
import structuralpattern.proxypattern.dynamicproxy.AbroadPublishingHouse;
import structuralpattern.proxypattern.dynamicproxy.DynamicBookShop;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class DynamicBookShopTest {
    @Test
    public void test() {
        BookProvider abroadPublishingHouse = new AbroadPublishingHouse();
        DynamicBookShop dynamicBookShop = new DynamicBookShop(abroadPublishingHouse);

        BookProvider bookProvider = (BookProvider)
                Proxy.newProxyInstance(
                        abroadPublishingHouse.getClass().getClassLoader(),
                        abroadPublishingHouse.getClass().getInterfaces(),
                        dynamicBookShop
                );
        bookProvider.provideBook();
    }
}

package SturcturalPattern.ProxyPattern;

import StructuralPattern.ProxyPattern.BookProvider;
import StructuralPattern.ProxyPattern.DynamicProxy.AbroadPublishingHouse;
import StructuralPattern.ProxyPattern.DynamicProxy.DynamicBookShop;
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

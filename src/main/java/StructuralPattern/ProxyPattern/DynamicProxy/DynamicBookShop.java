package StructuralPattern.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicBookShop implements InvocationHandler {
    private Object object;

    public DynamicBookShop(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        bookPublicity();
        Object result = method.invoke(object, args);
        bookSales();
        return result;
    }

    private void bookPublicity() {
        System.out.println("Book Publicity by Dynamic Book Shop");
    }

    private void bookSales() {
        System.out.println("Book Sales by Dynamic Book Shop");
    }
}

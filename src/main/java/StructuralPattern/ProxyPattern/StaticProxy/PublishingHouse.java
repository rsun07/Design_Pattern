package StructuralPattern.ProxyPattern.StaticProxy;

import StructuralPattern.ProxyPattern.BookProvider;

public class PublishingHouse implements BookProvider {
    @Override
    public void provideBook() {
        System.out.println("Book provided by Publishing House");
    }
}

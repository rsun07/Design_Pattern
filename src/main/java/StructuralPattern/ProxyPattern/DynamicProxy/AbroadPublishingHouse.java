package StructuralPattern.ProxyPattern.DynamicProxy;

import StructuralPattern.ProxyPattern.BookProvider;

public class AbroadPublishingHouse implements BookProvider {
    @Override
    public void provideBook() {
        System.out.println("Book provided by Abroad Publishing House");
    }
}

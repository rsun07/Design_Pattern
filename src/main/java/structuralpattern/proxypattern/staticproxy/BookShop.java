package structuralpattern.proxypattern.staticproxy;

import structuralpattern.proxypattern.BookProvider;

public class BookShop implements BookProvider {
    private BookProvider publishingHouse;

    public BookShop(BookProvider publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public void provideBook() {
        bookPublicity();
        this.publishingHouse.provideBook();
        bookSales();
    }

    private void bookPublicity() {
        System.out.println("Book Publicity");
    }

    private void bookSales() {
        System.out.println("Book Sales");
    }
}

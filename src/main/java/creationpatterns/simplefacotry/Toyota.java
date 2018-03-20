package creationpatterns.simplefacotry;

public class Toyota implements Car {
    private String owner;

    Toyota(String buyer) {
        this.owner = buyer;
        System.out.println("New Toyota for " + this.owner + " is created");
    }

    @Override
    public void run() {
        System.out.println(this.owner + "'s Toyota is running");
    }

    public static Car buildToyota(String buyer) {
        return new Toyota(buyer);
    }
}

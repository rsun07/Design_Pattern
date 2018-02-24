package CreationPattern.SimpleFacotry;

class Toyota implements Car {
    private String owner;

    Toyota(String buyer) {
        this.owner = buyer;
        System.out.println("New Toyota for " + this.owner + " is created");
    }

    @Override
    public void run() {
        System.out.println(this.owner + "'s Toyota is running");
    }
}

package structuralpattern.bridgepattern;

public class HouseFence extends Fence {

    private String address;

    public HouseFence(Painter painter, String address) {
        super(painter);
        this.address = address;
    }

    @Override
    public void paint() {
        System.out.println("Paint the HouseFence in " + address);
        painter.paint();
    }
}

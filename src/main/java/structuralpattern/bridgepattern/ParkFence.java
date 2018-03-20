package structuralpattern.bridgepattern;

public class ParkFence extends Fence {

    private String parkName;

    public ParkFence(Painter painter, String parkName) {
        super(painter);
        this.parkName = parkName;
    }

    @Override
    public void paint() {
        System.out.println("Paint the fence in " + parkName);
        painter.paint();
    }
}

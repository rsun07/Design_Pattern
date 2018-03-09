package SturcturalPattern.BridgePattern;

import StructuralPattern.BridgePattern.*;
import org.junit.Test;

public class FencePaintTest {
    @Test
    public void test() {
        Painter juniorPainter = new JuniorPainter();
        Painter seniorPainter = new SeniorPainter();

        Fence houseFence = new HouseFence(seniorPainter, "2000 Santa Monica");
        Fence parkFence = new ParkFence(juniorPainter, "Roman Park");

        houseFence.paint();
        parkFence.paint();
    }
}

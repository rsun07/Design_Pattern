package SturcturalPattern.FacadePattern;

import StructuralPattern.FacadePattern.Bond;
import StructuralPattern.FacadePattern.Gold;
import StructuralPattern.FacadePattern.Stock;
import StructuralPattern.FacadePattern.Trader;
import org.junit.Test;

public class FacadeTest {
    @Test
    public void test() {
        Trader trader = new Trader(new Stock(), new Bond(), new Gold());
        trader.investBond();
        trader.investBondAndGold();
        trader.investStockAndGold();
        trader.investStockBondAndGold();
    }
}

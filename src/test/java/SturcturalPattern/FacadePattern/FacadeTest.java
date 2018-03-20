package SturcturalPattern.FacadePattern;

import structuralpattern.facadepattern.Bond;
import structuralpattern.facadepattern.Gold;
import structuralpattern.facadepattern.Stock;
import structuralpattern.facadepattern.Trader;
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

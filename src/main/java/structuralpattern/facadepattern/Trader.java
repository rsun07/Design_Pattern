package structuralpattern.facadepattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Trader {
    private Stock stock;
    private Bond bond;
    private Gold gold;

    public void investStock() {
        messageFromTrader();
        stock.trade();
    }

    public void investBond() {
        messageFromTrader();
        bond.trade();
    }

    public void investStockAndBond() {
        messageFromTrader();
        stock.trade();
        bond.trade();
    }

    public void investStockAndGold() {
        messageFromTrader();
        stock.trade();
        gold.trade();
    }

    public void investBondAndGold() {
        messageFromTrader();
        bond.trade();
        gold.trade();
    }

    public void investStockBondAndGold() {
        messageFromTrader();
        stock.trade();
        bond.trade();
        gold.trade();
    }

    private void messageFromTrader() {
        System.out.println("\nInvest via Trader:");
    }
}

package StructuralPattern.FacadePattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Exchange {
    private Stock stock;
    private Bond bond;
    private ETF etf;

    public void investStock() {
        messageFromExchange();
        stock.trade();
    }

    public void investBond() {
        messageFromExchange();
        bond.trade();
    }

    public void investETF() {
        messageFromExchange();
        etf.trade();
    }

    public void investStockAndBond() {
        messageFromExchange();
        stock.trade();
        bond.trade();
    }

    private void messageFromExchange() {
        System.out.println("\nInvest via Exchange:");
    }
}

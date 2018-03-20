package creationpatterns.abstractfactory;

import creationpatterns.abstractfactory.HomeApplianceExample.DepartmentStore.ShoppingMall;
import org.junit.Test;

public class ShoppingMallTest {
    @Test(expected = ClassNotFoundException.class)
    public void test() throws ClassNotFoundException {
        final ShoppingMall BEST_BUY_90025 = ShoppingMall.initShoppingMall();

        try {
            BEST_BUY_90025.purchaseTV("haier");
            BEST_BUY_90025.purchaseTV("gree");
            BEST_BUY_90025.purchaseTV("HTC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

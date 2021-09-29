package L3Task.zKart.zKartManager;

import java.io.FileNotFoundException;
import java.util.Map;

public class DbDriver {

    public static Map getUserList() throws FileNotFoundException {
        return UserSignUp.getMap();
    }
    public static Map getProductList() throws FileNotFoundException {
        return StockManager.getStockList();

    }
}

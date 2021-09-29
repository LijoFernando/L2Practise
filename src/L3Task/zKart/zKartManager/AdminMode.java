package L3Task.zKart.zKartManager;

import java.io.FileNotFoundException;
import java.util.Map;

public class AdminMode {


    public static void checkHigh() throws FileNotFoundException {
        Map stockList = DbDriver.getProductList();
            System.out.println(stockList.entrySet());
    }

}

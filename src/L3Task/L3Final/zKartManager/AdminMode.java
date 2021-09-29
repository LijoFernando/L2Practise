package L3Task.L3Final.zKartManager;

import CustomException.CustomizedException;

import java.util.Map;

public class AdminMode {


    public static void checkHigh() throws CustomizedException {
        Map stockList = DbDriver.getProductList();
        System.out.println(stockList.entrySet());
    }

}

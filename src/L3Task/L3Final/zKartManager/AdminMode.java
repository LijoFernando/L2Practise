package L3Task.L3Final.zKartManager;

import L3Task.L3Final.CustomException.CustomizedException;

import java.util.Map;

public class AdminMode {


    public static void checkHigh() throws CustomizedException {
        Map stockList = DbDriver.getProductList();
        System.out.println(stockList.entrySet());
    }

}

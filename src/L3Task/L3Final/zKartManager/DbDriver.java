package L3Task.L3Final.zKartManager;

import L3Task.L3Final.CustomException.CustomizedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DbDriver {

    public static Map getUserList() throws CustomizedException {
        return UserSignUp.getUsers();
    }
    public static Map getProductList() throws CustomizedException {
        return StockManager.getStockList();
    }
    public static List<String> geProductCategory() throws CustomizedException{
       Set categorys = getProductList().keySet();
        List<String> categoryList = new ArrayList<>(categorys);
        return categoryList;
    }
}

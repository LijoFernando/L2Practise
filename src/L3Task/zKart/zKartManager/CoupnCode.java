package L3Task.zKart.zKartManager;

import L3Task.zKart.Pojo.Transaction;

import java.util.Map;

public class CoupnCode {
    static Map<String, Transaction> billedList = BIling.getTransactlist();

    public static boolean ishevalid(String username) {
        if (billedList.containsKey(username)) {
            Transaction transactions = billedList.get(username);
            int grandTotal = transactions.getTotal();
            if (grandTotal > 20000) {
                return true;
            }
        }
        return false;
    }
}

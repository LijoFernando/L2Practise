package L3Task.L3Final.zKartManager;

import L3Task.L3Final.Pojo.Transaction;

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

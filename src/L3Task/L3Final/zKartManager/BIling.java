package L3Task.L3Final.zKartManager;

import Pojo.Product;
import Pojo.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BIling {

    static Map<String, List<Transaction>> billingList = new HashMap<>();

    public static void billingTransaction(String username, Transaction transaction) {
        List<Product> purchasedProduct = transaction.getListProduct();
        int grandTotal = 0;
        for (int i = 0; i < purchasedProduct.size(); i++) {
            grandTotal += purchasedProduct.get(i).getPrice();
        }
        int invoiceNo = getInvoice();
        transaction.setInvoice(invoiceNo);
        transaction.setTotal(grandTotal);
        if (billingList.containsKey(username)) {
            List<Transaction> transactList = billingList.get(username);
            transactList.add(transaction);
        } else {
            List<Transaction> transactionslist = new ArrayList<>();
            billingList.put(username, transactionslist);
        }

    }

    public static int getInvoice() {
        int invoiceNo = 0;
        invoiceNo = (int) (Math.random() * 1000);
        return invoiceNo;
    }

    public static Map getTransactlist() {
        if (!billingList.isEmpty()) {
            return billingList;
        }
        return null;
    }
}
